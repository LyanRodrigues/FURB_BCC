package Aula.Lista2.Questao1;

public class Pessoa {
    private String nome;
    private double altura;
    private double peso;

    public Pessoa(String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    double calcularIMC(){
        return peso/(altura*altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura > 3){
            throw new IllegalArgumentException("Altura inválida.");
        }
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso < 0){
            throw new IllegalArgumentException("Peso inválido.");
        }
        this.peso = peso;
    }
}