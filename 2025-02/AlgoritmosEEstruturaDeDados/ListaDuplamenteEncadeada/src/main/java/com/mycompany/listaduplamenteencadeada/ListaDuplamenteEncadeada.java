/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.listaduplamenteencadeada;

/**
 *
 * @author liandrar
 */
public class ListaDuplamenteEncadeada<T> {

    private NoListaDupla<T> primeiro;

    public ListaDuplamenteEncadeada() {
        primeiro = null;
    }

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor) {
        NoListaDupla novo = new NoListaDupla(); //instancia um nó novo
        novo.setInfo(valor); //coloca o argumento como info
        novo.setProximo(primeiro); //aponta o atual primeiro, que foi o ultimo nó criado, como proximo
        novo.setAnterior(null); //setta o anterior como null
        if (primeiro != null) {  //se o primeiro nao for nulo, ou seja, se for um nó valido...
            primeiro.setAnterior(novo); //...pede pra settar o anterior dele como sendo o nó novo
        }
        primeiro = novo;
    }

    public NoListaDupla<T> buscar(T valor) {
        NoListaDupla<T> p = primeiro;
        while (p != null) {
            if (p.getInfo().equals(valor)) {
                return p;
            }

            p = p.getProximo();
        }
        return null;
    }

    public void retirar(T valor) {
        NoListaDupla p = buscar(valor);

        if (p != null) { //achou
            if (primeiro == p) { // primeiro elemento?
                primeiro = p.getProximo();
            } else {
                p.getAnterior().setProximo(p.getProximo());
            }

            if (p.getProximo() != null) { // nao é o ultimo
                p.getProximo().setAnterior(p.getAnterior());
            }
        }
    }

    public void exibirOrdemInversa() {
        NoListaDupla p = primeiro;
        while (p.getProximo() != null){
            p = p.getProximo();
        }
        
        while (p.getAnterior() != null){
            System.out.println("[ "+ p + " ,");
        }
        
        
    }

    public void liberar() {

    }

    public String toString() {
        return null;
    }

}
