/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaestatica;

/**
 *
 * @author liandrar
 */
public class App {
    public static void main(String[] args) {
        ListaEstatica<String> frutas = new ListaEstatica();
        
        frutas.inserir("massan");
        frutas.inserir("banana");
        
        frutas.exibir();
    }
}
