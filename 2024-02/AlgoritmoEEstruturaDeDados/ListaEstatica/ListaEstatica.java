public class ListaEstatica<T> {
	private T[] info;
	private int tamanho;
	private static final int CAPACIDADE_INICIAL = 10;

	public int getTamanho() {
		return tamanho;
	}

	@SuppressWarnings("unchecked")
	public ListaEstatica() {
		info = (T[]) new Object[CAPACIDADE_INICIAL];
		tamanho = 0;
	}

	private void redimensionar() {
		int novoTamanho = tamanho + CAPACIDADE_INICIAL;
		@SuppressWarnings("unchecked")
		T[] novo = (T[]) new Object[novoTamanho];

		System.arraycopy(info, 0, novo, 0, tamanho);

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
			System.out.print(info[i] + ", ");
		}
	}

	public int buscar(T valor) {
		for (int i = 0; i < tamanho; i++) {
			if (valor.equals(info[i])) {
				return i;
			}
		}
		return -1;
	}

	public void retirar(T valor) {
		for (int i = 0; i < tamanho; i++) {
			if (valor.equals(info[i])) {
				for (int x = i; x < tamanho - 1; x++) {
					info[x] = info[x + 1];
				}
				tamanho--;
				break; // Exit the loop since the element has been removed
			}
		}
	}
	

	public void liberar() {
		for (int i = 0; i < tamanho; i++) {
			info[i] = null;
		}
		tamanho = 0;
	}

	public T obterElemento(int posicao) {
		if (posicao >= 0 && posicao < tamanho) {
			return info[posicao];
		} else {
			throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
		}
	}

	public boolean estaVazia() {
		return tamanho == 0;
	}

	@Override
	public String toString() {
		StringBuilder mensagem = new StringBuilder();
	
		if (tamanho > 0) {
			mensagem.append(info[0]);
			for (int i = 1; i < tamanho; i++) {
				mensagem.append(", ").append(info[i]);
			}
		}
	
		return mensagem.toString();
	}
	

	public void inverter() {
		for (int i = 0; i < tamanho / 2; i++) {
			T temp = info[i];
			info[i] = info[tamanho - 1 - i];
			info[tamanho - 1 - i] = temp;
		}
	}
}
