/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.prova1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author liandrar
 */
public class ReservaTest {
    @Test
    public void quartoComumSemExcedentes(){
        int a = 4;
        int b = 2;
        TipoQuarto q = TipoQuarto.COMUM;
        double esperado = 880.00;
        
        Reserva res = new Reserva();
        res.setQtdDias(a);
        res.setQtdHospedes(b);
        res.setQuarto(q);
        
        double resultado = res.calcularValorReserva();
        assertEquals(resultado, esperado);
    }
    
    @Test
    public void quartoComumComExcedentes(){
        int a = 2;
        int b = 4;
        TipoQuarto q = TipoQuarto.COMUM;
        double esperado = 680.00;
        
        Reserva res = new Reserva();
        res.setQtdDias(a);
        res.setQtdHospedes(b);
        res.setQuarto(q);
        
        double resultado = res.calcularValorReserva();
        assertEquals(resultado, esperado);
    }
    
    @Test
    public void quartoFamiliaSemExcedentes(){
        int a = 4;
        int b = 4;
        TipoQuarto q = TipoQuarto.FAMILIA;
        double esperado = 1400.00;
        
        Reserva res = new Reserva();
        res.setQtdDias(a);
        res.setQtdHospedes(b);
        res.setQuarto(q);
        
        double resultado = res.calcularValorReserva();
        assertEquals(resultado, esperado);
    }
    
    @Test
    public void quartoFamiliaComExcedentes(){
        int a = 3;
        int b = 5;
        TipoQuarto q = TipoQuarto.FAMILIA;
        double esperado = 1230.00;
        
        Reserva res = new Reserva();
        res.setQtdDias(a);
        res.setQtdHospedes(b);
        res.setQuarto(q);
        
        double resultado = res.calcularValorReserva();
        assertEquals(resultado, esperado);
    }
    
    @Test
    public void quartoPresidencialComExcedentes(){
        int a = 5;
        int b = 8;
        TipoQuarto q = TipoQuarto.SUITE_PRESIDENCIAL;
        double esperado = 5000.00;
        
        Reserva res = new Reserva();
        res.setQtdDias(a);
        res.setQtdHospedes(b);
        res.setQuarto(q);
        
        double resultado = res.calcularValorReserva();
        assertEquals(resultado, esperado);
    }
    
}
