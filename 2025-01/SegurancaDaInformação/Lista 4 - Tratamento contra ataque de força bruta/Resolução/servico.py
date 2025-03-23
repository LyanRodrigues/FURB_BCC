# Autores: Thomas Leon Rodrigues e Lucas de Antoni Santos
""" 
--- Bloqueio Temporário de Contas: Após 3 tentativas falhas consecutivas, bloquear o login do usuário por 5 minutos.
--- Atraso Progressivo: Aumentar o tempo de resposta a cada tentativa falha (exemplo: 2s, 4s, 8s...).
--- Autenticação de Dois Fatores (2FA): Após o login, exigir um código enviado por e-mail.

"""
from fastapi import FastAPI, Depends, HTTPException, status
from sqlalchemy import Column, Integer, String, create_engine
from sqlalchemy.orm import sessionmaker, Session, declarative_base

#-------------------
# Importação
import time
from sqlalchemy.exc import IntegrityError  # <-- Importando o IntegrityError
from typing import Dict
import random
import smtplib
from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart

#-------------------
# Contador de tentativas de login e bloqueio
# 'login_failures' armazena o número de falhas consecutivas de login por usuário.
# 'blocked_users' armazena os usuários que estão bloqueados e o momento até o qual estão bloqueados.
login_failures = {}
blocked_users = {}
#-------------------
# Configuração do banco de dados
# Definição da URL de conexão do banco de dados (SQLite no caso)
DATABASE_URL = "sqlite:///./users.db"
# Criação do engine SQLAlchemy para conectar ao banco de dados
engine = create_engine(DATABASE_URL, connect_args={"check_same_thread": False})
# SessionLocal configura a forma de criar sessões para acessar o banco de dados
SessionLocal = sessionmaker(autocommit=False, autoflush=False, bind=engine)
# Base é a classe base usada para definir os modelos de dados
Base = declarative_base()

# Modelo de Usuário
# A classe 'User' define a tabela 'users' no banco de dados
class User(Base):
    __tablename__ = "users"  # Nome da tabela no banco de dados
    id = Column(Integer, primary_key=True, index=True)  # Coluna ID, chave primária
    username = Column(String, unique=True, index=True)  # Nome de usuário único
    password = Column(String)  # Senha do usuário
    email = Column(String)  # E-mail do usuário

# Instancia o aplicativo FastAPI
app = FastAPI()

# Função para obter a sessão do banco de dados
# Essa função cria e gerencia o ciclo de vida da sessão do banco de dados
def get_db():
    db = SessionLocal()  # Criação de uma nova sessão
    try:
        yield db  # Retorna a sessão para uso nas rotas
    finally:
        db.close()  # Fecha a sessão depois de terminar a operação

# Banco de dados de códigos 2FA temporários
two_factor_codes = {}

# Função para enviar o código 2FA por e-mail
def send_2fa_email(user_email: str, code: int):
    """
    Função para enviar um código de 2FA por e-mail.
    """
    sender_email = "exemplo@gmail.com" 
    sender_password = "exemplo"  
    receiver_email = user_email  # E-mail do usuário (destinatário)

    # Configura o conteúdo do e-mail
    subject = "Seu código de autenticação de dois fatores (2FA)"
    body = f"Seu código de 2FA é: {code}. Utilize esse código para completar o login."
    
    # Configura o e-mail MIME
    msg = MIMEMultipart()
    msg['From'] = sender_email
    msg['To'] = receiver_email
    msg['Subject'] = subject
    msg.attach(MIMEText(body, 'plain'))
    
    # Conecta ao servidor SMTP e envia o e-mail
    try:
        with smtplib.SMTP('smtp.gmail.com', 587) as server:
            server.starttls()  # Conecta-se de forma segura
            server.login(sender_email, sender_password)  # Faz login no servidor de e-mail
            text = msg.as_string()  # Converte a mensagem para formato de string
            server.sendmail(sender_email, receiver_email, text)  # Envia o e-mail
    except Exception as e:
        raise HTTPException(status_code=status.HTTP_500_INTERNAL_SERVER_ERROR, detail=f"Erro ao enviar e-mail: {e}")

