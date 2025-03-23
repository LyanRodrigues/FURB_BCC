/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabancaria;

/**
 *
 * @author liandrar
 */
public class App {
    public static void main (String args[]){
        ContaBancaria c1, c2;
        c1 = new ContaBancaria();
        c1.setNumero("122234-1");
        c1.setTitular("Jose Carlos");
        
        c2 = new ContaBancaria();
        c2.setNumero("2233442-2");
        c2.setTitular("Robertinho");
        
        c1.depositar(1000);
        c1.depositar(700);
        
        c2.depositar(5000);
        
        c2.sacar(3000);
        c2.transferir(c1, 1800);
        
        System.out.println("Titular da conta 1: \nTitular: "
                + c1.getTitular()
                +"\nSaldo: "
                +c1.getSaldo());
        
        System.out.println("Titular da conta 2: \nTitular: "
                + c2.getTitular()
                +"\nSaldo: "
                +c2.getSaldo());
    }
}
