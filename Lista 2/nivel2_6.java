package Condicionais;

public class nivel2_6 {
	
	public static void main(String[] args) {
		
		int numero = 20;
		
		if(numero >= 0 && numero <= 12) {
			System.out.println("Você é uma criança!");
		}else if(numero >= 13 && numero <= 17) {
			System.out.println("Você é um adolescente!");
		}else if(numero >= 18 && numero <= 59) {
			System.out.println("Você é um adulto!");
		}else {
			System.out.println("Você é um idoso!");
		}
	}

}
