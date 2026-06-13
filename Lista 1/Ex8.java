package Variaveis;

public class Ex8 {
	
	double metros;
	
	public Ex8(double metros) {
		this.metros = metros;
		
	}
	void centimetros() {
		double centimetros = metros * 100;
		double milimetros = metros * 1000;
		
		System.out.println("Metros: " + metros);
		System.out.println("Centimetros: " + centimetros);
		System.out.println("Milimetros: " + milimetros);
		
	}

}
