/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova2.model;

/**
 *
 * @author liandrar
 */
public class Acao implements Ativo {

    private int qtdCota;
    private double valorCota;
    private double dividendo;

    public Acao(int qtdCota, double valorCota, double dividendo) {
        this.setQtdCota(qtdCota);
        this.setValorCota(valorCota);
        this.setDividendo(dividendo);
    }

    @Override
    public double calcularRendimento() {
        return qtdCota * dividendo;
    }

    @Override
    public double calcularValorInvestido() {
        return qtdCota * valorCota;
    }

    public int getQtdCota() {
        return qtdCota;
    }

    public void setQtdCota(int qtdCota) {
        try {
            if (qtdCota <= 0) {
                throw new IllegalArgumentException();
            } else {
                this.qtdCota = qtdCota;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Valor para o campo qtdCota está incorreto");
        }
    }

    public double getValorCota() {
        return valorCota;
    }

    public void setValorCota(double valorCota) {
        try {
            if (valorCota <= 0) {
                throw new IllegalArgumentException();
            } else {
                this.valorCota = valorCota;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Valor para o campo valorCota está incorreto");
        }
    }

    public double getDividendo() {
        return dividendo;
    }

    public void setDividendo(double dividendo) {
        try {
            if (dividendo <= 0) {
                throw new IllegalArgumentException();
            } else {
                this.dividendo = dividendo;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Valor para o campo dividendo está incorreto");
        }
    }

}
