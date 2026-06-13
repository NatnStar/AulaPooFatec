package Variaveis;

public class Ex4 {
	
	double largura;
	double altura;
	
	public Ex4(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
		
	}
	void area() {
		double resultado = largura * altura;
		System.out.println("A area do triangulo é: " + resultado);
		
	}

}
