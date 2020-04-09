package Lista01;


public class Circulo {

    private Double raio;

    public Circulo(){

    }

    public Circulo(Double raio){
        this.raio = raio;
    }

    public Double getRaio() {
        return this.raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    public Double perimetro(){
         return (raio*2)*3.14;
    }

    public Double area(){
        return (raio*raio)*3.14;
    }



}