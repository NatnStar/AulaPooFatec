package Arrays_Matrizes;

import java.util.Scanner;

public class Matrizes_13 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3];
        int soma = 0;

        System.out.println("Digite a matriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt();
            }
            soma += m[i][i];
        }

        System.out.println("Soma da diagonal principal = " + soma);

        sc.close();
    }


}
