package lacos_de_repeticao;

import java.util.Scanner;

public class Ex_9 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número positivo: ");
		
		int num = sc.nextInt();
		
		int fatorial = 1;
		
		for (int i = 1; i <= num; i++) {
			fatorial *= i;
			
		}
		
		System.out.println("Fatorial: " + fatorial);
		
		sc.close();
		
	}

}
