/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista13.model;

/**
 *
 * @author liandrar
 */
public class Conversor {

    public String extrairTexto(byte[] vetor, int inicio, int fim) {
        byte[] aux = new byte[fim - inicio];
        for (int i = inicio; i <= fim; i++) {
            aux[i - inicio] = vetor[i];

        }
        return new String(aux);
    }
}
