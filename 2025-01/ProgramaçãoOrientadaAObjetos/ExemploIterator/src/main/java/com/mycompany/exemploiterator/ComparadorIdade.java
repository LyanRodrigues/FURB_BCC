/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploiterator;

import java.util.Comparator;

/**
 *
 * @author liandrar
 */
public class ComparadorIdade implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        if (o1.getIdade() > o2.getIdade()){
            return 1;
            
        }
        if (o1.getIdade() < o2.getIdade()){
            return -1;
        }
        return 0;
    }

    
}
