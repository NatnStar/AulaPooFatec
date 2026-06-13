package Arrays_Matrizes;

import java.util.Scanner;

public class Desafio_22 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] m = new int[3][3];
        boolean valido = true;

        System.out.println("Digite a matriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if ((i != k || j != l) && m[i][j] == m[k][l]) {
                            valido = false;
                        }
                    }
                }
            }
        }

        if (valido) {
            System.out.println("Não possui repetição.");
        } else {
            System.out.println("Possui números repetidos.");
        }

        sc.close();
    }


}
