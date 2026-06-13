package Arrays_Matrizes;

import java.util.Scanner;

public class Arrays_1 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("Valores:");
        for (int i = 0; i < 5; i++) {
            System.out.println(vet[i]);
        }

        sc.close();
    }

}
