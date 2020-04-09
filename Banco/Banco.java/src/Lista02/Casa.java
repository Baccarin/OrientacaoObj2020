package Lista02;

public class Casa {

    String endereco;
    String cor;
    Integer numero;
    
    protected Double preco;

    public Casa(){

    }

    public Casa(String endereco, String cor, Integer numero,Double preco){
        this.endereco = endereco;
        this.cor = cor;
        this.numero = numero;
        this.preco = preco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCor() {
        return this.cor;
    }

    public void pintaCasa(String cor) {
        this.cor = cor;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }



   /* public void compraCasa(Pessoa dono, ContaCorrente contaComprador,ContaCorrente contaVendedor, Double valor) {
        if(validaCompra(contaComprador, valor)){
            this.dono = dono;
            contaComprador.saque(valor);
            contaVendedor.deposito(valor);
        }
     }*/

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

   /* public boolean validaCompra(ContaCorrente conta, Double valor){
        if (conta.getSaldo() < valor){
            return false;
        }
        return true;
    }*/

}