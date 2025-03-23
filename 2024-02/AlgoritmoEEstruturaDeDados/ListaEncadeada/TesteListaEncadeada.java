import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteListaEncadeada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        System.out.println("============================================");
        System.out.println("=========== Lista Encadeada ================");
        System.out.println("============================================");

        // Menu
        while (true) {
            System.out.println("\n============== Menu =======================");
            System.out.println("1. Inserir valor na lista");
            System.out.println("2. Buscar valor na lista");
            System.out.println("3. Retirar valor da lista");
            System.out.println("4. Verificar se a lista está vazia");
            System.out.println("5. Exibir lista");
            System.out.println("6. Obter comprimento da lista");
            System.out.println("7. Obter nó em uma posição específica");
            System.out.println("8. Sair");
            System.out.println("============================================");
            System.out.print("Escolha uma opção: ");

            try {
                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        // Inserir valores na lista
                        System.out.println("\n=========== Inserir valor na lista ============");
                        System.out.print("Digite o valor a ser inserido: ");
                        int valorInserir = scanner.nextInt();
                        lista.inserir(valorInserir);
                        System.out.println("Valor " + valorInserir + " inserido na lista.");
                        break;

                    case 2:
                        // Buscar valor na lista
                        System.out.println("\n=========== Buscar valor na lista ==============");
                        System.out.print("Digite o valor a ser buscado na lista: ");
                        int valorBuscar = scanner.nextInt();
                        NoLista<Integer> noEncontrado = lista.buscar(valorBuscar);
                        if (noEncontrado != null) {
                            System.out.println("Valor " + valorBuscar + " encontrado na lista.");
                        } else {
                            System.out.println("Valor " + valorBuscar + " não encontrado na lista.");
                        }
                        break;

                    case 3:
                        // Retirar valor da lista
                        System.out.println("\n=========== Retirar valor da lista =============");
                        System.out.print("Digite o valor a ser retirado da lista: ");
                        int valorRetirar = scanner.nextInt();
                        lista.retirar(valorRetirar);
                        System.out.println("Valor " + valorRetirar + " retirado da lista.");
                        break;

                    case 4:
                        // Verificar se a lista está vazia
                        System.out.println("\n========== Verificar se a lista está vazia ========");
                        if (lista.estaVazia()) {
                            System.out.println("A lista está vazia.");
                        } else {
                            System.out.println("A lista não está vazia.");
                        }
                        break;

                    case 5:
                        // Exibir lista
                        System.out.println("\n============== Exibir lista ====================");
                        System.out.println("Elementos da lista: " + lista.toString());
                        break;

                    case 6:
                        // Obter comprimento da lista
                        System.out.println("\n=========== Obter comprimento da lista ==========");
                        int comprimento = lista.obterComprimento();
                        System.out.println("Comprimento da lista: " + comprimento);
                        break;

                    case 7:
                        // Obter nó em uma posição específica
                        System.out.println("\n====== Obter nó em uma posição específica =======");
                        System.out.print("Digite a posição do nó: ");
                        try {
                            int posicao = scanner.nextInt();
                            NoLista<Integer> noNaPosicao = (NoLista<Integer>) lista.obterNo(posicao);
                            System.out.println("Nó na posição " + posicao + ": " + noNaPosicao.getInfo());
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Posição inválida: " + e.getMessage());
                        }
                        break;

                    case 8:
                        // Sair do programa
                        System.out.println("\nEncerrando o programa...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("\nOpção inválida. Por favor, escolha uma opção válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro correspondente à opção do menu.");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}
