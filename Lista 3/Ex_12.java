package lacos_de_repeticao;

import java.util.Scanner;

public class Ex_12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		

		do {
            System.out.println("\n1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Número 1: ");
                int a = sc.nextInt();
                System.out.print("Número 2: ");
                int b = sc.nextInt();
                System.out.println("Resultado: " + (a + b));

            } else if (opcao == 2) {
                System.out.print("Número 1: ");
                int a = sc.nextInt();
                System.out.print("Número 2: ");
                int b = sc.nextInt();
                System.out.println("Resultado: " + (a - b));
            }

        } while (opcao != 3);

        System.out.println("Programa encerrado.");
        
        sc.close();

	}

}
