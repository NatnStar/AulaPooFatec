package Arrays_Matrizes;

import java.util.Scanner;

public class Matrizes_20 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] m = new int[3][3];

        System.out.println("Digite a matriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            int somaLinha = 0;
            int somaColuna = 0;

            for (int j = 0; j < 3; j++) {
                somaLinha += m[i][j];
                somaColuna += m[j][i];
            }

            System.out.println("Soma da linha " + i + ": " + somaLinha);
            System.out.println("Soma da coluna " + i + ": " + somaColuna);
        }

        sc.close();
    }


}