#-------------------
# Função de registro de usuário
@app.post("/register/")
def register_user(username: str, email: str, password: str, db: Session = Depends(get_db)):
    """
    Função para registrar um novo usuário no banco de dados.
    
    Parâmetros:
    - username: Nome de usuário.
    - email: Endereço de e-mail do usuário.
    - password: Senha do usuário.
    
    Retorno:
    - message: Mensagem indicando que o usuário foi registrado com sucesso.
    
    Levanta exceção HTTP 400 caso o nome de usuário já exista.
    """
    user = User(username=username, email=email, password=password)  # Criação do novo usuário
    db.add(user)  # Adiciona o usuário à sessão do banco
    try:
        db.commit()  # Confirma a transação no banco de dados
    except IntegrityError:
        db.rollback()  # Reverte a transação se houver erro de integridade (ex: nome de usuário duplicado)
        raise HTTPException(status_code=400, detail="Nome de usuário já existe.")
    db.refresh(user)  # Atualiza a instância do usuário com os dados do banco
    return {"message": "Usuário registrado com sucesso!"}

#-------------------
# Função de login com bloqueio após 3 falhas consecutivas e verificação de 2FA
@app.post("/login/")
def login(username: str, password: str, db: Session = Depends(get_db)):
    """
    Função para realizar o login de um usuário, com bloqueio após 3 tentativas falhas consecutivas e com envio de código 2FA por e-mail.
    
    Parâmetros:
    - username: Nome de usuário.
    - password: Senha do usuário.
    
    Levanta exceção HTTP 401 se as credenciais forem inválidas e HTTP 403 se a conta estiver bloqueada.
    """
    now = time.time()  # Obtém o horário atual em segundos desde a "época"

    # Verifica se o usuário está bloqueado
    if username in blocked_users:
        blocked_until = blocked_users[username]  # Obtém o horário até o qual o usuário está bloqueado
        if now < blocked_until:
             # Calcula o tempo restante do bloqueio
            remaining_time = blocked_until - now
            raise HTTPException(
                status_code=status.HTTP_403_FORBIDDEN, 
                detail=f"Conta bloqueada. Tente novamente em {int(remaining_time)} segundos."
            )
        else:
            # Desbloqueia o usuário depois do tempo de bloqueio
            del blocked_users[username]

    # Recupera o número de falhas anteriores (ou 0 se o usuário nunca falhou)
    failures = login_failures.get(username, 0)

    # Atraso progressivo: 2s por tentativa (ex: 2, 4, 6...)
    delay = failures * 2
    if delay > 0:
        time.sleep(delay)  # Aguarda o tempo de atraso progressivo

    # Tenta fazer login verificando se o nome de usuário e a senha correspondem
    user = db.query(User).filter(User.username == username, User.password == password).first()
    if not user:
        # Falhou: registra tentativa e verifica se atingiu o limite de falhas
        login_failures[username] = failures + 1
        if failures + 1 >= 3:
            # Se atingiu 3 falhas consecutivas, bloqueia por 5 minutos (300 segundos)
            blocked_users[username] = now + 300  # 300 segundos = 5 minutos
        raise HTTPException(
            status_code=status.HTTP_401_UNAUTHORIZED, 
            detail=f"Credenciais inválidas. Tentativas restantes: {3 - (failures + 1)}"
        )
    # Gerar um código de 2FA
    code = random.randint(100000, 999999)  # Código de 6 dígitos
    
    # Armazena o código temporariamente
    two_factor_codes[username] = {"code": code, "timestamp": time.time()}
    
    # Envia o código por e-mail
    send_2fa_email(user.email, code)

    return {"message": f"Código de 2FA enviado para o e-mail {user.email}. Insira-o para concluir o login."}

# Função para verificar o código de 2FA
@app.post("/verify_2fa/")
def verify_2fa(username: str, code: int):
    """
    Função para verificar o código de 2FA enviado por e-mail.
    """
    if username not in two_factor_codes:
        raise HTTPException(status_code=status.HTTP_400_BAD_REQUEST, detail="Código de 2FA expirado ou inválido")
    
    stored_code = two_factor_codes[username]["code"]
    stored_timestamp = two_factor_codes[username]["timestamp"]
    
    # Verifica se o código é válido (considerando um tempo de validade de 5 minutos)
    if code != stored_code:
        raise HTTPException(status_code=status.HTTP_400_BAD_REQUEST, detail="Código incorreto")
    
    if time.time() - stored_timestamp > 300:  # 5 minutos
        del two_factor_codes[username]  # Expira o código após 5 minutos
        raise HTTPException(status_code=status.HTTP_400_BAD_REQUEST, detail="Código expirado")
    
    # Se o código estiver correto, remove o código do banco de dados temporário
    del two_factor_codes[username]
     # Sucesso: limpa o contador de falhas
    login_failures.pop(username, None)
    return {"message": "Autenticação de dois fatores bem-sucedida!"}
    return {"message": "Login realizado com sucesso!"}
