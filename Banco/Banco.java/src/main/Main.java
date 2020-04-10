package main;
	
import java.util.Scanner;
import Lista01.*;
import Lista02.*;

public class Main {
    public static void main(String[] args) throws Exception {

            Scanner sc = new Scanner(System.in);

            Circulo circulo01 = new Circulo(sc.nextDouble()); // exercicio 02 Lista01.
    
            System.out.println(circulo01.area());
            System.out.println(circulo01.perimetro()); // fim do exercicio 02  Lista01.
            
            Circulo circulo02 = new Circulo(sc.nextDouble()); // exercicio 03  Lista01.
    
            Circulo circulo03 = new Circulo(circulo02.getRaio()*2);
    
            System.out.println(circulo02.area());
            System.out.println(circulo02.perimetro());

            System.out.println(circulo03.area());
            System.out.println(circulo03.perimetro()); // fim do exercicio 03 Lista01.


            Integer numero = sc.nextInt(); // exercicio 03  Lista02.
            Casa casa = new Casa(numero);
            casa.pintaCasa("Verde"); // fim do exercicio 03 Lista02.


            for (int i=0;i<casa.numeroPortas(); i++){ // exercicio 04  Lista02.
                if (i%2 == 0){
                    casa.getPortas().get(i).abrePorta();
                }
            } 
            System.out.println(casa.numeroPortas());
            System.out.println(casa.portasAbertas()); // fim do exercicio 04 Lista02.
 

            casa.toString(casa); // exercicio 05  Lista02.
            
            sc.close();
        
    }

}