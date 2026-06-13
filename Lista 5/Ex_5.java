package Funcoes;

import java.util.Scanner;

public class Ex_5 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        int op = mostrarMenu(sc);
        double n1 = lerNumero(sc);
        double n2 = lerNumero(sc);

        switch (op) {
            case 1: System.out.println(somar(n1, n2)); break;
            case 2: System.out.println(subtrair(n1, n2)); break;
            case 3: System.out.println(multiplicar(n1, n2)); break;
            case 4: System.out.println(dividir(n1, n2)); break;
        }

        sc.close();
    }

    static int mostrarMenu(Scanner sc) {
        System.out.println("1-Somar 2-Subtrair 3-Multiplicar 4-Dividir");
        return sc.nextInt();
    }

    static double lerNumero(Scanner sc) {
        return sc.nextDouble();
    }

    static double somar(double a, double b) { return a + b; }
    static double subtrair(double a, double b) { return a - b; }
    static double multiplicar(double a, double b) { return a * b; }
    static double dividir(double a, double b) { return a / b; }


}
