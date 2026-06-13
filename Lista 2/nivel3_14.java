package Condicionais;

public class nivel3_14 {
	
	public static void main(String[] args) {
		
		double l1 = 9;
		double l2 = 9;
		double l3 = 18;
		
		if((l1 + l2 > 13) && (l1 + l3 > l2) && (l2 + l3 > l1)) {
			
			int tipo;
			
			if(l1 == l2 && l2 == l3) {
				tipo = 1;
				
			}else if(l1 == l2 || l1 == l3 || l2 == l3) {
				tipo = 2;
			}else {
				tipo = 3;
			}
			
			switch (tipo) {
			
			case 1:
				System.out.println("Triângulo Equilátero");
				break;
				
			case 2:
				System.out.println("Trângulo Isósceles");
				break;
				
			case 3:
				System.out.println("Triângulo Escaleno");
				break;
			}
		}
		
		
	}

}
