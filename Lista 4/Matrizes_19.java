package Arrays_Matrizes;

import java.util.Scanner;

public class Matrizes_19 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] m = new int[3][3];
        boolean identidade = true;

        System.out.println("Digite a matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt();

                if (i == j && m[i][j] != 1) {
                    identidade = false;
                }

                if (i != j && m[i][j] != 0) {
                    identidade = false;
                }
            }
        }

        if (identidade) {
            System.out.println("É uma matriz identidade.");
        } else {
            System.out.println("Não é uma matriz identidade.");
        }

        sc.close();
    }


}
