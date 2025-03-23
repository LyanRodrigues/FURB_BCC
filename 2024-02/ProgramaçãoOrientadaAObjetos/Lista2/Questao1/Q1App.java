package Aula.Lista2.Questao1;

import java.util.Scanner;

public class Q1App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[3];

        for (int i = 0; i < 3; i++) {
            pessoas[i] = new Pessoa(null, i, i); 

            System.out.println("Informe o nome da pessoa número " + (i + 1) + ": ");
            pessoas[i].setNome(teclado.nextLine());

            System.out.print("Informe a altura de " + pessoas[i].getNome() + ": ");
            pessoas[i].setAltura(teclado.nextDouble());
            
            
            if (pessoas[i].getAltura() <= 0) {
                System.out.println("ATENÇÃO: Altura deve ser maior que zero.");
                i--; 
                teclado.nextLine(); 
                continue;
            } else if (pessoas[i].getAltura() > 3) {
                System.out.println("ATENÇÃO: Altura não pode ser mais de 3 metros.");
                i--; 
                teclado.nextLine(); 
                continue;
            }

            System.out.print("Informe o peso de " + pessoas[i].getNome() + ": ");
            pessoas[i].setPeso(teclado.nextDouble());
            teclado.nextLine(); 

        } for (int i = 2; i >= 0; i--){
            System.out.println("------------------------\n"+"O IMC de " + pessoas[i].getNome() + " é: " + pessoas[i].calcularIMC()
        + "\nA altura de " + pessoas[i].getNome() + " é: " + pessoas[i].getAltura()
        + "\nO peso de " + pessoas[i].getNome() + " é: " + pessoas[i].getPeso());
        }    

        teclado.close();
    }
}
