package Arrays_Matrizes;

import java.util.Scanner;

public class Matrizes_17 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] m = new int[3][3];

        System.out.println("Digite a matriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite o número escalar: ");
        int escalar = sc.nextInt();

        System.out.println("Resultado:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((m[i][j] * escalar) + " ");
            }
            System.out.println();
        }

        sc.close();
    }


}
