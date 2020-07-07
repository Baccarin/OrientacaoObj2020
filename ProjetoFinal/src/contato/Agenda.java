package contato;

import java.util.ArrayList;

import pessoa.Pessoa;

public class Agenda {
   
    public ArrayList<Pessoa> pessoas = new ArrayList<>();

    public Agenda (){
    }

    public void addPessoa(Pessoa pessoa){
        if(pessoa.comunicavel()){
            pessoas.add(pessoa);
        }
    }

    public void removePessoa(Pessoa pessoa){
        pessoas.remove(pessoa);
    }

    public ArrayList<Pessoa> getPessoas(){
        return this.pessoas;
    }
}