/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova3.model;

/**
 *
 * @author liandrar
 */
public class AtletaVolei extends Atleta {
    private double saque;
    private double bloqueio;
    private double ataque;

    public AtletaVolei(double saque, double bloqueio, double ataque, String nome, int idade) {
        super(nome, idade);
        setAtaque(ataque);
        setBloqueio(bloqueio);
        setSaque(saque);
    }

    @Override
    public float calcularDesempenho(){
        return (float) ((saque * bloqueio) + ataque);
    }
    
    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        if (saque <= 0) {
            throw new IllegalArgumentException("Saque inválida. Saque deve ser maior que zero");
        }
        this.saque = saque;
    }

    public double getBloqueio() {
        return bloqueio;
    }

    public void setBloqueio(double bloqueio) {
        if (bloqueio <= 0) {
            throw new IllegalArgumentException("bloqueio inválida. bloqueio deve ser maior que zero");
        }
        this.bloqueio = bloqueio;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        if (ataque <= 0) {
            throw new IllegalArgumentException("ataque inválida. ataque deve ser maior que zero");
        }
        this.ataque = ataque;
    }
    
    
}
