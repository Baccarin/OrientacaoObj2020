package Lista03;

public class ContaCorrente {

    protected Double saldo;
    protected Double limite;

    public ContaCorrente (){

    }

    public ContaCorrente (Double saldo){
        this.saldo = saldo;
    }

    public ContaCorrente(Double saldo, Double limite){
        this.saldo = saldo;
        this.limite = limite;
    }


    public Double getSaldo() {
        return this.saldo;
    }

    public Double saque (Double valor){
        if (valor < saldo + limite){
            return saldo -= valor;
        }
        return saldo;
    }

    public Double deposito(Double valor){
        if (valor >= 0) {
            return saldo += valor;
        }
        return saldo;
    }

    public Double getLimite() {
        return this.limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

}