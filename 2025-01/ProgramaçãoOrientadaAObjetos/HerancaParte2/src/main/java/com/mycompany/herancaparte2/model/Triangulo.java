/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancaparte2.model;

/**
 *
 * @author liandrar
 */
public class Triangulo extends Figura {
    private int lado;

    public Triangulo(int lado) {
        setLado(lado);
    }
    
    public String desenhar(){
        return "Triangulo";
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
