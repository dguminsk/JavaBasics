package by.epam.javabasics.homework02;
import java.util.Scanner;

public class Task39 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter double value> ");
		
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value> ");
		}
		
		double x = input.nextDouble();
		
		double answer = (((2 * x - 3) * x + 4) * x - 5) * x + 6;
		
		System.out.print("Answer is: " + answer);
		
	}

}
