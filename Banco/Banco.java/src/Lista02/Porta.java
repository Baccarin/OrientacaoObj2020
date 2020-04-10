package Lista02;

public class Porta {

    private boolean portaAberta = false;

    public Porta(){

    }

    public Porta (Boolean aberta){
        this.portaAberta = aberta;
    }

    public boolean estaAberta(){
        return portaAberta;
    }

    public void abrePorta(){
        if (!estaAberta()){
            this.portaAberta = true;
            System.out.println("Porta aberta!");
        }
 
    }
    public void fechaPorta(){
        if (estaAberta()){
            this.portaAberta = false;
            System.out.println("Porta fechada!");
        }
 
    }

}