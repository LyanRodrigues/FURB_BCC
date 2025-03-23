package Aula.Lista2.Questao2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);

        ContaBancaria[] contas = new ContaBancaria[2];
        
        
        for(int i = 0; i < 2; i++){
            contas[i] = new ContaBancaria();
            System.out.print("Informe o numero da conta: ");
            contas[i].setNumero(tec.nextLine());
            System.out.print("\nInforme o titular da conta: ");
            contas[i].setTitular(tec.nextLine());
        }

        contas[0].depositar(1000);
        contas[0].depositar(700);

        contas[1].depositar(5000);
        contas[1].sacar(3000);

        contas[1].transferir(contas[0], 1800);

        for (int i = 0; i < 2; i++){
            System.out.println("Titular: "+ contas[i].getTitular()
            +"\nSaldo: "+ contas[i].getSaldo());
        }
        tec.close();

    }
}
