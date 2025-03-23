package Aula.ListaExercicios1.Questao3;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class Funcionario {

    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salaraio) {
        if (salaraio < 0) {
            throw new IllegalArgumentException("Salário inválido!");
        }
        this.salario = salaraio;
    }
    
    public double calcularIrpf() {
        double imposto = 0;
        double diferenca = 0;
        
        if (salario > 1903.98) {
            if (salario <= 2826.65) { // 2ª Faixa
                diferenca = salario - 1903.98;
                imposto = diferenca * (7.5/100.0);
            } else if (salario <= 3751.05) { // 3ª Faixa
                diferenca = 2826.65 - 1903.98;
                imposto = diferenca * (7.5/100.0);
                
                diferenca = salario - 2826.65;
                imposto += (diferenca * (15.0/100.0));
            } else if (salario <= 4664.68) { // 4ª faixa
                // Calcula o imposto da 2ª faixa.
                diferenca = 2826.65 - 1903.98;
                imposto = diferenca * (7.5/100.0);
                
                // Calcula o imposto da 3ª faixa.
                diferenca = 3751.05 - 2826.65;
                imposto += (diferenca * (15.0/100.0));
                
                // Calcula o imposto da 4ª faixa.
                diferenca = salario - 3751.05;
                imposto += (diferenca * (22.5/100.0));
            } else { // 5ª faixa.
                // Calcula o imposto da 2ª faixa.
                diferenca = 2826.65 - 1903.98;
                imposto = diferenca * (7.5/100.0);
                
                // Calcula o imposto da 3ª faixa.
                diferenca = 3751.05 - 2826.65;
                imposto += (diferenca * (15.0/100.0));
                
                // Calcula o imposto da 4ª faixa.
                diferenca = 4664.68 - 3751.05;
                imposto += (diferenca * (22.5/100.0));
                
                // Calcula o imposto da 5ª faixa.
                diferenca = salario - 4664.68;
                imposto += (diferenca * (27.5/100.0));
            }
        }
        
        return imposto;
    }
}
