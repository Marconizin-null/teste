import java.util.Scanner;
public class rock {

    public static String playGame(String player1, String player2) {
        // Converte a inicial para letra minuscula
        player1 = player1.toLowerCase();
        player2 = player2.toLowerCase();

        // Verifica os valores inseridos em caso de empate
        if (player1.equals(player2)) {
            return "TIE";
        }

        // Todas as combinações para o jogador 1 vencer
        if ((player1.equals("pedra") && player2.equals("tesoura")) ||
                (player1.equals("tesoura") && player2.equals("papel")) ||
                (player1.equals("papel") && player2.equals("pedra"))) {
            return "Jogador 1 venceu";
        }

        // If it's not a tie and Player 1 hasn't won, Player 2 wins
        return "Jogador 2 venceu";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop to keep playing rounds
        while (true) {
            // Get input from Player 1
            System.out.print("Jogador 1 insira pedra,papel ou tesoura: ");
            String player1Choice = scanner.nextLine();

            // Get input from Player 2
            System.out.print("Jogador 2 insira pedra,papel ou tesoura: ");
            String player2Choice = scanner.nextLine();

            // Play the game and get the result
            String result = playGame(player1Choice, player2Choice);
            System.out.println("Resultado: " + result);

            // Ask if players want to play again
            System.out.print("Jogar novamente (sim/nao): ");
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("sim")) {
                System.out.println("vlw ae!");
                break;
            }
        }

        scanner.close();
    }
}


