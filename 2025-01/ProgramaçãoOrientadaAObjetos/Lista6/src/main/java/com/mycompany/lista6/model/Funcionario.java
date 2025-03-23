/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista6.model;

/**
 *
 * @author liandrar
 */
public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularIrpf(){
        double aliquotaFaixa2 = 7.5/100;
        double aliquotaFaixa3 = 15.0/100;
        double aliquotaFaixa4 = 22.5/100;
        double aliquotaFaixa5 = 27.5/100;
        
        double MaxFaixa1 = 1903.98;
        double MaxFaixa2 = 2826.65;
        double MaxFaixa3 = 3751.05;
        double MaxFaixa4 = 4664.68;
        
        double impostoTotal = 0;
        
        if(salario <= MaxFaixa1){
            return 0;
        } else if (salario > MaxFaixa1 && salario <= MaxFaixa2){
            
        }
        
        return 0;
    }
    
    public FaixaIrpf identificarFaixaIrpf(){
             
        return null;
    }
}
