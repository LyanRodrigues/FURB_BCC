/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demoteste.model;

/**
 *
 * @author liandrar
 */
public class Calculadora {
    public int somarInteiro(int a, int b){
        return a + b;
    }
    public float somarFloat(float a, float b){
        return a + b;
    }
    public float dividir(float a, float b){
        if (b == 0){
            throw new IllegalArgumentException("Divisão por zero");
        }
        return a / b;
    }
}
