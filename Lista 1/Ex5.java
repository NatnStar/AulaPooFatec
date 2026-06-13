package Variaveis;

public class Ex5 {
	
	double f;
	double c;
	
	public Ex5(double f, double c) {
		this.f = f;
		this.c = c;
		
	}
	void Celsius() {
		f = (c * 9 / 5) + 32;
		System.out.println("Temperatura em Fahrenheit: " + f);
		
		
	}
	

}
