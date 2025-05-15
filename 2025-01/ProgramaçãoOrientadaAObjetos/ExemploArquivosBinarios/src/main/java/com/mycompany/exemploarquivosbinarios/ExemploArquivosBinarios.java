/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exemploarquivosbinarios;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author liandrar
 */
public class ExemploArquivosBinarios {

    // public static void main(String[] args) throws IOException {
    // File arquivo = new File("Teste.data");
    // try{
    // arquivo.createNewFile();
    // FileOutputStream fos = new FileOutputStream(arquivo);
    // fos.write(65);
    // fos.write(66);
    // fos.write(67);
    // fos.write(68);
    // fos.write(69);
    // fos.write(49);
    // fos.close();
    //
    // }catch(IOException ex){
    // Logger.getLogger(ExemploArquivosBinarios.class.getName());
    // }
    //
    // try{
    // FileInputStream fis = new FileInputStream(arquivo);
    // int dado=fis.read();
    // while (dado!=-1){
    // System.out.println("Byte lido: "+ dado);
    // dado = fis.read();
    // }
    // fis.close();
    // }catch (FileNotFoundException ex){
    // Logger.getLogger(ExemploArquivosBinarios.class.getName());
    // }
    // }
//    public static void main(String[] args) {
//        File arquivo = new File("dados-primitivos.dat");
//
//        // escrita
//        try {
//            arquivo.createNewFile(); //objeto de file
//
//            FileOutputStream fos = new FileOutputStream(arquivo); //abre stream pra acessar conteudo
//            DataOutputStream dos = new DataOutputStream(fos); //abre stream especifica
//
//            //escreve no file
//            dos.writeDouble(3.14); 
//            dos.writeUTF("furb");
//
//            dos.close(); // uma vez fechando data output stream, q é a mais especifica, nao precisa fechar o file, pq ela fecha automatico
//
//        } catch (IOException ex) {
//            Logger.getLogger(ExemploArquivosBinarios.class.getName());
//        }
//
//        // leitura
//        try {
//            FileInputStream fis = new FileInputStream(arquivo);
//            DataInputStream dis = new DataInputStream(fis);
//
//            System.out.println(dis.readDouble());
//            System.out.println(dis.readUTF());
//
//            dis.close();
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(ExemploArquivosBinarios.class.getName());
//        } catch (IOException ex) {
//            Logger.getLogger(ExemploArquivosBinarios.class.getName());
//        }
//    }
    public static void main(String[] args) throws IOException {
        File arquivo = new File("Objetos.data");
        Pessoa p = new Pessoa("Adelaide", 69);
        try {
            arquivo.createNewFile();
            
            FileOutputStream fos = new FileOutputStream(arquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(p);
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
        
        FileInputStream fis;
        try {
            fis = new FileInputStream(arquivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            p = (Pessoa) ois.readObject();
            System.out.println("Nome: "+ p.getNome());
            System.out.println("Idade: "+ p.getIdade());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExemploArquivosBinarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
