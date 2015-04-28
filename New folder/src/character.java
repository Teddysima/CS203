


public class character {
	
	public static void main (String args []){
		
		character c = new character();
		c.chartype('A');
	}
		
		public static void chartype(char ch){
			
		
		if ('A' <= ch && ch <= 'Z'){
			System.out.println("It is the Upper case");
		}
		else if ('a' <= ch && ch <= 'z'){
			System.out.println("It is the Lower case");
		}
		else if ('0' <= ch && ch <= '9'){
			System.out.println("It is the Number");
		}
		else {
			System.out.println("It is a Special character");
		}
	}
}
/*out put
It is the Upper case*/