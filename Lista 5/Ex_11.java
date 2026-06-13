package Funcoes;


import java.util.Random;
import java.util.Scanner;


public class Ex_11 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        int numero = sortearNumero();
        int palpite;

        do {
            palpite = lerPalpite(sc);
            mostrarDica(numero, palpite);
        } while (!verificarAcerto(numero, palpite));

        mostrarVitoria();

        sc.close();
    }

    static int sortearNumero() {
        return new Random().nextInt(10) + 1;
    }

    static int lerPalpite(Scanner sc) {
        System.out.print("Digite um número: ");
        return sc.nextInt();
    }

    static boolean verificarAcerto(int numero, int palpite) {
        return numero == palpite;
    }

    static void mostrarDica(int numero, int palpite) {
        if (palpite < numero) {
            System.out.println("Maior!");
        } else if (palpite > numero) {
            System.out.println("Menor!");
        }
    }

    static void mostrarVitoria() {
        System.out.println("Você acertou!");
    }


}
