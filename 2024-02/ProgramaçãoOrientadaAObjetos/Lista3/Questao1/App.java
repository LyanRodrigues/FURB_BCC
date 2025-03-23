package Aula.ListaExercicios1.Questao3;

import java.util.Scanner;

/**
 *
 * @author André Felipe Bürger (afburger@furb.br)
 */
public class App {

    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[3];
        
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < funcionarios.length; i++) {
            Funcionario funcionario = new Funcionario();
            
            System.out.println("Informe o nome do funcionário:");
            funcionario.setNome(teclado.next());
            
            System.out.println("Informe o salário do funcionário:");
            funcionario.setSalario(teclado.nextDouble());
            
            funcionarios[i] = funcionario;
        }
        
        for (int i = 0; i < funcionarios.length; i++) {
            Funcionario funcionario = funcionarios[i];
            System.out.println("Nome: " + funcionario.getNome() + ", salário: " + funcionario.getSalario() + " IRPF: " + funcionario.calcularIrpf());
        }
        
        teclado.close();
    }
}