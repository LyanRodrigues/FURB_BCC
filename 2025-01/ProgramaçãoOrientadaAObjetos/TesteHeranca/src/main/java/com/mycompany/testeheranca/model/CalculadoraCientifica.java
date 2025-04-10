/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeheranca.model;

/**
 *
 * @author liandrar
 */
public class CalculadoraCientifica extends Calculadora{
    public double potencia(double valor, double potencia){
        setMemoria(Math.pow(valor, potencia));
        return getMemoria();
    }
    public double raizQuadrada(double valor){
        setMemoria(Math.sqrt(valor));
        return getMemoria();
    };
}
