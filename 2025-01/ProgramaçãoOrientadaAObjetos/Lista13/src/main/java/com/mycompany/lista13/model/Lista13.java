/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista13.model;

import static java.awt.PageAttributes.MediaType.C;
import java.io.File;

/**
 *
 * @author liandrar
 */
public class Lista13 {

    public static void main(String[] args) {
        String caminho ="C:\\Users\\liandrar\\Downloads";
        try {
            ArquivoMP3 mp3= new ArquivoMP3(caminho);
            System.out.println(mp3.getTag());
        } catch (Exception e) {
        }
    }
}
