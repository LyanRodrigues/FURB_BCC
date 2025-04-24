/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista10b.model;

import java.util.ArrayList;

/**
 *
 * @author liandrar
 */
public class Vendedor extends Funcionario {
    private double percentualComissao;
    private ArrayList<Venda> vendas = new ArrayList<>();

    public Vendedor(double percentualComissao, String nome, double salarioBase) {
        super(nome, salarioBase);
        this.percentualComissao = percentualComissao;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    public void incluirVenda(Venda v){
        vendas.add(v);
    }
    
    public double calcularSalario(){
        double totalVendas = 0;
        for (Venda v : vendas) {
            totalVendas += v.getValor(); // assumindo que a classe Venda tem um getValor()
        }
        double comissao = totalVendas * (percentualComissao / 100);
        return getSalarioBase() + comissao;
    }
    
    
    
}
