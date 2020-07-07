package app;

public class Cliente {

    private String nome;
    private String cpf;
    private String email;

    public Cliente(String nome){
        this.nome = nome;
    }

    public Cliente (String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public Cliente (String nome, String email, String cpf){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
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

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.nome + "\n" +
        " E-mail: " + this.email + "\n" + 
        " CPF: " + this.cpf;
    }

}