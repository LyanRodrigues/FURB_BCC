package com.mycompany.listaestaticagenerica;

public class ListaEstaticaGenerica<T> {
    private T[] info;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public ListaEstaticaGenerica() {
        info = (T[]) new Object[10];
        tamanho = 0;
    }

    @SuppressWarnings("unchecked")
    private void redimensionar() {
        T[] novo = (T[]) new Object[info.length + 10];
        for (int i = 0; i < tamanho; i++) {
            novo[i] = info[i];
        }
        info = novo;
    }

    public void inserir(T valor) {
        if (tamanho == info.length) {
            redimensionar();
        }
        info[tamanho] = valor;
        tamanho++;
    }

    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(info[i] + " ");
        }
        System.out.println();
    }

    public int buscar(T valor) {
        for (int i = 0; i < tamanho; i++) {
            if (info[i] == null) {
                if (valor == null) return i;
            } else if (info[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }

    public void retirar(T valor) {
        int pos = buscar(valor);
        if (pos != -1) {
            for (int i = pos; i < tamanho - 1; i++) {
                info[i] = info[i + 1];
            }
            info[tamanho - 1] = null; // boa prática
            tamanho--;
        }
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public String toString() {
        if (tamanho == 0) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            sb.append(info[i]);
            if (i < tamanho - 1) sb.append(",");
        }
        return sb.toString();
    }

    public void liberar() {
        @SuppressWarnings("unchecked")
        T[] novo = (T[]) new Object[10];
        info = novo;
        tamanho = 0;
    }

    public T obterElemento(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException();
        }
        return info[posicao];
    }

    public int getTamanho() {
        return tamanho;
    }

    public void inverter() {
        for (int i = 0; i < tamanho / 2; i++) { // i vai percorrer metade da lista
            T tmp = info[i];    // valor temporaria generica guarda um valor da metade da lista e salva num backup
            info[i] = info[tamanho - 1 - i]; //sobrepoe o primeiro valor da lista com o ultimo, desconsiderando o valor i
            info[tamanho - 1 - i] = tmp;
        }
    }
}
