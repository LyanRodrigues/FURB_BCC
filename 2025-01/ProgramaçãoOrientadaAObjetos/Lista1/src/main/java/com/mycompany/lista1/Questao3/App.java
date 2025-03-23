/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1.Questao3;

import java.util.Scanner;

/**
 *
 * @author liandrar
 */
public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Pessoa[] p = new Pessoa[3];
        
        for(int i = 0;i<3;i++){
            p[i] = new Pessoa();
            System.out.print("\nInsira sua altura: ");
            p[i].altura = scan.nextDouble();
            System.out.print("\nInsira seu peso: ");
            p[i].peso = scan.nextDouble();
        
            System.out.println("\nSeu peso eh: "+ p[i].peso + "\nSua altura eh: "+ p[i].altura+ "\nSeu IMC eh: "+ p[i].calcularImc());
            System.out.println("\n------------------------------------------------");
        }
        
    }
}
