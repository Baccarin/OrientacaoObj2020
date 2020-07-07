package app;

public class ContaCorrente {

    private String numeroAgencia;
    private String numeroConta;
    private Cliente cliente;
    private Double saldo;


    public ContaCorrente (String numeroAgencia, String numeroConta, Cliente cliente){
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.saldo = 0.00;
    }


    public String getNumeroAgencia() {
        return this.numeroAgencia;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    protected Boolean sacar(Double valor){
        if (valor > this.saldo){
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    protected Boolean depositar(Double valor){
        if (valor > 0){
            this.saldo += valor;
            return true;
        }  
        return false;
    }

    @Override
    public String toString(){
        return  this.cliente.toString() + "\n" +
        " Agência: " + this.numeroAgencia + "\n" +
        " Conta: " + this.numeroConta + "\n" + 
        " Saldo: " + this.saldo;
    }


}