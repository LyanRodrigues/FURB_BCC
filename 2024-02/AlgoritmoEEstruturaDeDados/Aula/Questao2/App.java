package Aula.Questao2;

public class App {
    public static void main(String[] args) {
        ListaEstatica<Integer> lista = new ListaEstatica<>(); // Specify type parameter
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.inserir(25);
        lista.inverter();
        System.out.println(lista.toString());

    }
}
 