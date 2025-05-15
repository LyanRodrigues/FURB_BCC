/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploarquivosbinarios;

import java.io.Serializable;

/**
 *
 * @author liandrar
 */
public class Pessoa implements Serializable{
    private static final long serialVersionUID = 65L;
    private String nome;
    private int idade;

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

    public Pessoa(String nome, int idade) {
        setIdade(idade);
        setNome(nome);
    }
    
    
}
