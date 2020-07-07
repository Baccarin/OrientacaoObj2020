package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {   
        
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco("Banco do Baccarin");

        Boolean continua = true;

        while (continua) {

            System.out.println("Operação 1: Adicionar Conta Corrente");
            System.out.println("Operação 2: Remover Conta Corrente");
            System.out.println("Operação 3: Depositar");
            System.out.println("Operação 4: Sacar");
            System.out.println("Operação 5: Imprimir Contas Correntes");
            System.out.println("Operação 6: Encerrar");
            System.out.println("Selecione a operação desejada:");


        switch (sc.nextInt()){

            //Adicionar ContaCorrente
            case 1: 
                sc.nextLine();
                System.out.println("Digite o nome do cliente:");
                String nome = sc.nextLine();
                System.out.println("Digite o email do cliente:");
                String email = sc.nextLine();
                System.out.println("Digite o cpf do cliente:");
                String cpf = sc.nextLine();
                System.out.println("Digite o numero da agência do cliente:");
                String numeroAgencia = sc.nextLine();
                System.out.println("Digite o numero da conta do cliente:");
                String numeroConta = sc.nextLine();
                Cliente cliente = new Cliente(nome, email, cpf);
                ContaCorrente conta1 = new ContaCorrente(numeroAgencia, numeroConta, cliente);
                banco.adicionaConta(conta1);
            break;

            case 2:
                sc.nextLine();
                System.out.println("Digite o numero da conta que deseja remover:");
                String numeroContaCase2 = sc.nextLine();
                int contaExisteCase2 = 0;
                int index = 0;
                for (ContaCorrente contaCase2 : banco.getContas()){
                        if (contaCase2.getNumeroConta().equals(numeroContaCase2) ){
                            index = banco.getContas().indexOf(contaCase2);
                            contaExisteCase2++;
                        }
                    }
                
                if (contaExisteCase2 == 0){
                    System.out.println("Conta não existe!");
                }else {
                    banco.removeConta(index);
                }
            break;


            //Depositar
            case 3:
            sc.nextLine();
            System.out.println("Digite o numero da conta que desejada:");
            String numeroContaCase3 = sc.nextLine();
            System.out.println("Digite o valor a ser depositado:");
            Double valorCase3 = sc.nextDouble();
            int contaExisteCase3 = 0;
            for (ContaCorrente contaCase3 : banco.getContas()){
                System.out.println(contaCase3.getNumeroConta());
                if (contaCase3.getNumeroConta().equals(numeroContaCase3)){
                    contaCase3.depositar(valorCase3);
                    contaExisteCase3++;
                }
            }
            if (contaExisteCase3 == 0){
                System.out.println("Conta não existe!");
            }
            break;

            //Sacar
            case 4:
            sc.nextLine();
            System.out.println("Digite o numero da conta que desejada:");
            String numeroContaCase4 = sc.nextLine();
            System.out.println("Digite o valor a ser sacado:");
            Double valorCase4 = sc.nextDouble();
            int contaExisteCase4 = 0;
            for (ContaCorrente contaCase4 : banco.getContas()){
                if (contaCase4.getNumeroConta().equals(numeroContaCase4)){
                    contaCase4.sacar(valorCase4);
                    contaExisteCase4++;
                }
            }
            if (contaExisteCase4 == 0){
                System.out.println("Conta não existe!");
            }
            break;

            //Imprimir todas as contas
            case 5:
                System.out.println(banco.getContas().toString());
            break;

            case 6:
                sc.close();
                continua = false;
            break;

            default:
                System.out.println("Digite uma operação válida!");

        }

    }
    }
}