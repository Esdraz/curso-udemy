package application;

import entities.Conta;

import java.util.Scanner;

public class ContaPrograma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conta conta;
        int opcao = 0;

        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o nome do titular da conta: ");
        String titular = sc.nextLine();
        System.out.print("Efetuar um deposito inicial (S/N)? ");
        char resposta = sc.next().charAt(0);
        if (resposta == 's') {
            System.out.print("Digite o valor do deposito inicial: ");
            double valorDepositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, valorDepositoInicial);
        } else {
            conta = new Conta(numero, titular);
        }

        System.out.println("----------------------");
        System.out.println("Dados da conta:");
        System.out.println(conta);

        do {

            System.out.println("--------------------------");
            System.out.println("Menu Principal:");
            System.out.println("(1) - Depositar");
            System.out.println("(2) - Sacar");
            System.out.println("(3) - Informações da conta");
            System.out.println("(4) - Finalizar aplicação");
            System.out.println("--------------------------");

            System.out.print("Digite uma das opções acima: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do deposito: ");
                    double valorDeposito = sc.nextDouble();
                    conta.depositar(valorDeposito);
                    System.out.println("----------------------");
                    System.out.println("Dados da conta atualizado:");
                    System.out.println(conta);
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = sc.nextDouble();
                    conta.sacar(valorSaque);
                    System.out.println("----------------------");
                    System.out.println("Dados da conta atualizado:");
                    System.out.println(conta);
                    break;
                case 3:
                    System.out.println("Dados da conta:");
                    System.out.println(conta);
                    break;
                case 4:
                    System.out.println("Finalizando aplicação...");
                    break;
            }
        } while (opcao != 4);


        sc.close();
    }
}
