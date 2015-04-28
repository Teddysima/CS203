
import java.util.Scanner;

public class counts {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("enter any number: ");
		int num = in.nextInt();
		int counteven = 0;
		int countodd = 0;
		int countzero = 0;

		if (num == 0)
			countzero++;

		while (num > 0) {
			int r = num % 10;

			if (r == 0) {
				countzero++;
			} else if (r % 2 == 0) {
				counteven++;
			} else {
				countodd++;
			}
			num = num / 10;
		}
		System.out.println("Odd digits:" + countodd);
		System.out.println("Even digits:" + counteven);
		System.out.println("Zero digits:" + countzero);
	}

}
/*out put
enter any number: 123040
Odd digits:2
Even digits:2
Zero digits:2*/