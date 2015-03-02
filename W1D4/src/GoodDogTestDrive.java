
public class GoodDogTestDrive {
	
	public static void main (String args[]){
		GoodDog one = new GoodDog();
		one.setSize(70);
		one.setName("stella");
		GoodDog two = new GoodDog();
		two.setSize(8);
		two.setName("selam");
		System.out.println("Dog one: " + one.getSize());
		System.out.println("Dog two: " + two.getSize());
		System.out.println("Dog one name is: " + one.getName());
		System.out.println("Dog two name is: " + two.getName());
		one.bark();
		two.bark();		
	}
}
