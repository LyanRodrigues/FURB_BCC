package arvores;

public class ArvoreBST<T extends Comparable<T>> extends ArvoreBinariaAbstract<T> {

	public void inserir(T info) {
		if (this.vazia()) {
			this.setRaiz(new NoArvoreBST<T>(info));
		} else {
			((NoArvoreBST<T>) this.getRaiz()).inserir(info);
		}
	}

	public NoArvoreBST<T> buscar(T info) {
		if (this.vazia()) {
			return null;
		}
		return ((NoArvoreBST<T>) this.getRaiz()).buscar(info);
	}

	public void retirar(T info) {
		NoArvoreBST<T> noARemover = this.buscar(info);
		if (noARemover != null) {
			this.removerNo(noARemover);
		}
	}

	private void removerNo(NoArvoreBST<T> noARemover) {
		NoArvoreBST<T> noPai = this.buscarPai(noARemover);

		if (noARemover.ehFolha()) {
			// caso 1
			if (this.getRaiz() == noARemover) {
				this.setRaiz(null);
			} else {
				if (noPai.getEsq() == noARemover) {
					noPai.setEsq(null);
				} else {
					noPai.setDir(null);
				}
			}
		} else {
			if (noARemover.temApenasUmFilho()) {
				// caso 2
				NoArvoreBST<T> noFilho = noARemover.buscarUnicoFilho();
				if (this.getRaiz() == noARemover) {
					this.setRaiz(noFilho);
				} else {
					if (noPai.getEsq() == noARemover) {
						noPai.setEsq(noFilho);
					} else {
						noPai.setDir(noFilho);
					}
				}
			} else {
				// caso 3
				NoArvoreBST<T> noSucessor = this.buscarSucessor(noARemover);
				T info = noSucessor.getInfo();
				this.removerNo(noSucessor);
				noARemover.setInfo(info);
			}
		}
	}

	private NoArvoreBST<T> buscarPai(NoArvoreBST<T> no) {
		if (no == this.getRaiz()) {
			return null;
		}
		NoArvoreBST<T> noPai = (NoArvoreBST<T>) this.getRaiz();
		while (noPai.getEsq() != no && noPai.getDir() != no) {
			if (no.getInfo().compareTo(noPai.getInfo()) < 0) {
				noPai = (NoArvoreBST<T>) noPai.getEsq();
			} else {
				noPai = (NoArvoreBST<T>) noPai.getDir();
			}
		}
		return noPai;
	}

	public NoArvoreBST<T> getSucessor(T info) {
		NoArvoreBST<T> no = this.buscar(info);
		if (no == null || info.equals(this.maiorValor())) {
			return null;
		}
		if (no.getDir() != null) {
			return this.buscarSucessor(no);
		}
		else {
			NoArvoreBST<T> noPai = this.buscarPai(no);
			while (noPai.getDir() == no) {
				no = noPai;
				noPai = this.buscarPai(no);
			}
			return noPai;
		}
	}
	
	private NoArvoreBST<T> buscarSucessor(NoArvoreBST<T> no) {
		NoArvoreBST<T> noSucessor = (NoArvoreBST<T>) no.getDir();
		while (noSucessor.getEsq() != null) {
			noSucessor = (NoArvoreBST<T>) noSucessor.getEsq();
		}
		return noSucessor;
	}
	
	public NoArvoreBST<T> getAntecessor(T info) {
		NoArvoreBST<T> no = this.buscar(info);
		if (no == null || info.equals(this.menorValor())) {
			return null;
		}
		if (no.getEsq() != null) {
			return this.buscarAntecessor(no);
		}
		else {
			NoArvoreBST<T> noPai = this.buscarPai(no);
			while (noPai.getEsq() == no) {
				no = noPai;
				noPai = this.buscarPai(no);
			}
			return noPai;
		}
	}
	
	private NoArvoreBST<T> buscarAntecessor(NoArvoreBST<T> no) {
		NoArvoreBST<T> noAntecessor = (NoArvoreBST<T>) no.getEsq();
		while (noAntecessor.getDir() != null) {
			noAntecessor = (NoArvoreBST<T>) noAntecessor.getDir();
		}
		return noAntecessor;
	}

	
	public T maiorValor() {
		if (this.vazia()) {
			return null;
		}
		NoArvoreBST<T> no = (NoArvoreBST<T>) this.getRaiz();
		while (no.getDir() != null) {
			no = (NoArvoreBST<T>) no.getDir();
		}
		return no.getInfo();
	}
	
	public T menorValor() {
		if (this.vazia()) {
			return null;
		}
		NoArvoreBST<T> no = (NoArvoreBST<T>) this.getRaiz();
		while (no.getEsq() != null) {
			no = (NoArvoreBST<T>) no.getEsq();
		}
		return no.getInfo();
	}
	
	public String toStringOrdered(){
		if (this.vazia()) {
			return "<>";
		}
		T valor = this.menorValor();
		String str = "["+valor;
		
		while (this.getSucessor(valor) != null) {
			valor = this.getSucessor(valor).getInfo();
			str += ", "+valor;
		}
		return str+"]";
	}
	
	public static void main(String[] args) {
		ArvoreBST<Veiculo> arvore = new ArvoreBST<>();
		arvore.inserir(new Veiculo("MJT-7432", "Fusca", 1912, "Pedro"));
		arvore.inserir(new Veiculo("MIT-8008", "Celta", 1999, "Douglas"));
		arvore.inserir(new Veiculo("MEI-4665", "Gol", 2002, "Carlos"));
		arvore.inserir(new Veiculo("MIO-6668", "Fusca", 1915, "Aline"));
		arvore.inserir(new Veiculo("DIO-3333", "Celta", 1999, "Fausto"));
		arvore.inserir(new Veiculo("PAO-6472", "C3", 2007, "Carolina"));
		arvore.inserir(new Veiculo("CAO-2890", "C4", 2012, "Kelvin"));
		arvore.inserir(new Veiculo("UVA-3939", "BMW", 2015, "Zé"));
		arvore.inserir(new Veiculo("OVO-0000", "Gol", 2000, "Joshua"));
		arvore.inserir(new Veiculo("ABC-1234", "Ferrari", 2015, "Marta"));
		System.out.println(arvore.toStringOrdered());
	}
}