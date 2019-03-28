package by.epam.javabasics.homework02;
import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		double x;
		double y;
		double z;
		
		System.out.print("Please enter X > ");
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value > ");
		}
		x = input.nextDouble();
		
		System.out.print("Please enter Y > ");
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value > ");
		}
		y = input.nextDouble();
		
		z = 2 * x + (y - 2) * 5;
		
		System.out.print("z = " + z);
		
	}

}
