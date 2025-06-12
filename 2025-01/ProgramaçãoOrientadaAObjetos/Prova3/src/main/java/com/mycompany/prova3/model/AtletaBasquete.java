/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova3.model;

/**
 *
 * @author liandrar
 */
public class AtletaBasquete extends Atleta{
    private int pontos;
    private int rebotes;

    public AtletaBasquete(int pontos, int rebotes, String nome, int idade) {
        super(nome, idade);
        setPontos(pontos);
        setRebotes(rebotes);
    }

    @Override
    public float calcularDesempenho(){
        return (float) (pontos + (rebotes * 3.5));
    }
    
    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        if (pontos <= 0) {
            throw new IllegalArgumentException("pontos inválidos. pontos deve ser maior que zero");
        }
        this.pontos = pontos;
    }

    public int getRebotes() {
        return rebotes;
    }

    public void setRebotes(int rebotes) {
        if (rebotes <= 0) {
            throw new IllegalArgumentException("rebotes inválidos. rebotes deve ser maior que zero");
        }
        this.rebotes = rebotes;
    }
    
    
}
