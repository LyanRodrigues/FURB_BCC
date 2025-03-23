/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algestdados.ArvoresBinarias;

/**
 *
 * @author liandrar
 * @param <T>
 */
public class NoArvoreBinaria<T> {
    private T info;
    NoArvoreBinaria<T> esquerda, direita;

    public NoArvoreBinaria(T info) {
        this.info = info;
        esquerda = null;
        direita = null;
    }
    public NoArvoreBinaria(T info, NoArvoreBinaria<T> esq, NoArvoreBinaria<T> dir ){
        this.info = info;
        esquerda = esq;
        direita = dir;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NoArvoreBinaria<T> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NoArvoreBinaria<T> esquerda) {
        this.esquerda = esquerda;
    }

    public NoArvoreBinaria<T> getDireita() {
        return direita;
    }

    public void setDireita(NoArvoreBinaria<T> direita) {
        this.direita = direita;
    }
    
}
