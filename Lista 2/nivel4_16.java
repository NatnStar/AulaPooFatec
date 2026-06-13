package Condicionais;

import java.util.Scanner;

public class nivel4_16 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Digite um valor: ");
		
		valor = entrada.nextInt();
		
		int n100, n50, n20, n10, n5, n2, n1;
		
		n100 = valor / 100;
		valor = valor % 100;
		
		n50 = valor / 50;
		valor = valor % 50;
		
		n20 = valor / 20;
		valor = valor % 20;
		
		n10 = valor / 10;
		valor = valor % 10;
		
		n5 = valor / 5;
		valor = valor % 5;
		
		n2 = valor / 2;
		valor = valor % 2;
		
		n1 = valor;
		
		System.out.println("Notas necessárias: ");
		System.out.println(n100 + " nota(s) de 100");
		
		System.out.println(n50 + " nota(s) de 50");
		
		System.out.println(n20 + " nota(s) de 20");
		
		System.out.println(n10 + " nota(s) de 10");
		
		System.out.println(n5 + " nota(s) de 5");
		
		System.out.println(n2 + " nota(s) de 2");
		
		System.out.println(n1 + " nota(s) de 1");
		
		entrada.close();
		
		
	}

}
