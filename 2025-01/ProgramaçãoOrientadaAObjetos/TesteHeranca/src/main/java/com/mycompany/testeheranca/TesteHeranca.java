/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testeheranca;

import com.mycompany.testeheranca.model.CalculadoraCientifica;

/**
 *
 * @author liandrar
 */
public class TesteHeranca {

    public static void main(String[] args) {
        CalculadoraCientifica calculadora = new CalculadoraCientifica();
        
        calculadora.potencia(2,4);
        System.out.println(calculadora.getMemoria());
    }
}
