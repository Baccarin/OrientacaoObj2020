package contato;

public class Contato {

    protected TipoContato tipo;
    protected String telefone;
    protected String contato;

    public Contato(String telefone, TipoContato tipo, String contato) {
        this.telefone = telefone;
        this.tipo = tipo;
        this.contato = contato;

    }

    public TipoContato getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoContato tipo) {
        this.tipo = tipo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

}
