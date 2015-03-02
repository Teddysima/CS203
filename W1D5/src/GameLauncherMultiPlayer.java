import java.util.Scanner;



public class GameLauncherMultiPlayer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many players: ");
		int numPlayres = input.nextInt();
		GuessGameMultiPlayer game = new GuessGameMultiPlayer();
		game.startGame(numPlayres);
		

	}

}
