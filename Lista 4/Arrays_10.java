package Arrays_Matrizes;

import java.util.Scanner;

public class Arrays_10 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] v = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            v[i] = sc.nextInt();
        }

        System.out.println("Valores únicos:");

        for (int i = 0; i < 10; i++) {
            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (v[i] == v[j]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                System.out.println(v[i]);
            }
        }

        sc.close();
    }


}
