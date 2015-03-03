
import java.util.*;

public class AverageLinkedList {

	public static void main(String args[]){
		
		LinkedList ints = new LinkedList();
		
		for (int i = 0; i < 100; i++){
			int rand = (int)(Math.random()*100);
			
			
			ints.add(rand);				
		}
		int sum = 0;
		for (int i = 0; i < ints.size();i++){
			sum+=(int)ints.get(i);
		}
		
		System.out.println((sum)/(100));	
	}
}

