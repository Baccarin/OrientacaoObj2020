package main;
	
import java.util.Scanner;
import Lista01.*;

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




            sc.close();
        
    }

}