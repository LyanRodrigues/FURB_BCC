package arvoreNAria;

public class Arvore<T> {
	private NoArvore<T> raiz;
	
	public NoArvore<T> getRaiz() {
		return raiz;
	}

	public void setRaiz(NoArvore<T> raiz) {
		this.raiz = raiz;
	}

	public NoArvore<T> pertence(T info) {
		if (this.vazia()) {
			return null;
		}
		return this.raiz.pertence(info);

	}

	public boolean vazia() {
		if (raiz == null) {
			return true;
		}
		return false;
	}

	public String toString() {
		if (this.vazia()) {
			return "vazia";
		}
		return this.raiz.imprimePre();
	}
}
