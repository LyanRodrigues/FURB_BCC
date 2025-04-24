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
public class Empresa {
    private String nome;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    public Empresa(String nome) {
        this.nome = nome;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.trim().isEmpty()){
            this.nome = nome;
        }
        else {
            throw new IllegalArgumentException("Nome invalido");
        }
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    public void incluirFuncionario(Funcionario f){
        funcionarios.add(f);
    }
    
    public void removerFuncionario(Funcionario f){
        funcionarios.remove(f);
    }
    
    public double calcularCustoSalarios(){
        double total = 0;
        for(Funcionario f : funcionarios){
            total += f.calcularSalario();
        }
        return total;
    }
    
    
}
