package Condicionais;

public class nivel3_13 {
	
	public static void main(String[] args) {
		
		int ano = 2026;
		
		boolean bissexto;
		
		if(ano % 4 == 0 && !(ano % 100 == 0) || (ano % 400 == 0)) {
			bissexto = true;
			
		}else {
			bissexto = false;
			
		}
		
		switch(bissexto ? 1 : 0) {
		
		case 1:
			System.out.println("Ano bissexto");
			break;
			
		case 0:
			System.out.println("O ano não é bissexto");
			
		}
		
		
	}

}
