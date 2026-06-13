package Variaveis;

public class Ex7 {
	
	int n;
	
	public Ex7(int n) {
		this.n = n;
		
	}
	void mostrarAS() {
		int sucessor = n + 1;
		int antecessor = n - 1;
		
		System.out.println("Número: " + n);
		System.out.println("Sucessor: " + sucessor);
		System.out.println("Antecessor: " + antecessor);
	}
}
