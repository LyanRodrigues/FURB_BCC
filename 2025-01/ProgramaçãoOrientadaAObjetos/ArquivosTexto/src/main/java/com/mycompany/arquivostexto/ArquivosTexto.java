/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arquivostexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author liandrar
 */
public class ArquivosTexto {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File arquivo = new File("arquivo-texto.txt");
        try {
            PrintWriter arquivoTexto = new PrintWriter(arquivo);
            arquivoTexto.println("Um texto qualquer");
            arquivoTexto.println("Outra linha");
            arquivoTexto.println(42);
            arquivoTexto.println(3.14);
            arquivoTexto.println("Um texto com acentuação");

            arquivoTexto.close();

            arquivo.createNewFile();
        } catch (IOException ex) {

        }

        try {
            Scanner scan = new Scanner(arquivo, "utf-8");
            String linha;

            while (scan.hasNext()) {
                linha = scan.nextLine();
                System.out.println(linha);
                
            }
        } catch (FileNotFoundException ex) {

        }
        
        try {
            FileReader reader = new FileReader(arquivo);
            BufferedReader buff = new BufferedReader(reader);
           
            String linha = buff.readLine();

            while (linha != null) {
                
                System.out.println(linha);
                linha = buff.readLine();
                
                
            }
        } catch (FileNotFoundException ex) {

        }
    }
}
