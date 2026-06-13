package lacos_de_repeticao;

import java.util.Scanner;

public class Ex_7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int positivos = 0, negativos = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite um número: ");
			
			int n = sc.nextInt();
			
			if (n > 0) {
				positivos++;
			} else if (n < 0) {
				negativos++;
			}
		}
		
		System.out.println("Positivos: " + positivos);
		System.out.println("Negativos: " + negativos);
		sc.close();
	}

}
