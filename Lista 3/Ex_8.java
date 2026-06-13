package lacos_de_repeticao;

import java.util.Scanner;

public class Ex_8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números deseja informar? ");
		
		int qtd = sc.nextInt();
		
		int soma = 0;
		
		for (int i = 1; i <= qtd; i++) {
			System.out.println("Digite um número: ");
			
			soma += sc.nextInt();
			
		}
		
		double media = (double) soma / qtd;
		System.out.println("Média: " + media);
		
		sc.close();
		
	}

}
