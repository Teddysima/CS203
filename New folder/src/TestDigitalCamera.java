
import java.util.Scanner;

public class TestDigitalCamera {
	public static void main(String[] args) {
		DigitalCamera[] dc = new DigitalCamera[4];

		Scanner scanner = new Scanner(System.in);
		
		String brand;
		float resolution;

		for (int i = 0; i < 4; i++) {
			System.out.print("Brand: ");
			brand = scanner.next();
			System.out.print("Resolution: ");
			resolution = scanner.nextFloat();

			dc[i] = new DigitalCamera(brand, resolution);
		}
		
		
		dc[0].setResolution(30);

		for (int i = 0; i < 4; i++) {
			System.out.println(dc[i]);
		}
	}
}
/*out put
 * Brand: dc1
Resolution: 4
Brand: dc2
Resolution: 9
Brand: dc5
Resolution: 5
Brand: dc4
Resolution: 10
Brand: dc1; Resolution: 10.0; Price: 129.0
Brand: dc2; Resolution: 9.0; Price: 129.0
Brand: dc5; Resolution: 5.0; Price: 99.0
Brand: dc4; Resolution: 10.0; Price: 129.0*/
