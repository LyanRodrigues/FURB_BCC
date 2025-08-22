/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaestatica;

/**
 *
 * @author liandrar
 */
public class Exemplo {
    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica();
        lista.inserir("Laranja");
        lista.inserir(666);
        lista.inserir("A");
        
        if (lista.buscar(77) >= 0){
            System.out.println("Achei");
        }
        
        System.out.println(lista.getTamanho());
        
        for (int i = 0; i< lista.getTamanho();i++){
            System.out.println("O " + i + "º elemento é "+ lista.obterElemento(i));
        }
    }
}
