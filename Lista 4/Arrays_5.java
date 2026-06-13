package Arrays_Matrizes;

import java.util.Scanner;

public class Arrays_5 {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        int[] v = new int[10];
        int pares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            v[i] = sc.nextInt();

            if (v[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Quantidade de pares: " + pares);

        sc.close();
    }


}
