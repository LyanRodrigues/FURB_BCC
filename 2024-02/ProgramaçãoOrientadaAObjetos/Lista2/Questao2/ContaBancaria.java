package Aula.Lista2.Questao2;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double v){
        if (v <=  0){
            System.out.println("Depósito deve ser maior que zero.");
        } else {
            System.out.println("Valor de R$"+ v +" depositado na conta de "+ getTitular()+" ." );
            setSaldo(getSaldo()+v);
        }
    }
    public void sacar(double v){
        if (v <=  0){
            System.out.println("Saque deve ser maior que zero.");
        } else if(v > this.getSaldo()){
            System.out.println("Saque fora do limite de saldo. Seu saldo é de "+ getSaldo()+" .");
        } else {
            System.out.println("Valor de R$"+ v +" sacado na conta de "+ getTitular()+" ." );
            setSaldo(getSaldo()-v);
        }
    }
    public void transferir(ContaBancaria contaDestino, double v){
        if (v <=  0){
            System.out.println("Transferencia deve ser maior que zero.");
        } else if(v > getSaldo()){
            System.out.println("Transferencia fora do limite de saldo. Seu saldo é de "+ getSaldo()+" .");
        } else {
            System.out.println("Valor de R$"+ v +" depositado na conta de "+ contaDestino.getTitular()+" ." );
            contaDestino.setSaldo(contaDestino.getSaldo()+v);
            setSaldo(getSaldo()-v);
        }
    }
}
