package Funcoes;

import java.util.Scanner;

public class Ex_9 {

	static double saldo = 0;

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            opcao = mostrarMenu(sc);

            switch (opcao) {
                case 1: depositar(sc); break;
                case 2: sacar(sc); break;
                case 3: consultarSaldo(); break;
                case 4: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida");
            }

        } while (opcao != 4);

        sc.close();
    }

    static int mostrarMenu(Scanner sc) {
        System.out.println("\n1-Depositar");
        System.out.println("2-Sacar");
        System.out.println("3-Consultar saldo");
        System.out.println("4-Sair");
        System.out.print("Escolha: ");
        return sc.nextInt();
    }

    static void depositar(Scanner sc) {
        System.out.print("Valor para depositar: ");
        double valor = sc.nextDouble();
        saldo += valor;
    }

    static void sacar(Scanner sc) {
        System.out.print("Valor para sacar: ");
        double valor = sc.nextDouble();

        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    static void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }


}
