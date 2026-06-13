package Variaveis;

public class Ex10 {
	
	int anoNascimento;
	int anoAtual;
	
	public Ex10(int anoNascimento, int anoAtual) {
		this.anoNascimento = anoNascimento;
		this.anoAtual = anoAtual;
		
	}
	void ano() {
		int idade = anoNascimento - anoAtual;
		System.out.println("Sua idade é: " + idade);

	}

}
