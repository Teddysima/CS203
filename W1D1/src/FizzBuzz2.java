
public class FizzBuzz2 {
	public static void main (String args[]){
		int i = 1;
		while(i<=100){
			if (i % 3==0){
				System.out.println("FIZZ");			
			} if (i % 5 == 0){
				System.out.println("BUZZ");
			} if (i % 3==0 && i % 5 == 0){
				System.out.println("FIZZ BUZZ");
			}else{
				System.out.println(i);}
			i++;
		}
		
		
	}

}






