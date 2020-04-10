package Lista02;

import java.util.ArrayList;

public class Casa {

    private String cor;
    private ArrayList<Porta> portas;

    public Casa(){

    }

    public Casa(String cor){
        this.cor = cor;
    }

    public Casa (Integer numeroDePortas){
        portas = new ArrayList<Porta>();
        for (int i=0;i<numeroDePortas; i++){
            Porta porta = new Porta();
            portas.add(porta);
        }  
    }

    public void pintaCasa(String cor){
        this.cor = cor;
        System.out.println("A casa foi pintada de: " + cor );
    }

    public void adicionaPorta(Porta porta){
        portas.add(porta);
    }

    public Integer numeroPortas(){
        return portas.size();
    }

    public int portasAbertas(){
        int numPortasAbertas = 0;
        for (Porta porta : portas) {
            if (porta.estaAberta()){
                numPortasAbertas++;
            }
        }
        return numPortasAbertas;
    }

    public int portasFechadas(){
        int numPortasFechadas = 0;
        for (Porta porta : portas) {
            if (!porta.estaAberta()){
                numPortasFechadas++;
            }
        }
        return numPortasFechadas;
    }

    public ArrayList<Porta> getPortas() {
        return this.portas;
    }

    public String getCor() {
        return this.cor;
    }

    public void toString(Casa casa){
        System.out.println(casa.getCor());
        System.out.println(casa.numeroPortas());
        System.out.println(casa.portasAbertas());
        System.out.println(casa.portasFechadas());
    }

}