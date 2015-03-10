import java.util.Scanner;
public class BirthTestDrive {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your birth day:");
		int day = input.nextInt();
		
		System.out.println("Enter your birth month:");
		int month = input.nextInt();
		
		System.out.println("Enter your birth year:");
		int year = input.nextInt();
		
		Birth b=new Birth();
		b.setDay(day);
		b.setMonth(month);
		b.setYear(year);
		b.calander();
	}
}
