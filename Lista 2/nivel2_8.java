package Condicionais;

public class nivel2_8 {
	
	public static void main(String[] args) {
		
		int n1 = 7;
		int n2 = 5;
		int n3 = 3;
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior número é: " + n1);
		}else if(n2 > n1 && n2 > n3) {
			System.out.println("O maior número é: " + n2);
		}else {
			System.out.println("O maior número é: " + n3);
		}
	}

}
