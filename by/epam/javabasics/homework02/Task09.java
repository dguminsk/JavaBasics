package by.epam.javabasics.homework02;

import java.util.Scanner;

public class Task09 {
	
	public static void main(String[] args) {
			
			double a, b, c, d;
			
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter a > ");
			while(input.hasNextDouble() == false) {
				input.next();
				System.out.print("Please enter double value> ");
			}
			a = input.nextDouble();
			
			System.out.print("Enter b > ");
			while(input.hasNextDouble() == false) {
				input.next();
				System.out.print("Please enter double value> ");
			}
			b = input.nextDouble();
			
			System.out.print("Enter c > ");
			while(input.hasNextDouble() == false) {
				input.next();
				System.out.print("Please enter double value> ");
			}
			c = input.nextDouble();
			
			System.out.print("Enter d > ");
			while(input.hasNextDouble() == false) {
				input.next();
				System.out.print("Please enter double value> ");
			}
			d = input.nextDouble();
			
			double verh = (a * b) - (a * b - c);
			
			double answer = verh / (c * d);
			
			System.out.print("Answer is: " + answer);
					
		}

}
