import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.*;

public class CarSerialization {
	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {

		Car myCar = new Car();
		Car myCar1 = new Car();
		Car myCar2 = new Car();

		myCar.setName("Toyota");
		myCar1.setName("Honda");
		myCar2.setName("Chavi");

		myCar.MoveUp(3);
		myCar.MoveDown(3);

		myCar.returnLocation();

		Car myCar7 = new Car();

		myCar7.MoveRight(4);
		myCar7.MoveLeft(4);

		myCar7.returnLocation();

		FileOutputStream fos = new FileOutputStream("MyCar.sav");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(myCar);
		oos.writeObject(myCar1);
		oos.writeObject(myCar2);

		oos.close();

		FileInputStream fis = new FileInputStream("MyCar.sav");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Car myCarD = (Car) ois.readObject();
		Car myCar1D = (Car) ois.readObject();
		Car myCar2D = (Car) ois.readObject();

		ois.close();

		System.out.println("myCar name: " + myCarD.getName());
		System.out.println("myCar1 name: " + myCar1D.getName());
		System.out.println("myCar2 name: " + myCar2D.getName());
	}

}
