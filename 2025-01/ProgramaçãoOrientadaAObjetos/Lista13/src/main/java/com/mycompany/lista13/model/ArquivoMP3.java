/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista13.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author liandrar
 */
public class ArquivoMP3 {

    private TagMp3 tag;

    public ArquivoMP3(String nomeArquivo) throws FileNotFoundException, IOException, ArquivoNaoTemMp3 {
        File arquivo = new File(nomeArquivo);
        if (!arquivo.exists()) {
            throw new FileNotFoundException("Arquivo: "+" nao existe");
        }
        byte[] dados = new byte[128];
        FileInputStream fis = new FileInputStream(arquivo);
        fis.skip(arquivo.length()-128); //skip pro final
        fis.read(dados); //carrega ultimos 128 bytes
        String tagTexto = extrairTexto(dados, 0, 3); //extrai os textos
        if (!tagTexto.equals("TAG")){
            throw new ArquivoNaoTemMp3("Arquivo nao tem TAG");
        }
        tag = new TagMp3();
        tag.setTitulo(extrairTexto(dados, 3, 30));
        tag.setArtista(extrairTexto(dados, 33, 30));
        tag.setAlbum(extrairTexto(dados, 63, 30));
        tag.setAno(Integer.parseInt(extrairTexto(dados, 93, 4)));
        tag.setComentario(extrairTexto(dados, 97, 28));
        tag.setNumeroFaixa(Integer.parseInt(extrairTexto(dados, 125, 1)));
        tag.setGenero(Integer.parseInt(extrairTexto(dados, 126, 1)));
    }

    public TagMp3 getTag() {
        return tag;
    }

    public void setTag(TagMp3 tag) {
        this.tag = tag;
    }
    
    public String extrairTexto(byte[] vetor, int inicio, int qtdValores) {
        byte[] aux = new byte[qtdValores];
        for (int i = inicio; i <= inicio+qtdValores; i++) {
            aux[i - inicio] = vetor[i];

        }
        return new String(aux);
    }
}
