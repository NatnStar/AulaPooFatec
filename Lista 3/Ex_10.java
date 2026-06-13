package lacos_de_repeticao;

import java.util.Scanner;

public class Ex_10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0, num;
		

		do {
            System.out.print("Digite um número (0 para sair): ");
            num = sc.nextInt();
            soma += num;
        } while (num != 0);
		
		System.out.println("Soma total: " + soma);
		
		sc.close();
	

			
		
	}

}
