package Arrays_Matrizes;

import java.util.Scanner;

public class Arrays_9 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] v = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            v[i] = sc.nextInt();
        }

        // Ordenação Bubble Sort
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }

        System.out.println("Array ordenado:");
        for (int i = 0; i < 10; i++) {
            System.out.println(v[i]);
        }

        sc.close();
    }


}
