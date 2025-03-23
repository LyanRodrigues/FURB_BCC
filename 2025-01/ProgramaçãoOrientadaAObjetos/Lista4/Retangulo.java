package com.mycompany.lista4.Model;

/**
 * Representa um retângulo com altura e comprimento.
 * Fornece métodos para calcular área e perímetro, além de validadores nos setters.
 * 
 * @author Thomas Leon Rodrigues (liandrar)
 * @version 1.0
 */
public class Retangulo {

    private int altura;
    private int comprimento;

    /**
     * Construtor padrão. Inicializa altura e comprimento com 0.
     */
    public Retangulo() {
        this.altura = 0;
        this.comprimento = 0;
    }

    /**
     * Construtor que define altura e comprimento do retângulo.
     * 
     * @param altura Altura do retângulo
     * @param comprimento Comprimento do retângulo
     */
    public Retangulo(int altura, int comprimento) {
        this.altura = altura;
        this.comprimento = comprimento;
    }

    /**
     * Retorna a altura do retângulo.
     * 
     * @return altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Define a altura do retângulo.
     * 
     * @param altura Altura a ser definida (deve ser maior que zero)
     * @throws IllegalArgumentException se altura for menor ou igual a zero
     */
    public void setAltura(int altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Valor incorreto para altura: " + altura);
        }
        this.altura = altura;
    }

    /**
     * Retorna o comprimento do retângulo.
     * 
     * @return comprimento
     */
    public int getComprimento() {
        return comprimento;
    }

    /**
     * Define o comprimento do retângulo.
     * 
     * @param comprimento Comprimento a ser definido (deve ser maior que zero)
     * @throws IllegalArgumentException se comprimento for menor ou igual a zero
     */
    public void setComprimento(int comprimento) {
        if (comprimento <= 0) {
            throw new IllegalArgumentException("Valor incorreto para comprimento: " + comprimento);
        }
        this.comprimento = comprimento;
    }

    /**
     * Calcula o perímetro do retângulo.
     * 
     * @return perímetro calculado (2 * (altura + comprimento))
     */
    public int calcularPerimetro() {
        return 2 * (this.altura + this.comprimento);
    }

    /**
     * Calcula a área do retângulo.
     * 
     * @return área calculada (altura * comprimento)
     */
    public int calcularArea() {
        return this.altura * this.comprimento;
    }
}
