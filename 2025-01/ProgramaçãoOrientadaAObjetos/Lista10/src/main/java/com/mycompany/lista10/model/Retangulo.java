/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista10.model;

/**
 *
 * @author liandrar
 */
public class Retangulo extends Figura{
    private int largura, altura;

    public Retangulo(int largura, int altura) {
        this.setAltura(altura);
        this.setLargura(largura);
    }
    
    @Override
    public double calcularArea(){
        return this.getLargura() * this.getAltura();
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}
