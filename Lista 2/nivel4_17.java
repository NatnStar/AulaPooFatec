package Condicionais;

import java.util.Scanner;

public class nivel4_17 {
	
	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        String usuario, senha;

        int tentativas = 0;
        boolean loginSucesso = false;

        while (tentativas < 3 && !loginSucesso) {

            System.out.print("Digite o usuário: ");
            usuario = entrada.nextLine();

            System.out.print("Digite a senha: ");
            senha = entrada.nextLine();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Login realizado com sucesso!");
                loginSucesso = true;
            } else {
                tentativas++;
                System.out.println("Usuário ou senha incorretos!");
            }
        }

        if (!loginSucesso) {
            System.out.println("Conta bloqueada! Número máximo de tentativas atingido.");
        }

        entrada.close();

	}

}
