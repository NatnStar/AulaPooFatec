package Funcoes;


import java.util.Random;
import java.util.Scanner;


public class Ex_12 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        int jogador = jogadaJogador(sc);
        int computador = jogadaComputador();

        int vencedor = verificarVencedor(jogador, computador);
        mostrarResultado(vencedor);

        sc.close();
    }

    static int jogadaJogador(Scanner sc) {
        System.out.println("0-Pedra 1-Papel 2-Tesoura");
        return sc.nextInt();
    }

    static int jogadaComputador() {
        return new Random().nextInt(3);
    }

    static int verificarVencedor(int j, int c) {
        if (j == c) return 0;
        if ((j == 0 && c == 2) || (j == 1 && c == 0) || (j == 2 && c == 1)) return 1;
        return 2;
    }

    static void mostrarResultado(int v) {
        if (v == 0) System.out.println("Empate");
        else if (v == 1) System.out.println("Jogador venceu");
        else System.out.println("Computador venceu");
    }


}
