import java.util.InputMismatchException;
import java.util.Scanner;


public class TesteListaEstatica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEstatica<Integer> lista = new ListaEstatica<>();

        System.out.println("============================================");
        System.out.println("=========== Lista Estática =================");
        System.out.println("============================================");

        // Menu
        while (true) {
            System.out.println("\n============== Menu =======================");
            System.out.println("1. Inserir valores na lista");
            System.out.println("2. Buscar valor na lista");
            System.out.println("3. Retirar valor da lista");
            System.out.println("4. Verificar se a lista está vazia");
            System.out.println("5. Exibir lista");
            System.out.println("6. Liberar lista");
            System.out.println("7. Inverter lista");
            System.out.println("8. Sair");
            System.out.println("============================================");
            System.out.print("Escolha uma opção: ");

            try {
                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        // Inserir valores na lista
                        System.out.println("\n=========== Inserir valores na lista ============");
                        System.out.println("Insira os valores na lista (digite -1 para encerrar a entrada):");
                        int valor;
                        int posicao = 0;
                        while (true) {
                            try {
                                System.out.print("Valor na posição " + posicao + ": ");
                                valor = scanner.nextInt();
                                if (valor == -1) {
                                    break;
                                }
                                lista.inserir(valor);
                                posicao++;
                            } catch (InputMismatchException e) {
                                System.out.println(
                                        "Entrada inválida. Por favor, insira um número inteiro de até 10 digitos.");
                                scanner.next(); // Clear the invalid input
                            }
                        }
                        break;

                    case 2:
                        // Buscar valor na lista
                        System.out.println("\n=========== Buscar valor na lista ==============");
                        try {
                            System.out.print("Digite o valor a ser buscado na lista: ");
                            int valorBuscar = scanner.nextInt();
                            int posicaoBuscar = lista.buscar(valorBuscar);
                            if (posicaoBuscar != -1) {
                                System.out.println(
                                        "O valor " + valorBuscar + " está na posição " + posicaoBuscar + " da lista.");
                            } else {
                                System.out.println("O valor " + valorBuscar + " não foi encontrado na lista.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                            scanner.next(); // Clear the invalid input
                        }
                        break;

                    case 3:
                        // Retirar valor da lista
                        System.out.println("\n=========== Retirar valor da lista =============");
                        System.out.print("Digite o valor a ser retirado da lista: ");
                        int valorRetirar = scanner.nextInt();
                        int posicaoRetirar = lista.buscar(valorRetirar);
                        if (posicaoRetirar != -1) {
                            System.out.println("\n============================================");
                            System.out.println(
                                    "Tem certeza de que deseja retirar o valor " + valorRetirar + " da lista?");
                            System.out.println("============================================");
                            System.out.println("Digite 's' para confirmar ou 'n' para cancelar:");
                            System.out.println("============================================");
                            System.out.print("Sua escolha: ");
                            char confirmacaoRetirada = scanner.next().charAt(0);
                            System.out.println("============================================");
                            if (confirmacaoRetirada == 's' || confirmacaoRetirada == 'S') {
                                lista.retirar(valorRetirar);
                                System.out.println("O valor " + valorRetirar + " foi retirado da lista.");
                            } else {
                                System.out.println("Operação cancelada.");
                            }
                        } else {
                            System.out.println("O valor " + valorRetirar + " não está presente na lista.");
                        }
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
                        System.out.println("Elementos da lista:");
                        System.out.println("[" + lista.toString() + "]");
                        break;
                    case 6:
                        // Liberar lista
                        System.out.println("\n============== Liberar lista ====================");
                        if (lista.estaVazia()) {
                            System.out.println("A lista já está vazia.");
                        } else {
                            System.out.println("\n============================================");
                            System.out.println("Tem certeza de que deseja liberar a lista?");
                            System.out.println("============================================");
                            System.out.println("Digite 's' para confirmar ou 'n' para cancelar:");
                            System.out.println("============================================");
                            System.out.print("Sua escolha: ");
                            char confirmacaoLiberacao = scanner.next().charAt(0);
                            System.out.println("============================================");
                            if (confirmacaoLiberacao == 's' || confirmacaoLiberacao == 'S') {
                                lista.liberar();
                                System.out.println("A lista foi liberada.");
                            } else {
                                System.out.println("Operação cancelada.");
                            }
                        }
                        break;
                    case 7:
                        // Inverter lista
                        System.out.println("\n=========== Inverter lista ======================");
                        if (!lista.estaVazia()) {
                            lista.inverter();
                            System.out.println("Lista invertida com sucesso.");
                        } else {
                            System.out.println("Não é possível inverter a lista porque ela está vazia.");
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
                System.out.println(
                        "Entrada inválida. Por favor, insira um número inteiro correspondente à opção do menu.");
                scanner.next(); // Clear the invalid input
            }
        }
    }

    
}
