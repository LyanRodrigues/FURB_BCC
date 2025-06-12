/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova3.model;

import java.util.Comparator;

/**
 *
 * @author liandrar
 */
public class OrdenarPorDesempenho implements Comparator<Atleta> {

    @Override
    public int compare(Atleta o1, Atleta o2) {
        int ordem = o1.getNome().compareTo(o2.getNome());
        if (ordem == 0) {
            if (o1.calcularDesempenho()< o2.calcularDesempenho()) {
                ordem = -1;
            } else if (o1.calcularDesempenho()> o2.calcularDesempenho()) {
                ordem = +1;
            } else {
                ordem = 0;
            }
        }
        return ordem;
    }
}
