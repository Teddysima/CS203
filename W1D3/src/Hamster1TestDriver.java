
public class Hamster1TestDriver {
	public static void main (String args []){
		Hamster1[] h = new Hamster1[100];
		double sum = 0;
		for(int i=0; i<h.length; i++){
			h[i] = new Hamster1();
			h[i].age = Math.random()*3;
			sum+=h[i].age;
		}
		System.out.println(sum/h.length);
		/*double sum = 0;
		for (int j=0; j<h.length; j++){
			sum+=h[j].age;
		}
		System.out.println(sum/h.length);*/
	}

}
