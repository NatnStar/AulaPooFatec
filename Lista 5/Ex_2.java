package Funcoes;

public class Ex_2 {

	public static void main(String[] args) {
		
        int resultado = somar(10, 20);
        mostrarResultado(resultado);
    }

    static int somar(int a, int b) {
        return a + b;
    }

    static void mostrarResultado(int resultado) {
        System.out.println("Soma: " + resultado);
    }


}
