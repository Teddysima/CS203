

import java.util.Scanner;

public class MultiPlayer {
	int number [];

	public void guess(int numPlayers){
		Scanner t = new Scanner(System.in);
		number=new int[numPlayers];
		
		for(int i = 0; i < numPlayers; i++){
			System.out.println("player "+i+" enter your guess: ");
			number[i] = t.nextInt() ;
		}
		
	}

}
