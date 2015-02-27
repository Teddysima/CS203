
public class Car2TestDriver {
	public static void main (String [] args){
		
		Car2 myCar = new Car2();
		
		myCar.MoveUp(3);
		myCar.MoveDown(3);
		
		myCar.returnLocation();
		
		
		Car2 myCar1 = new Car2();
		
		myCar1.MoveRight(4);
		myCar1.MoveLeft(4);
		
		myCar1.returnLocation();
	}

}
