package contato;

public enum TipoContato {
    
    EMAIL("Email"),WHATSAPP("WHATSAPP"),FAX("Fax"),SINAL_FUMACA("Sinal de fumaça");

    private final String descricao;

    TipoContato(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }
}