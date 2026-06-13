package Arrays_Matrizes;

import java.util.Scanner;

public class Arrays_2 {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        int[] v = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite: ");
            v[i] = sc.nextInt();
            soma += v[i];
        }

        System.out.println("Soma = " + soma);

        sc.close();
    }



}
