package by.epam.javabasics.homework02;
import java.util.Scanner;

public class Task08 {
	
	public static void main(String[] args) {
		
		double a, b, c;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a > ");
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value > ");
		}
		a = input.nextDouble();
		
		System.out.print("Enter b > ");
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value > ");
		}
		b = input.nextDouble();
		
		System.out.print("Enter c > ");
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value > ");
		}
		c = input.nextDouble();
		
		double sqrt = Math.sqrt(b * b + 4 * a * c);
		double drob = (b + sqrt) / 2 * a;
		double right = a * a * a * c + 1 / (b * b);
		
		double answer = drob - right;
		
		System.out.print("Answer is: " + answer);
		
		
	}

}
