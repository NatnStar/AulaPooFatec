package Condicionais;

import java.util.Scanner;

public class nivel4_19 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double temperatura;
		
		System.out.println("Digite a temperatura: ");
		temperatura = entrada.nextDouble();
		
		if(temperatura < 15) {
			System.out.println("Frio");
			
		}else if(temperatura >= 15 && temperatura <= 25) {
			System.out.println("Agradável");
			
		}else {
			System.out.println("Quente");
		}
		
		entrada.close();
		
	}

}
