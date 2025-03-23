package com.furb.lista5.model;

public class Ponto {
    private int x;
    private int y;

    /**
     * Construtor que cria um ponto com coordenadas específicas.
     *
     * @param x Coordenada x do ponto.
     * @param y Coordenada y do ponto.
     */
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Construtor que cria um ponto na origem (0, 0).
     */
    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * Identifica o quadrante em que o ponto está localizado.
     *
     * @return O quadrante onde o ponto está localizado.
     */
    public Quadrante identificarQuadrante() {
        if (getY() > 0 && getX() > 0) {
            return Quadrante.PRIMEIRO;
        } else if (getY() > 0 && getX() < 0) {
            return Quadrante.SEGUNDO;
        } else if (getY() < 0 && getX() < 0) {
            return Quadrante.TERCEIRO;
        } else if (getY() < 0 && getX() > 0) {
            return Quadrante.QUARTO;
        } else {
            return Quadrante.NENHUM;
        }
    }

    /**
     * Verifica se o ponto está sobre o eixo X.
     *
     * @return {@code true} se o ponto está sobre o eixo X; {@code false} caso contrário.
     */
    public boolean estaIncidindoSobreX() {
        return (getY() == 0);
    }

    /**
     * Verifica se o ponto está sobre o eixo Y.
     *
     * @return {@code true} se o ponto está sobre o eixo Y; {@code false} caso contrário.
     */
    public boolean estaIncidindoSobreY() {
        return (getX() == 0);
    }

    /**
     * Calcula a distância entre o ponto atual e outro ponto.
     *
     * @param outroPonto O outro ponto para o qual a distância será calculada.
     * @return A distância entre o ponto atual e o outro ponto.
     */
    public double calcularDistancia(Ponto outroPonto) {
        int x1 = getX();
        int x2 = outroPonto.getX();
        
        int y1 = getY();
        int y2 = outroPonto.getY();
        
        int dx = x2 - x1;
        int dy = y2 - y1;
        
        double dist = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        return dist;
    }

    /**
     * Calcula a distância entre dois pontos fornecidos.
     *
     * @param p1 O primeiro ponto.
     * @param p2 O segundo ponto.
     * @return A distância entre os dois pontos fornecidos.
     */
    public double calcularDistancia(Ponto p1, Ponto p2) {
        int xA = p1.getX();
        int xB = p2.getX();
        
        int yA = p1.getY();
        int yB = p2.getY();
        
        int dx = xB - xA;
        int dy = yB - yA;
        
        double dist = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        return dist;
    }
}
