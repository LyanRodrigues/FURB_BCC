/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemploiterator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author liandrar
 */
public class ExemploIterator {

    public static void main3(String[] args) {
        int[] vetor = new int[5];
        vetor[0] = 2;
        vetor[1] = 1;
        vetor[2] = 4;
        vetor[3] = 3;
        vetor[4] = 5;
        int aux;
        for(int i = 0; i < vetor.length; i++){
            
            for(int j = 0; j < vetor.length; j++){
                aux = vetor[i];
                if (aux < vetor[j]){
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        for (int i = 0; i < vetor.length; i++){
            System.out.printf(vetor[i]+" ");
        }
    }
    
    
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList();
        pessoas.add(new Pessoa("Jurandir", 10));
        pessoas.add(new Pessoa("Adam", 89));
        pessoas.add(new Pessoa("Emma", 34));
        pessoas.add(new Pessoa("Thomas", 22));
        pessoas.add(new Pessoa("Henry", 21));
        
        Iterator<Pessoa> iterator = pessoas.iterator();
        
        Pessoa p;
        
        System.out.println("Antes de ordenar");
        System.out.println(pessoas);
        
        pessoas.sort(new ComparadorNome());
        
        System.out.println("Depois de ordenar");
        System.out.println(pessoas);
        
        System.out.println("---------------------------------");
        
        System.out.println("Antes de ordenar Idade");
        System.out.println(pessoas);
        
        pessoas.sort(new ComparadorIdade());
        
        System.out.println("Depois de ordenar Idade");
        System.out.println(pessoas); 
        
      
        System.out.println("Tamanho da lista eh: "+ pessoas.size());
        
//        while(iterator.hasNext()){
//            p = iterator.next();
//            if (p.getNome().endsWith("ir")){
//                iterator.remove();
//            }
//        }
//        
//        System.out.println("Depois do filtro");
//        System.out.println(pessoas);
             
    }
}
