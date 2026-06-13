package Arrays_Matrizes;

import java.util.Scanner;

public class Desafio_23 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] m = new int[3][3];
        int[][] rot = new int[3][3];

        System.out.println("Digite a matriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rot[j][2 - i] = m[i][j];
            }
        }

        System.out.println("Matriz rotacionada:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(rot[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }


}
