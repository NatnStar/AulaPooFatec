package Condicionais;

import java.util.Scanner;

public class nivel3_15 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double peso;
		double altura;
		double imc;
		
		System.out.println("Digite o peso: ");
		peso = entrada.nextDouble();
		
		System.out.println("Digite a altura: ");
		altura = entrada.nextDouble();
		
		imc = peso / (altura * altura);
		
		System.out.println("IMC: " + imc);
		
		if(imc < 18.5) {
			System.out.println("Abaixo do peso");
			
		}else if(imc >= 18.5 && imc <= 24.5) {
			System.out.println("Peso normal");
			
		}else if(imc >= 25 && imc <= 29.9) {
			System.out.println("Sobrepeso");
			
		}else {
			System.out.println("Obesidade");
			
		}
		
		entrada.close();
		
	}

}
