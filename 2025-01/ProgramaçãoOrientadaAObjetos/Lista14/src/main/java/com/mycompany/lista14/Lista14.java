/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author liandrar
 */
public class Lista14 {

    public static void main(String[] args) {
        File arquivo = new File("C:\\Users\\liandrar\\Documents\\NetBeansProjects\\ArquivosTexto\\L14_municipios.csv");
        try {
            Scanner scan = new Scanner(arquivo, "UTF-8");
            String linha;
            String[] valoresString;
            int maiorPopulacao = 0;
            String cidadeMaiorPopulacao = null;
            int menorPopulacao = Integer.MAX_VALUE;
            String cidadeMenorPopulacao = null;
            linha = scan.nextLine();
            while (scan.hasNext()){
                linha = scan.nextLine();
                valoresString = linha.split(";");
//                System.out.println("Valor na String: "+ valoresString[3]);
//                System.out.println("Valor na variavel maiorPopulacao: "+ maiorPopulacao);
                if (Integer.parseInt(valoresString[3]) > maiorPopulacao){
                    maiorPopulacao = Integer.parseInt(valoresString[3]);
                    cidadeMaiorPopulacao = valoresString[1];
                }
                if (Integer.parseInt(valoresString[3]) < menorPopulacao){
                    menorPopulacao = Integer.parseInt(valoresString[3]);
                    cidadeMenorPopulacao = valoresString[1];
                }
                
            }
            System.out.println("Cidade maior população: "+ cidadeMaiorPopulacao);
            System.out.println("população: "+ maiorPopulacao);
            System.out.println("Cidade menor população: "+ cidadeMenorPopulacao);
            System.out.println("população: "+ menorPopulacao);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lista14.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
