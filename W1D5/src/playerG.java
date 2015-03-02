
import java.util.Scanner;

public class playerG {
	int number = 0;
	int number1 = 0;
	int number2 = 0;
	
	
	
	
	public void guess(){
		Scanner t = new Scanner(System.in);
		
		System.out.println("player 1 enter your guess: ");
		number = t.nextInt() ;
		
		System.out.println("player 2 enter your guess: ");
		number1 = t.nextInt() ;
		
		System.out.println("player 3 enter your guess: ");
		number2 = t.nextInt() ;
	
		
		
	
	}

}
