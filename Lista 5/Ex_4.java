package Funcoes;

import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        double n1 = lerNota(sc);
        double n2 = lerNota(sc);
        double n3 = lerNota(sc);

        double media = calcularMedia(n1, n2, n3);
        String situacao = verificarSituacao(media);

        mostrarResultado(media, situacao);

        sc.close();
    }

    static double lerNota(Scanner sc) {
        System.out.print("Nota: ");
        return sc.nextDouble();
    }

    static double calcularMedia(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    static String verificarSituacao(double media) {
        return media >= 6 ? "Aprovado" : "Reprovado";
    }

    static void mostrarResultado(double media, String situacao) {
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);
    }


}
