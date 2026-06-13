package Variaveis;

public class Ex6 {
	
	double salarioHora;
	double horasTrabalhadas;
	
	public Ex6(double salarioHora, double horasTrabalhadas) {
		this.salarioHora = salarioHora;
		this.horasTrabalhadas = horasTrabalhadas;
		
		
	}
	void salario() {
		double salarioTotal = salarioHora * horasTrabalhadas;
		System.out.println("O salário total do mês é: " + salarioTotal);
		
	}

}
