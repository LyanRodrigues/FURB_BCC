import java.util.Scanner;

public class Q2App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.print("informe a altura: ");
        pessoa.altura = teclado.nextDouble();

        System.out.print("Informe o peso: ");
        pessoa.peso = teclado.nextDouble();

        System.out.println("O IMC calculado é: " + pessoa.calcularIMC()
        + "\nA altura é: " + pessoa.altura + "\nO peso é: " + pessoa.peso);
        teclado.close();
    }
}
