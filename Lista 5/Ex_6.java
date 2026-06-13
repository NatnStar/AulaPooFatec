package Funcoes;

import java.util.Scanner;

public class Ex_6 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        int numero = lerNumero(sc);
        exibirTabuada(numero);

        sc.close();
    }

    static int lerNumero(Scanner sc) {
        System.out.print("Digite um número: ");
        return sc.nextInt();
    }

    static void mostrarLinha(int numero, int i) {
        System.out.println(numero + " x " + i + " = " + (numero * i));
    }

    static void exibirTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            mostrarLinha(numero, i);
        }
    }



}
