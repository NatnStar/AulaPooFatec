package Condicionais;

public class nivel3_11 {
	
	public static void main(String[] args) {
		
		int n1 = 6;
		int n2 = 8;
		char operacao = '-';
		
		switch(operacao) {
		
		case '+':
			System.out.println("Resultado: " + (n1 + n2));
			break;
			
		case '-':
			System.out.println("Resultado: " + (n1 - n2));
			break;
			
		case '*':
			System.out.println("Resultado: " + (n1 * n2));
			break;
			
		case '/':
			if(n2 != 0) {
				System.out.println("Resultado: " + (n1 / n2));	
			}else {
				System.out.println("Divisão por zero");
			}
			break;
			
		}
		
	}

}
