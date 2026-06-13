package Funcoes;

import java.util.Scanner;

public class Ex_15 {

static int pontos = 0;

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        iniciarJogo();
        executarTurno(sc);
        encerrarJogo();

        sc.close();
    }

    static void iniciarJogo() {
        System.out.println("=== Quiz ===");
    }

    static void executarTurno(Scanner sc) {
        System.out.println("Quanto é 2 + 2?");
        int resposta = sc.nextInt();

        if (resposta == 4) {
            System.out.println("Correto!");
            pontos++;
        } else {
            System.out.println("Errado!");
        }
    }

    static void encerrarJogo() {
        System.out.println("Pontuação final: " + pontos);
    }


}
