package ListaDuplamenteEncadeada;

public class NoListaDupla<T> {
    private T info;
    private NoListaDupla<T> ant;
    private NoListaDupla<T> prox;
    
    public void setInfo(T info){
        this.info = info;
    }
    public T getInfo(){
        return info;
    }
    public void setProximo(NoListaDupla<T> proximo){
        this.prox = proximo;
    }
    public NoListaDupla<T> getProximo(){
        return prox;
    }
    public void setAnterior(NoListaDupla<T> anterior){
        this.ant = anterior;
    }
    public NoListaDupla<T> getAnterior(){
        return ant;
    }

}
