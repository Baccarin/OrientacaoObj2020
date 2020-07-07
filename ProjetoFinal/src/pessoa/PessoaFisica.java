package pessoa;

import contato.Contato;

public class PessoaFisica extends Pessoa {

    protected String cpf;

    public PessoaFisica(String nome,String sobrenome, String cpf) {
        super.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    @Override
    public void setContato(Contato contato) {
        this.contato = contato;
    }

}