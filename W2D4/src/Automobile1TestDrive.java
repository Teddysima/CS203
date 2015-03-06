import java.util.ArrayList;

public class Automobile1TestDrive {
	public static void main(String args[]) {

		ArrayList<Automobile1> a = new ArrayList<Automobile1>();

		Car1 c1 = new Car1("Toyota", "malibu", 1999, "blue", true, 89);
		Car1 c2 = new Car1("Toyota", "malibu", 89);
		Truck1 t1 = new Truck1("Hounda", "Fiat", 2016, "Gracha", 88, true);

		a.add(c1);
		a.add(c2);
		a.add(t1);

		System.out.println("the name of my fancy car:" + c1.getMark());

		System.out.println(a.get(0).getMark());
		System.out.println(a.get(1).getModel());
		System.out.println(a.get(2).getYear());
		
		
		for (Automobile1 auto : a) {
			System.out.println(auto.getMark());
			System.out.println(auto.getModel());
			System.out.println(auto.getYear());
			System.out.println(auto.getColor());

		}

	}
}