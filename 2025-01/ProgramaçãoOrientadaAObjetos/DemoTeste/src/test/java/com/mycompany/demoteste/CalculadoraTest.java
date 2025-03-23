/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.demoteste;

import com.mycompany.demoteste.model.Calculadora;
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
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    @Test
    public void testeSomarInteiro(){
        int a = 2;
        int b = 6;
        int esperado = 8;
        
        Calculadora calc = new Calculadora();
        int resultado = calc.somarInteiro(a,b);
        
        assertEquals(resultado, esperado);
    }
    
    @Test
    public void testeSomarFloat(){
        float a = (float) 3f;
        float b = (float) 0.123f;
        float esperado = (float) 3.12f;
        float tolerancia = 0.009f; //delta padrao
        
        Calculadora calc = new Calculadora();
        float resultado = calc.somarFloat(a, b);
        
        assertEquals(resultado, esperado, tolerancia);
                
    }
    
    @Test
    public void testeDividirFloat(){
        float a = 4;
        float b = 2;
        float esperado = 2;
        float tolerancia = 0.009f;
        
        Calculadora calc = new Calculadora();
        float resultado = calc.dividir(a, b);
        
        assertEquals(resultado, esperado, tolerancia);
    }
    
    @Test
    public void testeDividirPorZero(){
        Exception ex = assertThrows(IllegalArgumentException.class, ()->{
            Calculadora calc = new Calculadora();
            calc.dividir(4, 0);
        });
        String esperado = "Divisão por zero";
        assertEquals(esperado, ex.getMessage());
    }
    
}
