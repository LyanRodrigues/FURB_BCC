/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.contabancaria;

/**
 *
 * @author liandrar
 */
public class ContaBancaria {

    //-----Atributos-----
    private String numero;
    private String titular;
    private double saldo;

    //-----Getters e Setters-----
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (numero.trim().isEmpty()) {
            throw new IllegalArgumentException("Numero da conta Invalido");
        }
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if(titular.trim().isEmpty()){
            throw new IllegalArgumentException("Titular invalido");
        }
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    //-----Metodos-----
    public void depositar(double valor) {
        if (valor <= 0){
            throw new IllegalArgumentException("Valor de deposito invalido");
        } else{
            System.out.println("Valor de R$"+ valor+" depositado na conta de "+ this.getTitular()+ ".");
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor <= 0 || valor > this.getSaldo()){
            throw new IllegalArgumentException("Valor de saque invalido. Seu saldo é de "+ this.getSaldo()+".");
        } else{
            System.out.println("Valor de R$"+ valor+" sacado na conta de "+ this.getTitular()+ ".");
            this.saldo -= valor;
        }
        
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

}
