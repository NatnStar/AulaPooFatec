package Jogos;

import java.util.Scanner;

public class Jogos_adivinhacao_numerica {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        System.out.println("=== JOGO DE ADIVINHAÇÃO NUMÉRICA ===");

        System.out.println("\nEscolha a versão:");
        System.out.println("1 - Usando FOR");
        System.out.println("2 - Usando WHILE");
        System.out.println("3 - Usando DO-WHILE");

        int opcao = sc.nextInt();

        if (opcao == 1) {
            jogoFor(sc);
        } else if (opcao == 2) {
            jogoWhile(sc);
        } else if (opcao == 3) {
            jogoDoWhile(sc);
        } else {
            System.out.println("Opção inválida!");
        }

        sc.close();
    }

    public static void jogoFor(Scanner sc) {

        int secreto = (int)(Math.random() * 100) + 1;
        int maxTentativas = 10;

        System.out.println("\n=== Versão FOR ===");

        for (int i = 1; i <= maxTentativas; i++) {

            int palpite = lerNumero(sc, "Tentativa " + i + ": ");

            if (palpite < 1 || palpite > 100) {
                System.out.println("Número fora do intervalo (1-100)!");
                i--; 
                continue;
            }

            if (palpite == secreto) {
                System.out.println("✅ Você acertou!");
                return;
            } else if (palpite > secreto) {
                System.out.println("🔽 O número secreto é menor!");
            } else {
                System.out.println("🔼 O número secreto é maior!");
            }
        }

        System.out.println("❌ Acabaram as tentativas.");
        System.out.println("O número era: " + secreto);
    }

    public static void jogoWhile(Scanner sc) {

        int secreto = (int)(Math.random() * 100) + 1;
        int tentativas = 0;
        int maxTentativas = 10;
        boolean acertou = false;

        System.out.println("\n=== Versão WHILE ===");

        while (tentativas < maxTentativas && !acertou) {

            int palpite = lerNumero(sc, "Tentativa " + (tentativas + 1) + ": ");

            if (palpite < 1 || palpite > 100) {
                System.out.println("Número fora do intervalo (1-100)!");
                continue;
            }

            tentativas++;

            if (palpite == secreto) {
                System.out.println("✅ Você acertou!");
                acertou = true;
            } else if (palpite > secreto) {
                System.out.println("🔽 O número secreto é menor!");
            } else {
                System.out.println("🔼 O número secreto é maior!");
            }
        }

        if (!acertou) {
            System.out.println("❌ Acabaram as tentativas.");
            System.out.println("O número era: " + secreto);
        }
    }

    public static void jogoDoWhile(Scanner sc) {

        int secreto = (int)(Math.random() * 100) + 1;
        int tentativas = 0;
        int maxTentativas = 10;
        boolean acertou = false;

        System.out.println("\n=== Versão DO-WHILE ===");

        do {

            int palpite = lerNumero(sc, "Tentativa " + (tentativas + 1) + ": ");

            if (palpite < 1 || palpite > 100) {
                System.out.println("Número fora do intervalo (1-100)!");
                continue;
            }

            tentativas++;

            if (palpite == secreto) {
                System.out.println("✅ Você acertou!");
                acertou = true;
            } else if (palpite > secreto) {
                System.out.println("🔽 O número secreto é menor!");
            } else {
                System.out.println("🔼 O número secreto é maior!");
            }

        } while (tentativas < maxTentativas && !acertou);

        if (!acertou) {
            System.out.println("❌ Acabaram as tentativas.");
            System.out.println("O número era: " + secreto);
        }
    }

    public static int lerNumero(Scanner sc, String mensagem) {

        int numero;

        while (true) {
            System.out.print(mensagem);

            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                return numero;
            } else {
                System.out.println("Entrada inválida! Digite um número.");
                sc.next(); 
            }
        }
    }


}
