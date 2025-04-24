/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista10b.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author liandrar
 */
public class Programador extends Funcionario{
    private ArrayList<String> linguagens;

    public Programador(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    
    public void incluirLinguagem(String linguagem){
        
    }
    
    public void removerLinguagem(String linguagem){
        
    }
    
    public ArrayList<String> getLinguagens(){
        return linguagens;
    }
    
    @Override
    public double calcularSalario(){
        if (this.getLinguagens().contains("Java")){
            return getSalarioBase() * 0.20;
        }
        return getSalarioBase();
    }
}
