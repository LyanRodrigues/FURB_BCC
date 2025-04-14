/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancaparte2.model;

/**
 *
 * @author liandrar
 */
public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo(1);
        figuras[1] = new Triangulo(2);
        figuras[2] = new Quadrado(3);
        
        Figura f = new Circulo(1);
        Circulo c = (Circulo) f;
        
        
        
        for(Figura figura: figuras){
            System.out.println(figura.desenhar());
                                     
                    
                    
        }
    }
}
