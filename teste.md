]package app;


public class ContaCorrente{

    private Double saldo;
    private String titular;
    private String conta;
    private String agencia;


    public void deposito(final Double valor){
        saldo = saldo + valor;
    }

    public void saque(final Double valor){
        if (valor > saldo){
            return;
        }
        saldo = saldo - valor;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void trocaTitular(final String titular) {
        this.titular = titular;
    }

    public String getConta() {
        return this.conta;
    }

    public void setConta(final String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(final String agencia) {
        this.agencia = agencia;
    }


    public ContaCorrente(){
        
    }
    
    public ContaCorrente(Double saldo,String titular,String conta,String agencia){
        this.saldo = saldo;
        this.titular = titular;
        this.conta = conta;
        this.agencia = agencia;
    }


    

}



/* teste de segundo commit*/
