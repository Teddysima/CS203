
public class GuessGameMultiPlayer {
	MultiPlayer player;

	public void startGame(int numPlayers) {
		player = new MultiPlayer();
		boolean win = false;

		int guessp1[] = new int[numPlayers];

		for (int i = 0; i < numPlayers; i++) {
			guessp1[i] = 0;
		}

		boolean p1isright[] = new boolean[numPlayers];

		for (int i = 0; i < numPlayers; i++) {
			p1isright[i] = false;
		}

		int targetNumber = (int) (Math.random() * 10);
		System.out.println("am thinking a number between 0 and 9...");

		while (!win) {
			System.out.println("number to guess is " + targetNumber);

			player.guess(numPlayers);

			for (int i = 0; i < numPlayers; i++) {
				// System.out.println("player " +i+ " guessed " + p1.number[i]);
				if (player.number[i] == targetNumber) {
					p1isright[i] = true;
				}

			}

			for (int i = 0; i < numPlayers; i++) {
				if (p1isright[i]) {
					System.out.println("We have a winner!");
					System.out.println("player " + i + " got it right?"
							+ p1isright[i]);
					System.out.println("Game is over.");
					win = true;

				} else {
					System.out.println("player " + i + " got it right?"
							+ p1isright[i]);
				}
			}

			if (!win) {
				System.out.println("Players will have to try again.");
			}

		}
	}
}
