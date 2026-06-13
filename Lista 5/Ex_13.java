package Funcoes;

public class Ex_13 {

static int vida;

    public static void main(String[] args) {
    	
        criarPersonagem();
        mostrarStatus();

        atacar();
        receberDano();
        mostrarStatus();

        curar();
        mostrarStatus();
    }

    static void criarPersonagem() {
        vida = 100;
    }

    static void atacar() {
        System.out.println("Você atacou!");
    }

    static void receberDano() {
        vida -= 30;
        System.out.println("Recebeu dano!");
    }

    static void curar() {
        vida += 20;
        System.out.println("Curou!");
    }

    static void mostrarStatus() {
        System.out.println("Vida atual: " + vida);
    }


}
