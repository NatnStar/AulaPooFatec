package Arrays_Matrizes;

import java.util.Scanner;

public class Desafio_24 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] m = new int[5][5];

        System.out.println("Digite a matriz 5x5:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite o número a procurar: ");
        int x = sc.nextInt();

        boolean encontrou = false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (m[i][j] == x) {
                    System.out.println("Encontrado em: [" + i + "][" + j + "]");
                    encontrou = true;
                }
            }
        }

        if (!encontrou) {
            System.out.println("Número não encontrado.");
        }

        sc.close();
    }


}
