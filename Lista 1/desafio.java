package Variaveis;

public class desafio {
	
	String nomeProduto;
	double preco;
	int quantidade;
	
	public desafio(String nomeProduto, double preco, int quantidade) {
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	void produto() {
		double valorTotal = preco * quantidade;
		System.out.println("Produto: " + nomeProduto);
		System.out.println("O valor total do produto é: " + valorTotal);
	}

}
