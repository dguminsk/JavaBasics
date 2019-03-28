package by.epam.javabasics.homework02;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		
		double x1, x2, y1, y2, x3, y3;
		
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
		
		System.out.print("Enter x3 > ");
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value> ");
		}
		x3 = input.nextDouble();
		
		System.out.print("Enter y3 > ");
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value> ");
		}
		y3 = input.nextDouble();
		
		double storona1 = Math.abs(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
		double storona2 = Math.abs(Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2)));
		double storona3 = Math.abs(Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2)));
		
		double perimetr = storona1 + storona2 + storona3;
		double polperim = perimetr / 2;
		double ploshad = Math.sqrt(polperim * (polperim - storona1) * (polperim - storona2) * (polperim - storona3));
		
		System.out.print("Площадь: " + ploshad + " Периметр: " + perimetr);		
	}

}
