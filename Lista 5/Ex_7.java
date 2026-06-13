package Funcoes;

public class Ex_7 {

	public static void main(String[] args) {
		
        mostrarNumeros();
        mostrarPares();
        mostrarImpares();
    }

    static void mostrarNumeros() {
        for (int i = 1; i <= 100; i++) System.out.println(i);
    }

    static void mostrarPares() {
        for (int i = 2; i <= 100; i += 2) System.out.println(i);
    }

    static void mostrarImpares() {
        for (int i = 1; i <= 100; i += 2) System.out.println(i);
    }


}
