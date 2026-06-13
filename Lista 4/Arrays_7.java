package Arrays_Matrizes;

import java.util.Scanner;

public class Arrays_7 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] v = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            v[i] = sc.nextInt();
        }

        System.out.print("Digite o valor que deseja buscar: ");
        int x = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < 10; i++) {
            if (v[i] == x) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Valor encontrado no array.");
        } else {
            System.out.println("Valor NÃO encontrado.");
        }

        sc.close();
    }


}
