
public class HamsterDriver {
	public static void main (String args []){
		Hamster[] teddy = new Hamster [100];
		
		for (int i = 0; i < 100; i++){
			Hamster h = new Hamster();
			h.age = Math.random()*3;
			teddy[i] = h;
		}
		int sum = 0;
		for (int j = 0; j < 100; j++){
			sum += teddy[j].age;
		} 
		System.out.println("Average: "+ sum/100);
		
	}

}

