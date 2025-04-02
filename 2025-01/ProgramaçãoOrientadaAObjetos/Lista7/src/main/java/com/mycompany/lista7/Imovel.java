/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista7;

/**
 *
 * @author liandrar
 */
//import javax.swing.JOptionPane;

public class Imovel {

    private String endereco;
    private int area;
    private Bairro bairro;
    private Finalidade finalidade;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco.trim().isEmpty()){
            throw new IllegalArgumentException("Endereço vazio");
        }
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        if (area > 0) {
            this.area = area;

        } else {
            throw new IllegalArgumentException("Area deve ser maior que zero");
            //JOptionPane.showMessageDialog(null, "Erro", "Deve ser maior que zero", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        if (bairro == null){
            throw new IllegalArgumentException("bairro vazio");
        }
        this.bairro = bairro;
    }

    public Finalidade getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) {
        if (finalidade == null){
            throw new IllegalArgumentException("Finalidade vazia");
        }
        this.finalidade = finalidade;
    }

    public double calcularIptu() {
        if (area <= 0) {
            throw new IllegalArgumentException("Área não especificada");
        }

        if (bairro == null) {
            throw new IllegalArgumentException("Um bairro deve ser definido");
            //JOptionPane.showMessageDialog(null, "Um bairro deve ser definido", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        if (bairro.getCoeficienteIptu() < 0) {
            throw new IllegalArgumentException("Coeficiente não pode ser negativo");
            //JOptionPane.showMessageDialog(null, "Coeficiente não pode ser negativo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        if (finalidade == null) {
            throw new IllegalArgumentException("Defina uma finalidade");
            //JOptionPane.showMessageDialog(null, "Defina uma finalidade", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        double Iptu = 0;
        if (finalidade.equals(Finalidade.RESIDENCIAL)) {
            Iptu = area;
        }
        if (finalidade.equals(Finalidade.COMERCIAL)) {
            if (area <= 100) {
                Iptu = 500;
            }
            if (area > 100 && area <= 400) {
                Iptu = 1000;
            }
            if (area > 400) {
                Iptu = area * 2.55;
            }
        }
        if (finalidade.equals(Finalidade.INDUSTRIAL)) {
            if (area <= 2000) {
                Iptu = 1000;
            } else {
                Iptu = area * 0.55;
            }
        }
        return Iptu * bairro.getCoeficienteIptu();
    }

}
