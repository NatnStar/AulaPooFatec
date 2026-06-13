package Condicionais;

public class nivel2_10 {
	
	public static void main(String[] args) {
		
		double dinheiro = 250;
		double valorFinal;
		
		if(dinheiro > 100) {
			valorFinal = dinheiro - (dinheiro * 0.10);
			System.out.println("Sua compra liberou um desconto de 10%!");
			System.out.println("Valor final: " + valorFinal);
		}else {
			System.out.println("Sua compra não liberou descontos :(");
			System.out.println("Valor final: " + dinheiro);
		}
	}

}
