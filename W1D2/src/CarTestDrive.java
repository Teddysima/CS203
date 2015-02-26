
public class CarTestDrive {
	public static void main (String [] args){
		Car myCar = new Car();
		Car myCar1 = new Car();
		
		myCar.MoveDown();
		myCar1.MoveRight();
		myCar.MoveUp();
		myCar1.MoveLeft();
		myCar.PrintLocation();
		myCar1.PrintLocation();
	}

}
