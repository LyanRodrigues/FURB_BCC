/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1.Questao2;

import java.util.Scanner;

/**
 *
 * @author liandrar
 */
public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        System.out.print("\n-------------------- ");
        System.out.print("\nInsira sua altura: ");
        p1.altura = scan.nextDouble();
        System.out.print("\nInsira seu peso: ");
        p1.peso = scan.nextDouble();
        System.out.print("\n-------------------- ");
        System.out.println("\nAltura: "+ p1.altura + "\nPeso: "+p1.peso+"\nIMC: "+p1.calcularImc());

    }
}
