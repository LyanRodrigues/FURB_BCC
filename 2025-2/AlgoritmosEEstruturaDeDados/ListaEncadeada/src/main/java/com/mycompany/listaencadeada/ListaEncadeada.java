/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.listaencadeada;

/**
 *
 * @author liandrar
 */
public class ListaEncadeada<T> {

    private NoLista primeiro;

    public ListaEncadeada() {
        primeiro = null;
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T info) {
        NoLista<T> novo = new NoLista();
        novo.setInfo(info);
        novo.setProximo(primeiro);
        this.primeiro = novo;
    }

    public void exibir() {
        NoLista<T> p = primeiro;
        while (p != null) {
            System.out.println(p.getInfo());
            p = p.getProximo();
        }
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public NoLista<T> buscar(T v) {
        NoLista<T> p = primeiro;
        while (p != null) {
            if (p.getInfo().equals(v)) {
                return p;
            }

            p = p.getProximo();
        }
        return null;
    }

    public void retirar(T v) {
        NoLista anterior = null;
        NoLista p = primeiro;

        while (p != null && !p.getInfo().equals(v)) {
            anterior = p;
            p = p.getProximo();
        }

        if (p != null) {
            if (p == primeiro) {
                this.primeiro = p.getProximo();
            } else {
                anterior.setProximo(p.getProximo());
            }
        }
    }

    public int obterComprimento() {
        NoLista<T> p = primeiro;
        int cont = 0;
        while (p != null) {
            cont++;
            p = p.getProximo();
        }
        return cont;
    }

    public NoLista<T> obterNo(int idx) {
        if (idx < 0 ) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }
        NoLista<T> p = primeiro;
        int cont = 0;
        while (cont < idx && p != null) {
            p = p.getProximo();
            cont++;
        }
        
        if (p == null){
            throw new IndexOutOfBoundsException();
        }
        return p;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NoLista<T> p = primeiro;
        while (p != null) {
            sb.append(p.getInfo());
            p = p.getProximo();
            if (p != null) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

}
