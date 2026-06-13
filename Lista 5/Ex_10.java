package Funcoes;

import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        String usuario = lerUsuario(sc);
        String senha = lerSenha(sc);

        boolean valido = validarLogin(usuario, senha);
        mostrarResultado(valido);

        sc.close();
    }

    static String lerUsuario(Scanner sc) {
        System.out.print("Usuário: ");
        return sc.nextLine();
    }

    static String lerSenha(Scanner sc) {
        System.out.print("Senha: ");
        return sc.nextLine();
    }

    static boolean validarLogin(String usuario, String senha) {
        return usuario.equals("admin") && senha.equals("123");
    }

    static void mostrarResultado(boolean valido) {
        if (valido) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Usuário ou senha incorretos!");
        }
    }


}
