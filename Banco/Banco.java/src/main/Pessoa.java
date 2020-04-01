package main;

public class Pessoa {

    String nome;
    String cpf;
    String rg;
    Integer idade;

    public Pessoa(){

    }

    public Pessoa(String nome,String cpf,String rg,Integer idade){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
        
    }

    public boolean validaCpf (String cpf){
        if(cpf.length() < 11){
            return false;   
        }
        return true;
    }

    public boolean validaRg (String rg){
        if(rg.length() < 8){
            return false;   
        }
        return true;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }


    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }



}