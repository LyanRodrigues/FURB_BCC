/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancaparte2.model;

/**
 *
 * @author liandrar
 */
public class Circulo extends Figura{
    private double raio;
    
    public Circulo(double raio){
        setRaio(raio);
    }
    
    public String desenhar(){
        return "Desenho de circulo";
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    
}
