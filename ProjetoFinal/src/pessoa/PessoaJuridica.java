package pessoa;

import contato.Contato;

public class PessoaJuridica extends Pessoa {

    protected String cnpj;

    public PessoaJuridica(String nome, String sobrenome, String cnpj) {
        super.nome = nome;
        super.sobrenome = sobrenome;
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    @Override
    public void setContato(Contato contato) {
        this.contato = contato;
    }


}