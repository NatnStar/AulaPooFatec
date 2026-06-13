package Condicionais;

import java.util.Scanner;

public class nivel4_18 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("\n== Menu ===");
			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Sair");
			System.out.println("Escolha uma opção: ");
			
			int opcao = entrada.nextInt();
			
			switch (opcao) {
			
			case 1:
				System.out.println("Digite o primeiro número: ");
				double n1 = entrada.nextDouble();
				System.out.println("Digite o segundo nùmero: ");
				double n2 = entrada.nextDouble();
				System.out.println("Resultado: " + (n1 + n2));
				break;
				
			case 2:
				System.out.println("Digite o primeiro número: ");
				double n3 = entrada.nextDouble();
				System.out.println("Digite o segundo nùmero: ");
				double n4 = entrada.nextDouble();
				System.out.println("Resultado: " + (n3 - n4));
				break;
				
			case 3:
				System.out.println("Saindo do programa....");
				entrada.close();
				return;
				
			default:
				System.out.println("Opção inválida.");
			}
		}
		
		
	}
	
	

}
