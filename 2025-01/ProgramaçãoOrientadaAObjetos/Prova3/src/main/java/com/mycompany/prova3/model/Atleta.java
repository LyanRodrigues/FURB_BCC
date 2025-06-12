/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova3.model;

/**
 *
 * @author liandrar
 */
public abstract class Atleta implements Comparable<Atleta> {

    private String nome;
    private int idade;

    public Atleta(String nome, int idade) {
        setIdade(idade);
        setNome(nome);
    }

    public float calcularDesempenho() {
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome Inválido. Nome não pode ser vazio.");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0 || idade <= 0.05) {
            throw new IllegalArgumentException("Idade inválida. Idade deve ser maior que zero");
        }
        this.idade = idade;
    }

    @Override
    public int compareTo(Atleta a) {
        if (this.idade < a.idade) {
            return -1;
        }
        if (this.idade > a.idade) {
            return +1;
        }
        return 0;
    }

    

    

}
