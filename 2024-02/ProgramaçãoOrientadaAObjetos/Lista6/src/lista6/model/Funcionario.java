/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista6.model;

import lista6.model.FaixaIrpf;

/**
 *
 * @author liandrar
 */
public class Funcionario {
    private String name;
    private double salario;

    public Funcionario(String name, double salario) {
        this.name = name;
        this.salario = salario;
    }
    
    public double calcularIrpf(){
        double imposto = 0.0;

        if (salario > 4664.68) {
            imposto += salario * 0.275;
            salario = 4664.68;
        }
        if (salario > 3751.05) {
            imposto += salario * 0.225;
            salario = 3751.05;
        }
        if (salario > 2826.65) {
            imposto += salario * 0.15;
            salario = 2826.65;
        }
        if (salario > 1903.98) {
            imposto += salario * 0.075;
        }

        return imposto;
    }
    public FaixaIrpf identificarFaixaIrpf(){   
         if (salario <= 1903.98) {
            return FaixaIrpf.PRIMEIRA;
        } else if (salario <= 2826.65) {
            return FaixaIrpf.SEGUNDA;
        } else if (salario <= 3751.05) {
            return FaixaIrpf.TERCEIRA;
        } else if (salario <= 4664.68) {
            return FaixaIrpf.QUARTA;
        } else {
            return FaixaIrpf.QUINTA;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <= 0) {
            throw new IllegalArgumentException("Salário deve ser maior que Zero");
        }
        this.salario = salario;
    }
            
}
