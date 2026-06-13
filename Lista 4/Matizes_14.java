package Arrays_Matrizes;

import java.util.Scanner;

public class Matizes_14 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[4][4];
        int maior = Integer.MIN_VALUE;

        System.out.println("Digite os valores da matriz 4x4:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = sc.nextInt();

                if (m[i][j] > maior) {
                    maior = m[i][j];
                }
            }
        }

        System.out.println("Maior valor: " + maior);

        sc.close();
    }



}
