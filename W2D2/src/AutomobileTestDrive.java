
import java.util.ArrayList;

public class AutomobileTestDrive {
	public static void main (String args []){
		
		ArrayList<Automobile> a = new ArrayList<Automobile>();
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		Truck t1 = new Truck();
		Truck t2 = new Truck();
		Automobile au = new Automobile();
		
		a.add(c1);
		a.add(c2);
		a.add(c3);
		a.add(t1);
		a.add(t2);
		a.add(au);
		
		for (Automobile v : a){
			v.accelerate();
			v.accelerate();
			v.accelerate();
			v.brake();
			System.out.println(v.getSpeed());
		}
				
	}
}
