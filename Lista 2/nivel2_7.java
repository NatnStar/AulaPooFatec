package Condicionais;

public class nivel2_7 {
	
	public static void main(String[] args) {
		
		double media = 5;
		
		if(media >= 6) {
			System.out.println("Você foi aprovado :)");
		}else if(media >= 4 && media < 6) {
			System.out.println("Você está em recuperação :/");
		}else {
			System.out.println("Você foi reprovado :(");
		}
	}

}
