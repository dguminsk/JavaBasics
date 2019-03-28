package by.epam.javabasics.homework02;
import java.util.Scanner;

public class Task02 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		double a;
		double c;
		
		System.out.print("> ");
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value > ");
		}
		
		a = input.nextDouble();
		
		c = a + 3.0;
		
		System.out.print("c = " + c);
			
	}

}
