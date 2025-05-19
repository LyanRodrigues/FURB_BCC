/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista13.model;

import java.io.File;

/**
 *
 * @author liandrar
 */
public class CalculadoraTamanho {
    public double calcularTamanhoPasta(File pasta){
        if (pasta.isFile()){
            return ((double)pasta.length())/1_000_000;
        }
        double somatorio = 0;
        for (File arquivo: pasta.listFiles()){
            somatorio += calcularTamanhoPasta(arquivo);
        }
        return somatorio;
    }
}
