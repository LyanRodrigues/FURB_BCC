/*
    Thomas Leon Rodrigues
*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova1;

/**
 *
 * @author liandrar
 */
public class Reserva {
    private int qtdDias;
    private int qtdHospedes;
    private TipoQuarto quarto;
    
    public Reserva(int qtdDias, int qtdHospedes, TipoQuarto quarto){
        this.qtdDias =  qtdDias;
        this.qtdHospedes = qtdHospedes;
        this.quarto = quarto;
    }

    Reserva() {
        
    }
    /*
        Retorna a quantidade de dias dada pelo setQtdDias()
    */
    public int getQtdDias() { 
        return qtdDias;
    }
    
    /*
        Seta a quantidade de dias após a verificação, se for maior que zero ele seta,
        se for igual ou menor ele lança a exceção;
    */
    public void setQtdDias(int qtdDias) {
        if (qtdDias >0){
            this.qtdDias = qtdDias;
        } else {
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
    }
    
    /*
        Retorna a quantidade de hospedes dada pelo setQtdHospedes()
    */
    public int getQtdHospedes() {
        return qtdHospedes;
    }
    
    /*
        Seta a quantidade de hospedes após a verificação, se for maior que zero ele seta,
        se for igual ou menor ele lança a exceção;
    */
    public void setQtdHospedes(int qtdHospedes) {
        if (qtdHospedes >0){
            this.qtdHospedes = qtdHospedes;
        } else {
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
    }
    
    /*
        Retorna o tipo de quarto dada pelo setQuarto()
    */
    public TipoQuarto getQuarto() {
        return quarto;
    }

    /*
        Seta o tipo do quarto após a verificação,
        se for nulo ele lança a exceção;
    */
    public void setQuarto(TipoQuarto quarto) {
        if(quarto != null){
            this.quarto = quarto;
        } else {
            throw new IllegalArgumentException("Valor incorreto");
        }
    }
    
    /*
        Calcula o valor da estadia a partir da analise dos bonus entre comum, familia, e suite
    */
    public double calcularValorReserva(){
        double precoDiariaComum = 200; //diaria do quarto comum é 200
        double precoDiariaFamilia = 350; //diaria do quarto familia é 350
        double valorTotal = 0; //armazena o valor total da estadia
        
        if (quarto.equals(TipoQuarto.COMUM)){
            if (qtdHospedes > 2){ //se tiverem mais que dois hospedes ele coloca a taxa de 50 pra cada um a mais por diaria
                valorTotal = (50*(qtdHospedes-2))*qtdDias;//taxa de hospedes extras
            }
            valorTotal = valorTotal +((qtdHospedes*10)*qtdDias);//cafe da manha
            valorTotal = valorTotal + (precoDiariaComum*qtdDias); //faz o calculo de diarias
        }
        if (quarto.equals(TipoQuarto.FAMILIA)){
            if (qtdHospedes > 4){ //se tiverem mais que quatro hospedes ele coloca a taxa de 60 pra cada um a mais por diaria
                valorTotal = (60*(qtdHospedes-4))*qtdDias;//taxa de hospedes extras
            }
            valorTotal = valorTotal + (precoDiariaFamilia*qtdDias); //faz o calculo de diarias
        }
        if (quarto.equals(TipoQuarto.SUITE_PRESIDENCIAL)){
            valorTotal = 1000*qtdDias; //faz o calculo de diarias
        }
        return valorTotal;
    }
}
