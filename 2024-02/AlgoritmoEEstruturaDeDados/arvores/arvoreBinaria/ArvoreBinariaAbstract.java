package arvores;

public abstract class ArvoreBinariaAbstract<T> { // contribui��o do Martin
	private NoArvoreBinaria<T> raiz;

	public ArvoreBinariaAbstract() {
		super();
	}

	protected void setRaiz(NoArvoreBinaria<T> raiz) {
		this.raiz = raiz;
	}
	
	protected NoArvoreBinaria<T> getRaiz(){
		return this.raiz;
	}

	public boolean vazia() {
		if (raiz == null) {
			return true;
		}
		return false;
	}

	public NoArvoreBinaria<T> pertence(T info) {
		if (this.vazia()) {
			return null;
		}
		return this.raiz.pertence(info);
	}

	@Override
	public String toString() {
		if (this.vazia()) {
			return "<>";
		}
		return this.raiz.imprimePre();
	}
}