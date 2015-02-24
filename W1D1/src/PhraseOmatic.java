
public class PhraseOmatic {
	public static void main (String args[]){
		String []ListOne = {"12","13","14","15","16","17"};
		String []ListTwo = {"solution","shared","orianted","value","added","smart"};
		String []ListThree = {"Teddy","sima","hirut","yared","muna","azeb"};
		
		int LengthOne = ListOne.length;
		int LengthTwo = ListTwo.length;
		int LengthThree = ListThree.length;
		
		int rand1 = (int) (Math.random()*LengthOne);
		int rand2 = (int) (Math.random()*LengthTwo);
		int rand3 = (int) (Math.random()*LengthThree);
		
		String phrase = ListOne[rand1] + " " + ListTwo[rand2] + " " + ListThree[rand3];
		
		System.out.println("What you need is "+ phrase);
		
	}

}
