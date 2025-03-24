/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3;

import com.mycompany.lista6.model.FaixaIrpf;

/**
 * C:\Users\liandrar\Documents\NetBeansProjects\Lista6\src\main\java\com\mycompany\lista6\model\Funcionario.java
 *
 * @author liandrar
 */
public class Funcionario {

    private static final double FAIXA_1_LIMITE_SUP = 1903.98;
    private static final double FAIXA_2_LIMITE_INF = 1903.99;
    private static final double FAIXA_2_LIMITE_SUP = 2826.65;
    private static final double FAIXA_3_LIMITE_INF = 2826.66;
    private static final double FAIXA_3_LIMITE_SUP = 3751.05;
    private static final double FAIXA_4_LIMITE_INF = 3751.06;
    private static final double FAIXA_4_LIMITE_SUP = 4664.68;
    private static final double FAIXA_5_LIMITE_INF = 4664.69;
    private static final double ALIQUOTA_FAIXA_2 = 0.075;
    private static final double ALIQUOTA_FAIXA_3 = 0.15;
    private static final double ALIQUOTA_FAIXA_4 = 0.225;
    private static final double ALIQUOTA_FAIXA_5 = 0.275;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    /**
     * Metodo setter para o atributo nome
     *
     * @param nome o valor que sera atribuido ao atributo nome
     */
    public void setNome(String nome) {
        if (nome.isEmpty() || nome.isBlank()) {
            throw new IllegalArgumentException("O nome é inválido");
        }

        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("Salario inválido");
        }
        this.salario = salario;
    }

    /**
     * Realiza o calculo de imposto de renda do funcionario
     *
     * @return o valor da tarifa de imposto de renda calculado
     */

    public double calcularIrpf() {
        switch (identificarFaixa()) {
            case PRIMEIRA:
                return 0; // Sem imposto
            case SEGUNDA:
                return salario * ALIQUOTA_FAIXA_2; // 7,5%
            case TERCEIRA:
                return salario * ALIQUOTA_FAIXA_3; // 15%
            case QUARTA:
                return salario * ALIQUOTA_FAIXA_4; // 22,5%
            case QUINTA:
                return salario * ALIQUOTA_FAIXA_5; // 27,5%
        }
        return 0; // Caso default, embora não seja necessário
    }

    public FaixaIrpf identificarFaixa() {
        if (salario <= FAIXA_1_LIMITE_SUP) {
            return FaixaIrpf.PRIMEIRA;
        }
        if (salario <= FAIXA_2_LIMITE_SUP) {
            return FaixaIrpf.SEGUNDA;
        }
        if (salario <= FAIXA_3_LIMITE_SUP) {
            return FaixaIrpf.TERCEIRA;
        }
        if (salario <= FAIXA_4_LIMITE_SUP) {
            return FaixaIrpf.QUARTA;
        }
        return FaixaIrpf.QUINTA;
    }
}
