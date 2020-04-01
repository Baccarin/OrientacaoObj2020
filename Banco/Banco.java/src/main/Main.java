package main;
	

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //ContaCorrente[] contas1 = new ContaCorrente[num];
        ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>();

        for (int i=0;i<num;i++){
            double saldo = sc.nextDouble();
            contas.add(new ContaCorrente(saldo));
        }

        contas.forEach((conta) -> System.out.println(conta.getSaldo()));


    }
}