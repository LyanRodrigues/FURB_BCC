/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provasuficiencia.Questao1;

/**
 *
 * @author liandrar
 */
class Passageiro {
    private String nome;
    private int idade;
    
    public float getTarifa(){
        return 0;
    }
    
    public Passageiro(String nome, int idade){
        this.setNome(nome);
        this.setIdade(idade);
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
