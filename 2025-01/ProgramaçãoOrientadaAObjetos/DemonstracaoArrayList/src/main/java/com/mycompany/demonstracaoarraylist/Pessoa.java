/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demonstracaoarraylist;

/**
 *
 * @author liandrar
 */
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }
      
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
