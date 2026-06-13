package Funcoes;

import java.util.Scanner;

public class Ex_14 {

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
                case 4: encerrarSistema(); break;
                default: System.out.println("Opção inválida");
            }

        } while (opcao != 4);

        sc.close();
    }

    static int mostrarMenu(Scanner sc) {
        System.out.println("\n1-Depositar");
        System.out.println("2-Sacar");
        System.out.println("3-Saldo");
        System.out.println("4-Sair");
        return sc.nextInt();
    }

    static void depositar(Scanner sc) {
        System.out.print("Valor: ");
        saldo += sc.nextDouble();
    }

    static void sacar(Scanner sc) {
        System.out.print("Valor: ");
        double valor = sc.nextDouble();

        if (valor <= saldo) saldo -= valor;
        else System.out.println("Saldo insuficiente!");
    }

    static void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    static void encerrarSistema() {
        System.out.println("Sistema encerrado.");
    }


}
