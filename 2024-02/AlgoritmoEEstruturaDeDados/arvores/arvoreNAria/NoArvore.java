package arvoreNAria;

public class NoArvore<T> {
	private T info;
	private NoArvore<T> filho;
	private NoArvore<T> irmao;

	public NoArvore(T info) {
		super();
		this.info = info;
		filho = null;
		irmao = null;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public String imprimePre() {
		String str = "<" + this.info.toString();
		if (this.filho != null) {
			str += this.filho.imprimePre();
		}
		str += ">";
		if (this.irmao != null) {
			str += this.irmao.imprimePre();
		}
		return str;
	}

	public void inserirFilho(NoArvore<T> sa) {
		sa.irmao = this.filho;
		this.filho = sa;
	}

	public NoArvore<T> pertence(T info) {
		if (this.info.equals(info)) {
			return this;
		}
		NoArvore<T> noPesquisado = null;
		if (this.filho != null) {
			noPesquisado = this.filho.pertence(info);
		}
		if (noPesquisado == null && this.irmao != null) {
			noPesquisado = this.irmao.pertence(info);
		}
		return noPesquisado;
	}

}
