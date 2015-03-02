

public class DotCom {
	public static void main (String [] args){
		
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		
		SimpleDotCom thedotcom = new SimpleDotCom();
		int randomNum = (int) (Math.random()*10);
		int randomNum1 = (int) (Math.random()*10);
		int randomNum2 = (int) (Math.random()*10);
		
		int[] locations = {randomNum, randomNum1, randomNum2};
		
		thedotcom.SetLocationCells(locations);
		
		boolean Teddy = true;
		
		while(Teddy==true){
			String guess = helper.getUserInput("Enter a number: ");
			
			String result = thedotcom.checkYourself(guess);
			
			numOfGuesses++;
			
			if (result.equals("kill")){
				Teddy=false;
				
				System.out.println("You took " + numOfGuesses + " guesses!");
				
			}
		}

	}
}
