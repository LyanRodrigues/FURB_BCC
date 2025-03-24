/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.lista6.model;

import com.mycompany.lista3.Funcionario;
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
public class FuncionarioTest {

    // 1. Verificar se um salário é categorizado corretamente como sendo de primeira faixa
    @Test
    public void testeIdentificarFaixaIrpf_Faixa1() {
        Funcionario funcionario = new Funcionario("João", 850.00);
        FaixaIrpf esperado = FaixaIrpf.PRIMEIRA;
        FaixaIrpf resultado = funcionario.identificarFaixa();
        assertEquals(esperado, resultado);
    }

    // 2. Verificar se o imposto é calculado corretamente para um salário de primeira faixa
    @Test
    public void testeCalcularIrpf_Faixa1() {
        Funcionario funcionario = new Funcionario("João", 850.00);
        double esperado = 0.00;
        double resultado = funcionario.calcularIrpf();
        assertEquals(esperado, resultado, 0.01);
    }

    // 3. Verificar se um salário é categorizado corretamente como sendo de primeira faixa
    @Test
    public void testeIdentificarFaixaIrpf_Faixa1_2() {
        Funcionario funcionario = new Funcionario("Maria", 1903.98);
        FaixaIrpf esperado = FaixaIrpf.PRIMEIRA;
        FaixaIrpf resultado = funcionario.identificarFaixa();
        assertEquals(esperado, resultado);
    }

    // 4. Verificar se o imposto é calculado corretamente para um salário de primeira faixa
    @Test
    public void testeCalcularIrpf_Faixa1_2() {
        Funcionario funcionario = new Funcionario("Maria", 1903.98);
        double esperado = 0.00;
        double resultado = funcionario.calcularIrpf();
        assertEquals(esperado, resultado, 0.01);
    }

    // 5. Verificar se um salário é categorizado corretamente como sendo de segunda faixa
    @Test
    public void testeIdentificarFaixaIrpf_Faixa2() {
        Funcionario funcionario = new Funcionario("Carlos", 1903.99);
        FaixaIrpf esperado = FaixaIrpf.SEGUNDA;
        FaixaIrpf resultado = funcionario.identificarFaixa();
        assertEquals(esperado, resultado);
    }

    // 6. Verificar se o imposto é calculado corretamente para um salário de segunda faixa
    @Test
    public void testeCalcularIrpf_Faixa2() {
        Funcionario funcionario = new Funcionario("Carlos", 1903.99); // Salário na faixa 2
        double esperado = 0.0; // 7,5% para a faixa 2
        double resultado = funcionario.calcularIrpf();
        assertEquals(esperado, resultado, 0.03); // Tolerância de 0.01 para comparação de doubles
    }

    // 7. Verificar se um salário é categorizado corretamente como sendo de segunda faixa
    @Test
    public void testeIdentificarFaixaIrpf_Faixa2_2() {
        Funcionario funcionario = new Funcionario("Ana", 2000.00);
        FaixaIrpf esperado = FaixaIrpf.SEGUNDA;
        FaixaIrpf resultado = funcionario.identificarFaixa();
        assertEquals(esperado, resultado);
    }

    // 8. Verificar se o imposto é calculado corretamente para um salário de segunda faixa
    @Test
    public void testeCalcularIrpf_Faixa2_2() {
        Funcionario funcionario = new Funcionario("Ana", 2000.00);
        double esperado = 2000.00 * 0.075; // Alíquota de 7,5%
        double resultado = funcionario.calcularIrpf();
        assertEquals(esperado, resultado, 0.01);
    }

    // 9. Verificar se um salário é categorizado corretamente como sendo de segunda faixa
    @Test
    public void testeIdentificarFaixaIrpf_Faixa2_3() {
        Funcionario funcionario = new Funcionario("Pedro", 2826.65);
        FaixaIrpf esperado = FaixaIrpf.SEGUNDA;
        FaixaIrpf resultado = funcionario.identificarFaixa();
        assertEquals(esperado, resultado);
    }

    // 10. Verificar se o imposto é calculado corretamente para um salário de segunda faixa
    @Test
    public void testeCalcularIrpf_Faixa2_3() {
        Funcionario funcionario = new Funcionario("Pedro", 2826.65);
        double esperado = 2826.65 * 0.075; // Alíquota de 7,5%
        double resultado = funcionario.calcularIrpf();
        assertEquals(esperado, resultado, 0.01);
    }

    // 11. Verificar se um salário é categorizado corretamente como sendo de terceira faixa
    @Test
    public void testeIdentificarFaixaIrpf_Faixa3() {
        Funcionario funcionario = new Funcionario("Lucas", 2826.66);
        FaixaIrpf esperado = FaixaIrpf.TERCEIRA;
        FaixaIrpf resultado = funcionario.identificarFaixa();
        assertEquals(esperado, resultado);
    }

    // 12. Verificar se o imposto é calculado corretamente para um salário de terceira faixa
    @Test
    public void testeCalcularIrpf_Faixa3() {
        Funcionario funcionario = new Funcionario("Lucas", 2826.66);
        double esperado = 2826.66 * 0.15; // Alíquota de 15%
        double resultado = funcionario.calcularIrpf();
        assertEquals(esperado, resultado, 0.01);
    }

    // 13. Verificar se um salário é categorizado corretamente como sendo de terceira faixa
    @Test
    public void testeIdentificarFaixaIrpf_Faixa3_2() {
        Funcionario funcionario = new Funcionario("Júlia", 3000.00);
        FaixaIrpf esperado = FaixaIrpf.TERCEIRA;
        FaixaIrpf resultado = funcionario.identificarFaixa();
        assertEquals(esperado, resultado);
    }

