public class ListaEncadeada<T> {
    private NoLista<T> primeiro;
    private NoLista<T> ultimo;

    public ListaEncadeada() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public void inserir(T valor) {
        NoLista<T> novo = new NoLista<>();
        novo.setInfo(valor);
        if (estaVazia()) {
            primeiro = novo;
            ultimo = novo;
        } else {
            novo.setProx(primeiro);
            primeiro = novo;
        }
    }

    public void retirar(T valor) {
        NoLista<T> p = this.primeiro;
        NoLista<T> anterior = null;
        while (p != null && !p.getInfo().equals(valor)) {
            anterior = p;
            p = p.getProx();
        }
        if (p != null) {
            if (anterior == null) {
                this.primeiro = p.getProx();
            } else {
                anterior.setProx(p.getProx());
            }
            if (this.ultimo == p) {
                this.ultimo = anterior;
            }
        }
    }

    public NoLista<T> buscar(T valor) {
        NoLista<T> p = primeiro;
        while (p != null) {
            if (p.getInfo().equals(valor)) {
                return p;
            }
            p = p.getProx();
        }
        return null;
    }

    @Override
    public String toString() {
        NoLista<T> p = primeiro;
        StringBuilder str = new StringBuilder("[");
        while (p != null) {
            str.append(p.getInfo());
            if (p.getProx() != null) {
                str.append(", ");
            }
            p = p.getProx();
        }
        return str.append("]").toString();
    }

    public int obterComprimento() {
        NoLista<T> p = primeiro;
        int comprimento = 0;
        while (p != null) {
            p = p.getProx();
            comprimento++;
        }
        return comprimento;
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public NoLista<T> obterNo(int pos) {
        if (pos < 0 || pos >= obterComprimento()) {
            throw new IndexOutOfBoundsException("Posição inválida: " + pos);
        }
        NoLista<T> p = primeiro;
        for (int i = 0; i < pos; i++) {
            p = p.getProx();
        }
        return p;
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public NoLista<T> getUltimo() {
        return ultimo;
    }

    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        System.out.println(lista.estaVazia());
        System.out.println(lista.toString());
        System.out.println(lista.obterComprimento());
    }
}
