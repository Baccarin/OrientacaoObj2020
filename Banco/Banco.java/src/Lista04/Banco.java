package Lista04;

import java.util.ArrayList;
import Lista03.ContaCorrente;

public class Banco {

    private String nome;
    private ArrayList<ContaCorrente> contas;


    public Banco (String nome){
        this.nome = nome;
    }

    public Banco (String nome , Integer numeroDeContas){
        this.nome = nome;
        contas = new ArrayList<ContaCorrente>();
        for (int i=0;i<numeroDeContas; i++){
            ContaCorrente conta = new ContaCorrente();
            contas.add(conta);
        }  
    }

    public String getNome() {
        return this.nome;
    }

    public ArrayList<ContaCorrente> getContas() {
        return this.contas;
    }

    public void adicionaContaCorrente(ContaCorrente conta){
        contas.add(conta);
    }

    public Integer numeroContas(){
        return contas.size();
    }

    public void toString(Banco banco){
        contas.forEach((conta) -> System.out.println("Saldo da conta: " + 
        conta.getSaldo()  
        + "  Limite da conta: " 
        +conta.getLimite()));
    }

}