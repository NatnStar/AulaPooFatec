package Arrays_Matrizes;

import java.util.Scanner;

public class Arrays_4 {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        int[] v = new int[6];
        double soma = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite um número: ");
            v[i] = sc.nextInt();
            soma += v[i];
        }

        double media = soma / 6;

        System.out.println("Média: " + media);

        sc.close();
    }



}
