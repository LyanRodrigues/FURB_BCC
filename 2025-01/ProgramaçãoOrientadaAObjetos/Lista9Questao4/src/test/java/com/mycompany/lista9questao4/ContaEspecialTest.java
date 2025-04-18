/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.lista9questao4;

import java.util.ArrayList;
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
    public void testSacarMovimentoCreditoDebito() {
        ContaEspecial ce = new ContaEspecial();
        ce.depositar(1000);
        ce.sacar(250);
        
        Movimento mov1 = new Movimento(1000, TipoMovimento.CREDITO);
        Movimento mov2 = new Movimento(250, TipoMovimento.DEBITO);
                        
        ArrayList<Movimento> resultado = ce.getMovimentos();
        
        
        assertEquals( 2, resultado.size());
        assertEquals( mov1.getValor(), resultado.get(0).getValor());
        assertEquals( mov1.getTipoMovimento(), resultado.get(0).getTipoMovimento());
        
        assertEquals( mov2.getValor(), resultado.get(1).getValor());
        assertEquals( mov2.getTipoMovimento(), resultado.get(1).getTipoMovimento());
    }

    
}
