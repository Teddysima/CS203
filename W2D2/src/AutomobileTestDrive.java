
import java.util.ArrayList;

public class AutomobileTestDrive {
	public static void main (String args []){
		
		ArrayList<Automobile> a = new ArrayList<Automobile>();
		Car c1 = new Car();
		Truck t1 = new Truck();
		
		a.add(c1);
		a.add(t1);
		
		for (Automobile v : a){
			v.accelerate();
			v.accelerate();
			v.accelerate();
			v.brake();
			System.out.println(v.getSpeed());
		}
		
		
	}

}
