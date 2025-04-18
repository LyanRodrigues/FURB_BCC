/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.lista9.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Windows
 */
public class ContaEspecialTest {
    @Test
    public void testSacarPermiteSuperiorSaldo() {
        ContaEspecial ce = new ContaEspecial();
        double expResult = -30.00;
        ce.setLimiteCredito(100);
        ce.depositar(20);
        ce.sacar(50);
        double result = ce.getSaldo();
        assertEquals(expResult, result, 0);
        
    }@Test
    public void testSacarPermiteSuperiorSaldoInferiorLimite() {
        ContaEspecial ce = new ContaEspecial();
        double expResult = -100.00;
        ce.setLimiteCredito(100);
        ce.depositar(20);
        ce.sacar(120);
        double result = ce.getSaldo();
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testSacarImpedeSuperiorSaldoELimite() {
        Exception ex = assertThrows(IllegalArgumentException.class, ()->{
            ContaEspecial ce = new ContaEspecial();
            ce.setLimiteCredito(100);
            ce.depositar(20);
            ce.sacar(120.01);
        });
        String mensagemEsperada = "Saldo insuficiente";
        assertEquals(mensagemEsperada, ex.getMessage());
    }
    
}
