package Condicionais;

public class nivel2_9 {
	
	public static void main(String[] args) {
		
		String usuario = "admin";
		String senha = "1234";
		
		if(usuario.equals("admin") && senha.equals("1234")) {
			System.out.println("Acesso permitido");
		}else if(!usuario.equals("admin") && senha.equals("1234")) {
			System.out.println("Usuário incorreto");
		}else if(usuario.equals("admin") && !senha.equals("1234")) {
			System.out.println("Senha incorreta");
		}else {
			System.out.println("Acesso negado");
		}
	}

}
