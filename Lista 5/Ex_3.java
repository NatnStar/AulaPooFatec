package Funcoes;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = lerNumero(sc);
        boolean par = ehPar(numero);
        mostrarResultado(par);

        sc.close();
    }

    static int lerNumero(Scanner sc) {
        System.out.print("Digite um número: ");
        return sc.nextInt();
    }

    static boolean ehPar(int n) {
        return n % 2 == 0;
    }

    static void mostrarResultado(boolean par) {
        if (par)
            System.out.println("É par");
        else
            System.out.println("É ímpar");
    }

    

}
