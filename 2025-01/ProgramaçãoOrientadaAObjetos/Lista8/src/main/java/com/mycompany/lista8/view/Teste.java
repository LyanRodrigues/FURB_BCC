package com.mycompany.lista8.view;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Teste {
    public static void abrirVideo(String caminhoVideo) {
        try {
            File arquivo = new File(caminhoVideo);
            if (!arquivo.exists()) {
                throw new IOException("Arquivo não encontrado: " + caminhoVideo);
            }

            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                desktop.open(arquivo);
            } else {
                throw new UnsupportedOperationException("Ação não suportada no sistema atual.");
            }
        } catch (IOException | UnsupportedOperationException e) {
            e.printStackTrace();
            // Exibe uma mensagem de erro
            System.err.println("Erro ao tentar abrir o vídeo: " + e.getMessage());
        }
    }
}