/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista5.model;

/**
 *
 * @author liandrar
 */
public class Ponto {
    private int x;
    private int y;

    public Ponto() {
        this.y = 0;
        this.x = 0;
    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
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

    public Quadrante identificarQuadrante() {
        if (this.x > 0) {
            if (this.y > 0) {
                return Quadrante.PRIMEIRO;
            }
            return Quadrante.SEGUNDO;
        }
        if (this.x < 0) {
            if (this.y > 0) {
                return Quadrante.QUARTO;
            }
            return Quadrante.TERCEIRO;
        }
        return Quadrante.NENHUM;
    }

    public boolean estaIncidindoSobreX() {
        return y == 0;
    }

    public boolean estaIncidindoSobreY() {
        return x == 0;
    }

    public double calcularDistancia(Ponto outroPonto) {
        double raizX = Math.pow(outroPonto.getX() - this.x, 2);
        double raizY = Math.pow(outroPonto.getY() - this.y, 2);
        double d = Math.sqrt(raizX + raizY);
        return d;
    }

    public double calcularDistancia(Ponto p1, Ponto p2) {
        return p1.calcularDistancia(p2);
    }
}
