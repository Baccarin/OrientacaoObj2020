package main;

public class Carro {

    public String cor;
    public Integer ano;
    public String modelo;
    protected Double preco;
    protected Pessoa dono;

    public Carro(){

    }

    public Carro(String cor, Integer ano,String modelo, Double preco, Pessoa dono){
        this.cor = cor;
        this.ano = ano;
        this.modelo = modelo;
        this.preco = preco;
        this.dono = dono;
    }


    public String getCor() {
        return this.cor;
    }

    public void pintaCarro(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return this.ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Pessoa getDono() {
        return this.dono;
    }

    public boolean validaCompra(ContaCorrente conta, Double valor){
        if (conta.getSaldo() < valor){
            return false;
        }
        return true;
    }

    public void compraCarro(Pessoa dono, ContaCorrente contaComprador,ContaCorrente contaVendedor, Double valor) {
       if(validaCompra(contaComprador, valor)){
           this.dono = dono;
           contaComprador.saque(valor);
           contaVendedor.deposito(valor);
       }
    }
    


}