/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista9questao4;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Windows
 */
public class Movimento {
    private double valor;
    private LocalDate data;
    private LocalTime hora;
    private TipoMovimento tipoMovimento;

    public Movimento(double valor, TipoMovimento tipoMovimento) {
        this.data = LocalDate.now();
        this.hora = LocalTime.now();
        this.valor = valor;
        this.tipoMovimento = tipoMovimento;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return LocalDate.now();
    }

    public LocalTime getHora() {
        return LocalTime.now();
    }

    public TipoMovimento getTipoMovimento() {
        return tipoMovimento;
    }
    
    
}
