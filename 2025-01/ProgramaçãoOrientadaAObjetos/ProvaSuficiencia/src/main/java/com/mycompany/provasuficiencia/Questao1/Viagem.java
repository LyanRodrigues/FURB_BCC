/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provasuficiencia.Questao1;

import java.util.Date;

/**
 *
 * @author liandrar
 */
public class Viagem {
    private String placaOnibus;
    private String nomeMotorista;
    private Date dataViagem;
    
    public void addPassageiro(Passageiro p){
        
    }

    public String getPlacaOnibus() {
        return placaOnibus;
    }

    public void setPlacaOnibus(String placaOnibus) {
        this.placaOnibus = placaOnibus;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public Date getDataViagem() {
        return dataViagem;
    }

    public void setDataViagem(Date dataViagem) {
        this.dataViagem = dataViagem;
    }

    public float getValorTotal(){
        return 0;
    }
    
    public Viagem(String placaOnibus, String nomeMotorista, Date dataViagem) {
       this.setPlacaOnibus(placaOnibus);
       this.setNomeMotorista(nomeMotorista);
       this.setDataViagem(dataViagem);
    }
}
