/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1.Questao1;

/**
 *
 * @author liandrar
 */
public class App {
    public static void main(String[] args){
            Pessoa p1 = new Pessoa();
            p1.altura = 1.75;
            p1.peso = 75;
            
            System.out.println("Altura: "+ p1.altura + "\nPeso: "+p1.peso+"\nIMC: "+p1.calcularImc());
    }
}
