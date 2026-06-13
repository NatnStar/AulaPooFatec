package Condicionais;

import java.util.Scanner;

public class desafioo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String usuarioCorreto = "admin";
		String senhaCorreta = "1234";
		
		String usuario;
		String senha;
		
		System.out.println("Digite o usúario: ");
		usuario = entrada.nextLine();
		
		System.out.println("DIgite a senha: ");
		senha = entrada.nextLine();
		
		if(!(usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta))) {
			System.out.println("Login inválido.");
			entrada.close();
			return;
		}
		
		System.out.println("Login realizado com sucesso!");
		

double saldo = 0;

        while (true) {

            System.out.println("\n=== MENU ===");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;

                case 2:
                    System.out.print("Digite o valor para depósito: ");
                    double deposito = entrada.nextDouble();

                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado!");
                    } else {
                        System.out.println("Valor inválido!");
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor para saque: ");
                    double saque = entrada.nextDouble();

                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else if (saque <= 0) {
                        System.out.println("Valor inválido!");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque realizado!");
                    }
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    entrada.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }

		
	}

}
