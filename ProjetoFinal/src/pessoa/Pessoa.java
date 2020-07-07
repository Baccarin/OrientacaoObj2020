package pessoa;

import contato.*;

public abstract class Pessoa implements Comunicavel {

    protected String nome;
    protected String sobrenome;
    protected Contato contato;

    public Contato getContato() {
        return contato;
    }

    abstract public void setContato(Contato contato); 
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    @Override
    public boolean comunicavel() {
        return getContato() == null;
    }

}
