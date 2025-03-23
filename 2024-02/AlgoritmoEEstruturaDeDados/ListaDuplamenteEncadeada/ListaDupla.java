package ListaDuplamenteEncadeada;

public class ListaDupla<T> {
    private NoListaDupla<T> primeiro;

    public ListaDupla(){
        this.primeiro = null;
    }
    public NoListaDupla<T> getPrimeiro(){
        return primeiro;
    }
    public void inserir(T valor){
        NoListaDupla<T> novo = new NoListaDupla<>();
        
    }
    public void retirar(T valor){

    }
    public void exibirOrdemInversa(){

    }
    public void liberar(){

    }

    @Override
    public String toString() {
        return "ListaDupla []";
    }
    
}
