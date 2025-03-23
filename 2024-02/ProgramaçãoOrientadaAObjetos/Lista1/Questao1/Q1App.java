

public class Q1App {
    public static void main(String[] args) {
        Pessoa Oliver = new Pessoa();
        Oliver.altura = 1.60;
        Oliver.peso = 90;

        System.out.println("O IMC calculado é: " + Oliver.calcularIMC());
    }
}
