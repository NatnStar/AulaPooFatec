package Funcoes;

import java.util.Scanner;

public class Ex_8 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        String nome = lerNome(sc);
        int idade = lerIdade(sc);
        sc.nextLine(); // LIMPA buffer
        String cidade = lerCidade(sc);

        mostrarResumo(nome, idade, cidade);

        sc.close();
    }

    static String lerNome(Scanner sc) {
        System.out.print("Nome: ");
        return sc.nextLine();
    }

    static int lerIdade(Scanner sc) {
        System.out.print("Idade: ");
        return sc.nextInt();
    }

    static String lerCidade(Scanner sc) {
        System.out.print("Cidade: ");
        return sc.nextLine();
    }

    static void mostrarResumo(String nome, int idade, String cidade) {
        System.out.println(nome + " - " + idade + " anos - " + cidade);
    }


}
