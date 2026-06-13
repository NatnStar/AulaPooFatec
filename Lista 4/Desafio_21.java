package Arrays_Matrizes;

public class Desafio_21 {

	public static void main(String[] args) {

        char[][] jogo = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {'X', '-', 'X'}
        };

        System.out.println("Tabuleiro:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(jogo[i][j] + " ");
            }
            System.out.println();
        }
    }


}