    // 14. Verificar se o imposto é calculado corretamente para um salário de terceira faixa
    @Test
    public void testeCalcularIrpf_Faixa3_2() {
        Funcionario funcionario = new Funcionario("Júlia", 3000.00);
        double esperado = 3000.00 * 0.15; // Alíquota de 15%
        double resultado = funcionario.calcularIrpf();
        assertEquals(esperado, resultado, 0.01);
    }

    // 15. Verificar se um salário é categorizado corretamente como sendo de terceira faixa
    @Test
    public void testeIdentificarFaixaIrpf_Faixa3_3() {
        Funcionario funcionario = new Funcionario("Ricardo", 3751.05);
        FaixaIrpf esperado = FaixaIrpf.TERCEIRA;
        FaixaIrpf resultado = funcionario.identificarFaixa();
        assertEquals(esperado, resultado);
    }

    // 16. Verificar se o imposto é calculado corretamente para um salário de terceira faixa
    @Test
    public void testeCalcularIrpf_Faixa3_3() {
        Funcionario funcionario = new Funcionario("Ricardo", 3751.05);
        double esperado = 3751.05 * 0.15; // Alíquota de 15%
        double resultado = funcionario.calcularIrpf();
        assertEquals(esperado, resultado, 0.01);
    }

    // 17. Verificar se um salário é categorizado corretamente como sendo de quarta faixa
    @Test
    public void testeIdentificarFaixaIrpf_Faixa4() {
        Funcionario funcionario = new Funcionario("Marta", 3751.06);
        FaixaIrpf esperado = FaixaIrpf.QUARTA;
        FaixaIrpf resultado = funcionario.identificarFaixa();
        assertEquals(esperado, resultado);
    }

    // 18. Verificar se o imposto é calculado corretamente para um salário de quarta faixa
    @Test
    public void testeCalcularIrpf_Faixa4() {
        Funcionario funcionario = new Funcionario("Marta", 3751.06);
        double esperado = 3751.06 * 0.225; // Alíquota de 22,5%
        double resultado = funcionario.calcularIrpf();
        assertEquals(esperado, resultado, 0.01);
    }

    // 19. Verificar se um salário é categorizado corretamente como sendo de quarta faixa
    @Test
    public void testeIdentificarFaixaIrpf_Faixa4_2() {
        Funcionario funcionario = new Funcionario("Fernando", 4000.00);
        FaixaIrpf esperado = FaixaIrpf.QUARTA;
        FaixaIrpf resultado = funcionario.identificarFaixa();
        assertEquals(esperado, resultado);
    }

    // 20. Verificar se o imposto é calculado corretamente para um salário de quarta faixa
    @Test
    public void testeCalcularIrpf_Faixa4_2() {
        Funcionario funcionario = new Funcionario("Fernando", 4000.00);
        double esperado = 4000.00 * 0.225; // Alíquota de 22,5%
        double resultado = funcionario.calcularIrpf();
        assertEquals(esperado, resultado, 0.01);
    }

    // 21. Verificar se um salário é categorizado corretamente como sendo de quarta faixa
    @Test
    public void testeIdentificarFaixaIrpf_Faixa4_3() {
        Funcionario funcionario = new Funcionario("Lucas", 4664.68);
        FaixaIrpf esperado = FaixaIrpf.QUARTA;
        FaixaIrpf resultado = funcionario.identificarFaixa();
        assertEquals(esperado, resultado);
    }

    // 22. Verificar se o imposto é calculado corretamente para um salário de quarta faixa
    @Test
    public void testeCalcularIrpf_Faixa4_3() {
        Funcionario funcionario = new Funcionario("Lucas", 4664.68);
        double esperado = 4664.68 * 0.225; // Alíquota de 22,5%
        double resultado = funcionario.calcularIrpf();
        assertEquals(esperado, resultado, 0.01);
    }

    // 23. Verificar se um salário é categorizado corretamente como sendo de quinta faixa
    @Test
    public void testeIdentificarFaixaIrpf_Faixa5() {
        Funcionario funcionario = new Funcionario("Patricia", 4664.69);
        FaixaIrpf esperado = FaixaIrpf.QUINTA;
        FaixaIrpf resultado = funcionario.identificarFaixa();
        assertEquals(esperado, resultado);
    }

    // 24. Verificar se o imposto é calculado corretamente para um salário de quinta faixa
    @Test
    public void testeCalcularIrpf_Faixa5() {
        Funcionario funcionario = new Funcionario("Patricia", 4664.69);
        double esperado = 4664.69 * 0.275; // Alíquota de 27,5%
        double resultado = funcionario.calcularIrpf();
        assertEquals(esperado, resultado, 0.01);
    }

    // 25. Verificar se um salário é categorizado corretamente como sendo de quinta faixa
    @Test
    public void testeIdentificarFaixaIrpf_Faixa5_2() {
        Funcionario funcionario = new Funcionario("Rodrigo", 5000.00);
        FaixaIrpf esperado = FaixaIrpf.QUINTA;
        FaixaIrpf resultado = funcionario.identificarFaixa();
        assertEquals(esperado, resultado);
    }

    // 26. Verificar se o imposto é calculado corretamente para um salário de quinta faixa
    @Test
    public void testeCalcularIrpf_Faixa5_2() {
        Funcionario funcionario = new Funcionario("Rodrigo", 5000.00);
        double esperado = 5000.00 * 0.275; // Alíquota de 27,5%
        double resultado = funcionario.calcularIrpf();
        assertEquals(esperado, resultado, 0.01);
    }

    // 27. Recusar salário negativo
    @Test
    public void testeRecusarSalarioNegativo() {
        Funcionario funcionario = new Funcionario("Rodrigo", 1000.00);
        double salario = -20;
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            funcionario.setSalario(salario);
        });
    }
}
