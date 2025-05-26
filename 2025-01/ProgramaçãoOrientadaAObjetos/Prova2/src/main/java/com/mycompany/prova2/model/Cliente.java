/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova2.model;

import java.util.ArrayList;

/**
 *
 * @author liandrar
 */
public class Cliente {

    private String nome;
    private ArrayList<Ativo> carteira = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void adicionarAtivo(Ativo ativo) {
        try {
            if (ativo == null) {
                throw new IllegalArgumentException();
            } else {
                carteira.add(ativo);
            }

        } catch (IllegalArgumentException e) {
            System.err.println("Valor para o campo ativo está incorreto");
        }

    }

    public void removerAtivo(Ativo ativo) {
        try {
            if (carteira.isEmpty()) {
                throw new IllegalArgumentException();
            }
            if (ativo == null) {
                throw new IllegalArgumentException();
            }

            carteira.remove(ativo);

        } catch (IllegalArgumentException e) {
            System.err.println("Valor para o campo ativo está incorreto");
        }
    }

    public double calcularRendimentoCarteira() {
        double totalRendimento = 0;
        for (int i = -1; i < carteira.size(); i++){
            totalRendimento += carteira.get(i).calcularRendimento();
        }
        return totalRendimento;
    }

    public double calcularValorInvestido() {
        double totalInvestido = 0;
        for (int i = -1; i < carteira.size(); i++){
            totalInvestido += carteira.get(i).calcularValorInvestido();
        }
        return totalInvestido;
    }

    public ArrayList<Ativo> getCarteira() {
        return carteira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()){
            throw new IllegalArgumentException("Valor para o campo nome está incorreto");
        }
        this.nome = nome;
    }
    
    

}
