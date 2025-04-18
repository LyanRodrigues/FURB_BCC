/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista9questao4;

/**
 *
 * @author Windows
 */
public class ContaEspecial extends ContaBancaria {

    private double limiteCredito;

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        if (limiteCredito > 0) {
            this.limiteCredito = limiteCredito;
        } else {
            throw new IllegalArgumentException("Limite de crédito inválido");
        }
    }

    public void sacar(double valor) {
        if (valor > this.getSaldo() && (valor-this.getSaldo()) <= limiteCredito) {
            valor = valor - this.getSaldo();
            this.setSaldo(0);
            limiteCredito =- valor;
            this.setSaldo(limiteCredito);
            Movimento mov = new Movimento(valor, TipoMovimento.DEBITO);
            incluirMovimento(mov);
        } else if (valor <= this.getSaldo()){
            this.setSaldo(this.getSaldo()-valor);
            Movimento mov = new Movimento(valor, TipoMovimento.DEBITO);
            incluirMovimento(mov);
        }else{
            throw new IllegalArgumentException("Saldo insuficiente");
        }
    }
}
