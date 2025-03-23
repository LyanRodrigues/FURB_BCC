
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author liandrar
 */
public class PilhaVetor<T> {

    private Object info[];
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite) {
        info = (T[]) new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
    }

    public void push(T info) {

    }

    public Object[] getInfo() {
        return info;
    }

    public void setInfo(Object[] info) {
        this.info = info;
    }

    public int getLimite() {
        return limite;
    }

     public void setLimite(int limite) throws Exception {
        if (limite <= 0) {
            throw new Exception("------------------------------------\n!!Limite deve ser maior que zero!!\n------------------------------------");
        }
        if (limite > 1000000) { // Limite máximo para evitar OutOfMemoryError
            throw new Exception("------------------------------------\n!!Limite muito grande!!\n------------------------------------");
        }
        this.limite = limite;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public T pop() {
        return null;
    }

    public T peek() {
        return null;
    }

    public boolean estaVazia() {
        return false;
    }

    public void liberar() {

    }

    public String toString() {
        return null;
    }

    public void concatenar(PilhaVetor<T> p) {

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicialmente, definimos um limite padrão
        PilhaVetor<Integer> vector = new PilhaVetor<>(10); // Limite inicial

        // Solicitar o limite inicial e definir o limite da pilha
        while (true) {
            try {
                System.out.print("Digite o limite inicial da pilha (deve ser maior que zero): ");
                String input = scanner.nextLine();
                
                // Verifica se a entrada é um número inteiro válido
                int limiteInicial;
                try {
                    limiteInicial = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("\033[1;31m------------------------------------\nxxXX!!Entrada inválida. Por favor, digite um número inteiro!!XXxx\n------------------------------------\033[0m");
                    continue;
                }

                // Tenta definir o limite
                try {
                    vector.setLimite(limiteInicial);
                    System.out.println("Pilha criada com sucesso com limite: " + vector.getLimite());
                    break; // Sai do loop se o limite for definido com sucesso
                } catch (Exception e) {
                    System.out.println("\033[1;31m" + e.getMessage() + "\033[0m"); // Mensagem de erro colorida
                }

            } catch (Exception e) {
                System.out.println("\033[1;31mOcorreu uma exceção: " + e.getMessage() + "\033[0m"); // Mensagem de exceção colorida
            }
        }

        scanner.close(); // Fechar o scanner
    }
}
