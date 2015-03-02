
public class GuessGame {
	playerG p1;
	playerG p2;
	playerG p3;
	
	public void startGame(){
		p1 = new playerG ();
		p2 = new playerG ();
		p3 = new playerG ();
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isright = false;
		boolean p2isright = false;
		boolean p3isright = false;
		
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("am thinking a number between 0 and 9...");
		
		while(true){
			System.out.println("number to guess is " + targetNumber );
			
			p1.guess();
//			p2.guess();
//			p3.guess();
			
			guessp1 = p1.number;
			System.out.println("player one guessed " + guessp1);
			
			guessp2 = p1.number1;
			System.out.println("player two guessed " + guessp2);
			
			guessp3 = p1.number2;
			
			System.out.println("player Three guessed " + guessp3);
			
			if (guessp1 == targetNumber){
				p1isright = true;
			}
			if (guessp2 == targetNumber){
				p2isright = true;
			}
			if (guessp3 == targetNumber){
				p3isright = true;
			}
		
			if (p1isright || p2isright || p3isright){
				
				System.out.println("We have a winner!");
				System.out.println("player one got it right?" + p1isright);
				System.out.println("player two got it right?" + p2isright);
				System.out.println("player three got it right?" + p3isright);
				System.out.println("Game is over.");
			break;
			}else{
				
				System.out.println("Players will have to try again.");
			}
			
		}
	}
}
	
