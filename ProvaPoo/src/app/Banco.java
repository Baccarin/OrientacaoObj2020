package app;

import java.util.ArrayList;

public class Banco {

    private String nomeBanco;
    private ArrayList<ContaCorrente> contas;

    public Banco (String nome){
        this.nomeBanco = nome;
        this.contas = new ArrayList<ContaCorrente>();
    }

    public String getNomeBanco() {
        return this.nomeBanco;
    }


    public ArrayList<ContaCorrente> getContas() {
        return this.contas;
    }

    public void adicionaConta(ContaCorrente conta){
        this.contas.add(conta);
    }

    public void removeConta(int numeroConta){
        this.contas.remove(numeroConta);
    }

    public void depositar(int numeroConta, Double valor){
        contas.get(numeroConta).depositar(valor);
    }

    public void sacar(int numeroConta, Double valor){
        contas.get(numeroConta).sacar(valor);
    }

    public Integer totalDeContas(){
        return contas.size();
    }

    @Override
    public String toString(){
        return "Nome de banco: " + this.nomeBanco + "\n" + this.contas + "\n" ;
    }

}