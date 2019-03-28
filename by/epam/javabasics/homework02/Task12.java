package by.epam.javabasics.homework02;

import java.util.Scanner;

public class Task12 {
	
	public static void main(String[] args) {
		
		double x1, x2, y1, y2;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x1 > ");
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value> ");
		}
		x1 = input.nextDouble();
		
		System.out.print("Enter y1 > ");
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value> ");
		}
		y1 = input.nextDouble();
		
		System.out.print("Enter x2 > ");
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value> ");
		}
		x2 = input.nextDouble();
		
		System.out.print("Enter y2 > ");
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value> ");
		}
		y2 = input.nextDouble();
		
		double answer = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.print("Расстояние между точками: " + answer);
				
	}

}
