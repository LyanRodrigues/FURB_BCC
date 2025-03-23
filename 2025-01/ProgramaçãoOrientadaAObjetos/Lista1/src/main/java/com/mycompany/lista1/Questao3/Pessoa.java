/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1.Questao3;

/**
 *
 * @author liandrar
 */
public class Pessoa {
    double altura;
    double peso;
    
    double calcularImc(){
        return peso/(altura*altura);
    }
}
