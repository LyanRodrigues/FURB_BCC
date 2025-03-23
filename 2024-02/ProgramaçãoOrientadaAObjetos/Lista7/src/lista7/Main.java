package lista7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Adicionar um Imóvel e calcular IPTU");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consumes the newline after the integer input
            
            switch (option) {
                case 1:
                    // Input for Imovel attributes
                    System.out.print("Digite o endereço do imóvel: ");
                    String endereco = scanner.nextLine();
                    
                    System.out.print("Digite a área do imóvel em m²: ");
                    int area = scanner.nextInt();
                    scanner.nextLine(); // Consumes the newline
                    
                    // Input for Bairro
                    System.out.print("Digite o nome do bairro: ");
                    String nomeBairro = scanner.nextLine();
                    
                    System.out.print("Digite o coeficiente de IPTU do bairro: ");
                    double coeficienteIptu = scanner.nextDouble();
                    scanner.nextLine(); // Consumes the newline

                    Bairro bairro = new Bairro(nomeBairro, coeficienteIptu);
                    
                    // Input for Finalidade
                    System.out.println("Escolha a finalidade do imóvel:");
                    System.out.println("1. Residencial");
                    System.out.println("2. Comercial");
                    System.out.println("3. Industrial");
                    int finalidadeOption = scanner.nextInt();
                    Finalidade finalidade = null;
                    
                    switch (finalidadeOption) {
                        case 1:
                            finalidade = Finalidade.RESIDENCIAL;
                            break;
                        case 2:
                            finalidade = Finalidade.COMERCIAL;
                            break;
                        case 3:
                            finalidade = Finalidade.INDUSTRIAL;
                            break;
                        default:
                            System.out.println("Opção inválida. Finalidade não definida.");
                    }
                    
                    if (finalidade != null) {
                        // Create the Imovel and calculate IPTU
                        Imovel imovel = new Imovel(endereco, area, bairro, finalidade);
                        double iptu = imovel.calcularIptu();
                        System.out.println("O IPTU do imóvel é: " + iptu);
                    }
                    break;
                    
                case 2:
                    System.out.println("Saindo do programa...");
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 2);
        
        scanner.close();
    }
}
