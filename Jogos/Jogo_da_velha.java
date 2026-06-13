package Jogos;

import java.util.Scanner;

public class Jogo_da_velha {

	static char[][] tabuleiro = new char[3][3];

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        inicializarTabuleiro();

        char jogadorAtual = 'X';
        boolean jogoAtivo = true;

        while (jogoAtivo) {
            imprimirTabuleiro();

            int linha, coluna;

            while (true) {
                System.out.println("Jogador " + jogadorAtual + ", informe linha e coluna (1 a 3): ");
                linha = sc.nextInt() - 1;
                coluna = sc.nextInt() - 1;

                if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                    System.out.println("Posição inválida! Use valores entre 1 e 3.");
                } else if (tabuleiro[linha][coluna] != ' ') {
                    System.out.println("Essa posição já está ocupada!");
                } else {
                    break;
                }
            }

            
            tabuleiro[linha][coluna] = jogadorAtual;

            
            if (verificarVitoria(jogadorAtual)) {
                imprimirTabuleiro();
                System.out.println("Jogador " + jogadorAtual + " venceu!");
                jogoAtivo = false;
            }
           
            else if (verificarEmpate()) {
                imprimirTabuleiro();
                System.out.println("Empate! Nenhum jogador venceu.");
                jogoAtivo = false;
            }
            
            else {
                if (jogadorAtual == 'X') {
                    jogadorAtual = 'O';
                } else {
                    jogadorAtual = 'X';
                }
            }
        }

        sc.close();
    }

    
    public static void inicializarTabuleiro() {
    	
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    
    public static void imprimirTabuleiro() {
    	
        System.out.println("\n   1   2   3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tabuleiro[i][j] + " ");
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  ---+---+---");
        }
        System.out.println();
    }

    
    public static boolean verificarVitoria(char jogador) {
        
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador &&
                tabuleiro[i][1] == jogador &&
                tabuleiro[i][2] == jogador) {
                return true;
            }
        }

        
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j] == jogador &&
                tabuleiro[1][j] == jogador &&
                tabuleiro[2][j] == jogador) {
                return true;
            }
        }

        
        if (tabuleiro[0][0] == jogador &&
            tabuleiro[1][1] == jogador &&
            tabuleiro[2][2] == jogador) {
            return true;
        }

        
        if (tabuleiro[0][2] == jogador &&
            tabuleiro[1][1] == jogador &&
            tabuleiro[2][0] == jogador) {
            return true;
        }

        return false;
    }

    
    public static boolean verificarEmpate() {
    	
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }


}
