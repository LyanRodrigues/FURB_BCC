package Aula.Questao1;

public class ListaEstatica<T> {
    private T[] info;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public ListaEstatica() {
        this.info = (T[]) new Object[10]; // Use of unchecked cast
        this.tamanho = 0;
    }

    private void redimensionar() {
        T[] novoVetor = (T[]) new Object[info.length + 10]; // Use generic type
        System.arraycopy(info, 0, novoVetor, 0, info.length);
        info = novoVetor;
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
            System.out.println(info[i]);
        }
    }

    public int buscar(T valor) {
        for (int i = 0; i < tamanho; i++) {
            if (info[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }

    public void retirar(T valor) {
        for (int i = 0; i < tamanho; i++) {
            if (info[i].equals(valor)) {
                for (int x = i; x < tamanho - 1; x++) {
                    info[x] = info[x + 1];
                }
                info[tamanho - 1] = null; // Avoid memory leak
                tamanho--;
                break;
            }
        }
    }

    public void liberar() {
        info = (T[]) new Object[10];
        tamanho = 0;
    }

    public T obterElemento(int posicao) {
        if (posicao >= 0 && posicao < tamanho) {
            return info[posicao];
        }
        throw new IndexOutOfBoundsException("Posição inválida!");
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            if (i > 0) {
                res.append(", ");
            }
            res.append(info[i].toString());
        }
        return res.toString();
    }
}
