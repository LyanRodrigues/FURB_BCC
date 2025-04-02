/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.lista7;

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
public class ImovelTest {
    
    @Test 
    public void teste01RecusaAreaNegativa(){
        Exception ex = assertThrows(IllegalArgumentException.class, ()->{
            Imovel imovel = new Imovel();
            imovel.setArea(-5);
        });
        String esperado = "Area deve ser maior que zero";
        assertEquals(esperado, ex.getMessage());
    }
    
    @Test
    public void teste02RecusaCalcularIptuSemArea(){
        Exception ex = assertThrows(IllegalArgumentException.class, ()->{
            Imovel imovel = new Imovel();
            Bairro bairro = new Bairro();
            bairro.setNome("Centro");
            bairro.setCoeficienteIptu(1);
            imovel.setBairro(bairro);
            imovel.setFinalidade(Finalidade.COMERCIAL);
            imovel.calcularIptu();
        });
        String esperado = "Área não especificada";
        assertEquals(esperado, ex.getMessage());
    }
    
    @Test 
    public void teste03RecusaCalcularIptuSemFinalidade(){
        Exception ex = assertThrows(IllegalArgumentException.class, ()->{
            Imovel imovel = new Imovel();
            Bairro bairro = new Bairro();
            bairro.setNome("Centro");
            bairro.setCoeficienteIptu(1);
            imovel.setBairro(bairro);
            imovel.setArea(250);
            imovel.calcularIptu();
        });
        String esperado = "Defina uma finalidade";
        assertEquals(esperado, ex.getMessage());
    }
    @Test 
    public void teste04RecusaCalcularIptuSemBairro(){
        Exception ex = assertThrows(IllegalArgumentException.class, ()->{
            Imovel imovel = new Imovel();
            imovel.setFinalidade(Finalidade.RESIDENCIAL);
            imovel.setArea(400);
            imovel.calcularIptu();
        });
        String esperado = "Um bairro deve ser definido";
        assertEquals(esperado, ex.getMessage());
    }
    
    @Test 
    public void teste05CalcularImpostoResidenciais(){
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(1);
        bairro.setNome("Alagoinha");
        imovel.setBairro(bairro);
        imovel.setArea(400);
        imovel.setFinalidade(Finalidade.RESIDENCIAL);
                
        double esperado = 400;
        double resultado = imovel.calcularIptu();
        
        assertEquals(esperado, resultado);
    }
    
    @Test 
    public void teste06CalcularImpostoComerciais100(){
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(1);
        bairro.setNome("Alagoinha");
        imovel.setBairro(bairro);
        imovel.setArea(80);
        imovel.setFinalidade(Finalidade.COMERCIAL);
                
        double esperado = 500;
        double resultado = imovel.calcularIptu();
        
        assertEquals(esperado, resultado);
    }
    
    @Test 
    public void teste07CalcularImpostoComerciais100p400(){
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(1);
        bairro.setNome("Alagoinha");
        imovel.setBairro(bairro);
        imovel.setArea(250);
        imovel.setFinalidade(Finalidade.COMERCIAL);
                
        double esperado = 1000;
        double resultado = imovel.calcularIptu();
        
        assertEquals(esperado, resultado);
    }
    
    @Test 
    public void teste08CalcularImpostoComerciais400(){
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(1);
        bairro.setNome("Alagoinha");
        imovel.setBairro(bairro);
        imovel.setArea(500);
        imovel.setFinalidade(Finalidade.COMERCIAL);
                
        double esperado = 1275;
        double resultado = imovel.calcularIptu();
        
        assertEquals(esperado, resultado);
    }
    
    @Test 
    public void teste09CalcularImpostoIndustriais2000(){
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(1);
        bairro.setNome("Alagoinha");
        imovel.setBairro(bairro);
        imovel.setArea(2000);
        imovel.setFinalidade(Finalidade.INDUSTRIAL);
                
        double esperado = 1000;
        double resultado = imovel.calcularIptu();
        
        assertEquals(esperado, resultado);
    }
    
    @Test 
    public void teste10CalcularImpostoIndustriaisMaisDe2000(){
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(1);
        bairro.setNome("Alagoinha");
        imovel.setBairro(bairro);
        imovel.setArea(3000);
        imovel.setFinalidade(Finalidade.INDUSTRIAL);
                
        double esperado = 1650;
        double resultado = imovel.calcularIptu();
        
        assertEquals(esperado, resultado, 0.001);
    }
    
    @Test 
    public void teste11CalcularImpostoCoeficiente2ponto5(){
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        bairro.setCoeficienteIptu(2.5);
        bairro.setNome("Alagoinha");
        imovel.setBairro(bairro);
        imovel.setArea(500);
        imovel.setFinalidade(Finalidade.RESIDENCIAL);
                
        double esperado = 1250;
        double resultado = imovel.calcularIptu();
        
        assertEquals(esperado, resultado, 0.001);
    }
    
    
}
