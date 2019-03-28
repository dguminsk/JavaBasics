package by.epam.javabasics.homework02;
import java.util.Scanner;

public class Task01 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("> ");
		
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value > ");
		}
		double a = input.nextDouble();
		
		System.out.print("> ");
		
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value > ");
		}
		double b = input.nextDouble();
		double c = a + b;
		double z = a * b;
		double x = a - b;
		
		
		System.out.print(a + " + " + b + " = " + c);
		System.out.print(a + " - " + b + " = " + x);
		System.out.print(a + " * " + b + " = " + z);
		
	}

}
