package Variaveis;

public class Ex3 {
	
	double n1;
	double n2;
	double n3;
	
	public Ex3(double n1, double n2, double n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		
	}
	void media() {
		double resultado = (n1 + n2 + n3) / 3;
		System.out.println("A media foi: " + resultado);
		
	}

}
