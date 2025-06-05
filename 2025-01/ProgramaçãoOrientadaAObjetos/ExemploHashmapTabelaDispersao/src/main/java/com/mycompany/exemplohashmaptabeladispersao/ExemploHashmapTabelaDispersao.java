/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplohashmaptabeladispersao;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 *
 * @author liandrar
 */
public class ExemploHashmapTabelaDispersao {

    public static void main(String[] args) {
        HashMap<Integer, Aluno> alunos = new LinkedHashMap();
        
        Aluno a1 = new Aluno(12, "Gilmar", 01);
        alunos.put(01, a1);
        
        alunos.put(3322, new Aluno(13, "Gumercindo", 3322));
        alunos.put(3526, new Aluno(15, "Jurandir", 3526));
        
        
        int consulta = 3322;
        
        System.out.println(alunos.containsKey(consulta));
        System.out.println("Consultando chave: " + consulta);
        
        
        System.out.println(alunos.get(consulta));
        
        
        HashMap<String, Integer> frutas =  new LinkedHashMap();
        frutas.put("maca", 15);
        frutas.put("banana", 3);
        frutas.put("mamao", 5);
        frutas.put("pera", 8);
        frutas.put("vergamota", 12);
        
        System.out.println(frutas.get("maca"));
        
        frutas.remove("maca");
        System.out.println(frutas.get("maca"));
        
        System.out.println(frutas.hashCode());
        
        
    }
}
