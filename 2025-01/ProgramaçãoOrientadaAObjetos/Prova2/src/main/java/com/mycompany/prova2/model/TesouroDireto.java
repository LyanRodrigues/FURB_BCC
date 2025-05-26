/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova2.model;

/**
 *
 * @author liandrar
 */
public class TesouroDireto implements Ativo {
    private double valor;
    private double rentabilidade;

    public TesouroDireto(double valor, double rentabilidade) {
        this.valor = valor;
        this.rentabilidade = rentabilidade;
    }
    
    @Override
    public double calcularRendimento(){
        return valor * (rentabilidade/100);
    }
    
    @Override
    public double calcularValorInvestido(){
        return valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        try {
            if (valor <= 0) {
                throw new IllegalArgumentException();
            } else {
                this.valor = valor;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Valor para o campo valor está incorreto");
        }
    }

    public double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(double rentabilidade) {
        try {
            if (rentabilidade <= 0) {
                throw new IllegalArgumentException();
            } else {
                this.rentabilidade = rentabilidade;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Valor para o campo rentabilidade está incorreto");
        }
    }
    
}
