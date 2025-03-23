package Aula.Questao1;

public class App {
    public static void main(String[] args) {
        ListaEstatica<Integer> lista = new ListaEstatica<>(); // Specify type parameter
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.getTamanho();
        
        // Use System.out.println to print the result of the toString method
        System.out.println(lista.toString());
        System.out.println(lista.getTamanho());
        System.out.println(lista.buscar(15));
        System.out.println(lista.buscar(30));
        lista.retirar(10);
        System.out.println(lista.toString());
        System.out.println(lista.getTamanho());

        ListaEstatica lista2 = new ListaEstatica<>();
        for (int i = 0; i < 15; i++){
            lista2.inserir(i);
        }
        System.out.println(lista2.getTamanho());

        ListaEstatica lista3 = new ListaEstatica<>();
        lista3.inserir(5);
        lista3.inserir(10);
        lista3.inserir(15);
        lista3.inserir(20);
        System.out.println(lista3.obterElemento(3));
        //System.out.println(lista3.obterElemento(5));
        lista3.liberar();
        System.out.println(lista3.estaVazia());

    }
}
