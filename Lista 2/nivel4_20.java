package Condicionais;

import java.util.Scanner;

public class nivel4_20 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double salario;
		double imposto;
		
		System.out.println("Digite o salário: ");
		salario = entrada.nextDouble();
		
		if(salario <= 2000) {
			imposto = 0;
			
		}else if(salario >= 2001 && salario <= 5000) {
			imposto = salario * 0.10;
			
		}else {
			imposto = salario * 0.20;
			
		}
		
		System.out.println("Imposto a pagar: R$" + imposto);
		
		entrada.close();
		
		
	}
}
