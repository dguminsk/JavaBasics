package by.epam.javabasics.homework02;

import java.util.Scanner;

public class Task10 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter X > ");
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value> ");
		}
		double x = input.nextDouble();
		
		System.out.print("Enter Y > ");
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value> ");
		}
		double y = input.nextDouble();
		
		double verh = Math.sin(x) + Math.cos(y);
		double niz = Math.cos(x) - Math.asin(y);
		double answer = verh / niz * Math.tan(x * y);
		
		System.out.print("Answer is: " + answer);
		
	}
	

}
