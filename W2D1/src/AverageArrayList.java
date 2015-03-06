
import java.util.ArrayList;

public class AverageArrayList {
	
	public static void main(String args[]){
		
		ArrayList<Integer> ints = new ArrayList<Integer> ();
		
		
		for (int i = 0; i < 100; i++){
			int rand = (int)(Math.random()*100);
			
			
			ints.add(rand);				
		}
		int sum = 0;
		for (int i = 0; i < ints.size();i++){
			sum+=ints.get(i);
			
		}
		ints.add(sum);
		System.out.println((sum)/(100));
		System.out.println(ints.indexOf(sum));
	}


}
