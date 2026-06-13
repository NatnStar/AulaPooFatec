package Condicionais;

public class nivel1_4 {
	
	public static void main(String[] args) {
		
		int numero1 = 2;
		int numero2 = 2;
		
		if(numero1 > numero2) {
			System.out.println("O maior número é: " + numero1);
		}else if(numero2 > numero1) {
			System.out.println("O maior número é: " + numero2);
		}else {
			System.out.println("Os números são iguais!");
		}
	}

}
