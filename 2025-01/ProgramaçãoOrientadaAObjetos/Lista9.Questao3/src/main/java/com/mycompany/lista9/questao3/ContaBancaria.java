/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista9.questao3;

import java.util.ArrayList;

/**
 *
 * @author Windows
 */
public class ContaBancaria {

    private String numero;
    private double saldo;
    private Cliente titular;
    private ArrayList<Movimento> movimentos;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (!this.getNumero().trim().isEmpty()) {
            this.numero = numero;
        } else {
            throw new IllegalArgumentException("Numero de conta invalido");
        }

    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.setSaldo(saldo + valor);
            Movimento mov = new Movimento(valor, TipoMovimento.CREDITO);
            this.incluirMovimento(mov);
        } else {
            throw new IllegalArgumentException("Valor a ser depositado deve ser maior que zero.");
        }
    }

    public void sacar(double valor) {
        if (valor <= this.getSaldo()) {
            this.setSaldo(saldo - valor);
            Movimento mov = new Movimento(valor, TipoMovimento.DEBITO);
            this.incluirMovimento(mov);
        } else {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public ArrayList<Movimento> getMovimentos() {
        return movimentos;
    }

    protected void incluirMovimento(Movimento m) {
        movimentos.add(m);
    }

//    public String toString(){
//        String main = "------------------------------------\n"
//                    + "             Titular                \n"
//                    + "====================================\n"
//                    + "- Nome: "+ this.getTitular().getNome()+"\n"
//                    + "- Endereco: "+ this.getTitular().getEndereco()+"\n"
//                    + "- Numero da conta: "+ this.getNumero()+"\n"
//                    + "- Saldo: "+ this.getSaldo()+"\n"
//                    + "====================================";
//        return main;         
//    }
}
