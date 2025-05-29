/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploiterator;

/**
 *
 * @author liandrar
 */
class Pessoa implements Comparable {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        setIdade(idade);
        setNome(nome);
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
    
    public String toString(){
        return "Nome: " + getNome() + ". Idade: "+getIdade();
    }

    @Override
    public int compareTo(Object o) {
        Pessoa p = (Pessoa) o;
        return this.getNome().compareTo(p.getNome());
    }
    
    
}
