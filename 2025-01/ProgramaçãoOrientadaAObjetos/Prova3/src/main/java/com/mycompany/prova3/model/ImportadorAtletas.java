/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova3.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author liandrar
 */
public class ImportadorAtletas {

    private ArrayList<Atleta> atletas;

    public ImportadorAtletas(String caminhoArquivo) throws FileNotFoundException {

        File arquivo = new File(caminhoArquivo);
        if (!arquivo.exists()) {
            throw new FileNotFoundException("Arquivo: " + " nao existe");
        }

        Scanner scan = new Scanner(arquivo, "UTF-8");

        while (scan.hasNext()) {
            String linha = scan.nextLine();
            String[] valoresString = linha.split(";");

            if (linha.startsWith("V")) {

                String nome = valoresString[1];
                String idade = valoresString[2];
                String saque = valoresString[3];
                String bloqueio = valoresString[4];
                String ataque = valoresString[5];

                float fSaque = Float.parseFloat(saque);
                int IntIdade = Integer.getInteger(idade);
                float fBloqueio = Float.parseFloat(bloqueio);
                float fAtaque = Float.parseFloat(ataque);

                atletas.add(new AtletaVolei(fSaque, fBloqueio, fAtaque, nome, IntIdade));
            }
            if (linha.startsWith("B")) {

                String nome = valoresString[1];
                String idade = valoresString[2];
                String pontos = valoresString[3];
                String rebotes = valoresString[4];
                

                int IntPontos = Integer.getInteger(pontos);
                int IntIdade = Integer.getInteger(idade);
                int IntRebotes = Integer.getInteger(rebotes);
                

                atletas.add(new AtletaBasquete(IntPontos, IntRebotes, nome, IntIdade));
            }
        }
    }

    public ArrayList<Atleta> getAtletas() {

        return atletas;

    }

    public Atleta getAtletaMaisJovem() {
        int a = Integer.MAX_VALUE;
        Atleta atletaMaisJovem = null;

        for (int i = 0; i < atletas.size(); i++) {
            a = atletas.get(i).getIdade();
            if (a < atletaMaisJovem.getIdade()) {
                atletaMaisJovem = atletas.get(i);
            }
        }

        return atletaMaisJovem;

    }

    public Atleta getAtletaMaiorDesempenho() {
        float a = 0;
        Atleta atletaMaiorDesempenho = null;

        for (int i = 0; i < atletas.size(); i++) {
            a = atletas.get(i).calcularDesempenho();
            if (a < atletaMaiorDesempenho.calcularDesempenho()) {
                atletaMaiorDesempenho = atletas.get(i);
            }
        }

        return atletaMaiorDesempenho;

    }

}
