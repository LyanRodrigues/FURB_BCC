/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1.Questao4;

import java.util.Scanner;

/**
 *
 * @author liandrar
 */
public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Pessoa[] p = new Pessoa[3];
        
        for (int i = 0; i < 3; i++){
            System.out.println("\n--------------------------------------");
            p[i] = new Pessoa();
            System.out.print("\n>>>Digite o nome da pessoa "+(i+1)+": ");
            p[i].nome = scan.next();
            System.out.print("\n>>>Digite a altura de "+p[i].nome+": ");
            p[i].altura = scan.nextDouble();
            System.out.print("\n>>>Digite o peso de "+p[i].nome+": ");
            p[i].peso = scan.nextDouble();
        }
        for(int j = 2; j >= 0; j--){
            System.out.println("\n--------------------------\n-----<Pessoa "+(j+1)+">-----\n - Nome: "+p[j].nome+"\n - Altura: "+p[j].altura+"\n - Peso: "+p[j].peso+"\n - IMC: "+ p[j].calcularImc());
        }
    }
}
