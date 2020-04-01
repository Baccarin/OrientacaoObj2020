package main;

public class ContaCorrente {

    protected Double saldo;
    protected Integer numero;
    protected Pessoa titular;

    public ContaCorrente (){
        
    }

    public ContaCorrente(Double saldo, Integer numero, Pessoa titular){
        this.saldo = saldo;
        this.numero = numero;
        this.titular = titular;
    }


    public Double getSaldo() {
        return this.saldo;
    }

    public void saque(Double valor){
        if (valor < saldo){
            saldo -= valor;
        }
    }

    public void deposito(Double valor){
        if (valor > 0) {
            saldo += valor;
        }
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Pessoa getTitular() {
        return this.titular;
    }

    public void transfereTitular(Pessoa titular) {
        this.titular = titular;
    }




}