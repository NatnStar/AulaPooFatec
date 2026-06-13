package Arrays_Matrizes;

import java.util.Scanner;

public class Arrays_8 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] v = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            v[i] = sc.nextInt();
        }

        System.out.print("Digite o valor X: ");
        int x = sc.nextInt();

        int contador = 0;

        for (int i = 0; i < 10; i++) {
            if (v[i] == x) {
                contador++;
            }
        }

        System.out.println("O número aparece " + contador + " vezes.");

        sc.close();
    }


}
