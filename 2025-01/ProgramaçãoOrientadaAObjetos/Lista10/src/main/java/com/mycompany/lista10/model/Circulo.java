/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista10.model;

/**
 *
 * @author liandrar
 */
public class Circulo extends Figura {
    private int raio;

    public Circulo(int raio) {
        this.setRaio(raio);
    }
    
    @Override
    public double calcularArea(){
        return Math.PI * (getRaio() * getRaio());
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    
}
