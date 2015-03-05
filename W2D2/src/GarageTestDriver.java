
public class GarageTestDriver {

	public static void main(String[] args) {
		
		Car c1 = new Car();		
		c1.setTrunkCapacity(2);
		Truck t1 = new Truck();
		t1.setCarryingCapacity(89);
		Item i1 = new Item();
		i1.setName("Toyota");
		Item i2 = new Item();
		i2.setName("Honnda");
		Item i3 = new Item();
		i3.setName("Malibu");
		Garage g1 = new Garage();
		
	
		g1.store(c1);
		g1.store(i1);
		g1.store(i2);
		g1.store(i3);
		g1.store(t1);
		
		
		System.out.println(g1.retrieve(0).getName());
		System.out.println(g1.retrieve(1).getName());
		System.out.println(g1.retrieve(2).getName());
		System.out.println(c1.getTrunkCapacity());	
		System.out.println(t1.getCarryingCapacity());
		
		
	
		
		

	}

}
