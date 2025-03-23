package Aula.Questao2;

public class ListaEstatica<T> {
    private Object[] info;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public ListaEstatica() {
        this.info = (T[]) new Object[10]; // Use of unchecked cast
        this.tamanho = 0;
    }

    private void redimensionar() {
        @SuppressWarnings("unchecked")
        T[] novoVetor = (T[]) new Object[info.length + 10]; // Use generic type
        System.arraycopy(info, 0, novoVetor, 0, info.length);
        info = novoVetor;
    }

    public void inserir(T valor) {
        if (tamanho == info.length) {
            redimensionar();
        }
        info[tamanho] = valor;
        tamanho++;
    }

    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(info[i]);
        }
    }

    public int buscar(T valor) {
        for (int i = 0; i < tamanho; i++) {
            if (info[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }

    public void retirar(T valor) {
        for (int i = 0; i < tamanho; i++) {
            if (info[i].equals(valor)) {
                for (int x = i; x < tamanho - 1; x++) {
                    info[x] = info[x + 1];
                }
                info[tamanho - 1] = null; // Avoid memory leak
                tamanho--;
                break;
            }
        }
    }

    @SuppressWarnings("unchecked")
    public void liberar() {
        info = (T[]) new Object[10];
        tamanho = 0;
    }

    public Object obterElemento(int posicao) {
        if (posicao >= 0 && posicao < tamanho) {
            return info[posicao];
        }
        throw new IndexOutOfBoundsException("Posição inválida!");
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        StringBuilder mensagem = new StringBuilder();
    
        if (tamanho > 0) {
            mensagem.append(info[0].toString()); // Ensure first element is correctly converted to string
            for (int i = 1; i < tamanho; i++) {
            mensagem.append(", ").append(info[i].toString()); // Explicitly call toString for each element
            }
        }
    
        return mensagem.toString();
    }

    public void inverter() {
		for (int i = 0; i < tamanho / 2; i++) {
			Object temp = info[i];
			info[i] = info[tamanho - 1 - i];
			info[tamanho - 1 - i] = temp;
		}
	}
}
