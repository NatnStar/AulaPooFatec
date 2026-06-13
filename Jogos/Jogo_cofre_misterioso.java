package Jogos;

import java.util.Random;
import java.util.Scanner;

public class Jogo_cofre_misterioso {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean continuar = true;
        int pontuacao = 0;

        System.out.println("=== Bem-vindo ao Cofre Misterioso ===");

        while (continuar) {

            int max = escolherDificuldade(sc);
            int segredo = random.nextInt(max) + 1;

            int tentativasMax = 5;
            boolean acertou = false;

            for (int tent = 1; tent <= tentativasMax; tent++) {

                int palpite = lerNumero(sc, "Tentativa " + tent + "/" + tentativasMax + " - Seu palpite: ");

                if (palpite == segredo) {
                    System.out.println("✅ Acertou! Cofre aberto. Código: " + segredo);
                    pontuacao += 10;
                    acertou = true;
                    break;
                } else if (palpite < segredo) {
                    System.out.println("🔼 O código é MAIOR. Restam " + (tentativasMax - tent) + " tentativas.");
                    pontuacao -= 2;
                } else {
                    System.out.println("🔽 O código é MENOR. Restam " + (tentativasMax - tent) + " tentativas.");
                    pontuacao -= 2;
                }
            }

            if (!acertou) {
                System.out.println("❌ Suas tentativas acabaram!");
                System.out.println("Código secreto era: " + segredo);
            }

            continuar = jogarNovamente(sc);
        }

        System.out.println("Pontuação final: " + pontuacao);
        System.out.println("Fim.");

        sc.close();
    }

    public static int escolherDificuldade(Scanner sc) {
    	
        int opcao;

        while (true) {
            System.out.println("\nEscolha a dificuldade:");
            System.out.println("1 - Fácil (1 a 20)");
            System.out.println("2 - Médio (1 a 50)");
            System.out.println("3 - Difícil (1 a 100)");
            System.out.print("Opção: ");

            if (sc.hasNextInt()) {
                opcao = sc.nextInt();

                if (opcao == 1) return 20;
                else if (opcao == 2) return 50;
                else if (opcao == 3) return 100;
                else System.out.println("Opção inválida!");
            } else {
                System.out.println("Digite apenas números.");
                sc.next(); 
            }
        }
    }

    
    public static int lerNumero(Scanner sc, String mensagem) {
    	
        int num;

        while (true) {
            System.out.print(mensagem);

            if (sc.hasNextInt()) {
                num = sc.nextInt();
                return num;
            } else {
                System.out.println("Entrada inválida! Digite apenas números.");
                sc.next(); 
            }
        }
    }

   
    public static boolean jogarNovamente(Scanner sc) {
    	
        String resp;

        do {
            System.out.print("\nDeseja jogar novamente? (s/n): ");
            resp = sc.next().toLowerCase();

            if (!resp.equals("s") && !resp.equals("n")) {
                System.out.println("Digite apenas 's' ou 'n'.");
            }

        } while (!resp.equals("s") && !resp.equals("n"));

        return resp.equals("s");
    }


}
