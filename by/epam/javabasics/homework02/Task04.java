package by.epam.javabasics.homework02;
import java.util.Scanner;

public class Task04 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double z;
		
		System.out.print("Please enter A > ");
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value > ");
		}
		a = input.nextDouble();
		
		System.out.print("Please enter B > ");
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value > ");
		}
		b = input.nextDouble();
		
		System.out.print("Please enter C > ");
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value > ");
		}
		c = input.nextDouble();
		
		z = ((a - 3) * b / 2) + c;
		
		System.out.print("z = " + z);
		
	}

}
