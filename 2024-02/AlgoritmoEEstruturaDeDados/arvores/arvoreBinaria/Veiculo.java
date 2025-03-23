package arvores;

public class Veiculo implements Comparable<Veiculo> {
	private String placa;
	private String modelo;
	private int ano;
	private String proprietario;
	
	public Veiculo(
			String placa,
			String modelo,
			int ano,
			String proprietario) {
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.proprietario = proprietario;
	}
	
	public String toString() {
		return "Veiculo "+modelo+", "
				+placa+", "+ano+", de "
				+proprietario;
	}

	public int compareTo(Veiculo v) {
		return this.placa.compareTo(v.placa);
	}
}
