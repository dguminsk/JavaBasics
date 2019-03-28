package by.epam.javabasics.homework02;

import java.util.Scanner;

public class Task14 {
	
	public static void main(String[] args) {
		
		double R;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius > ");
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value> ");
		}
		R = input.nextDouble();
		
		double dlina = Math.PI * R * 2;
		double ploshad = Math.PI * R * R;
		
		System.out.print("ѕлощадь круга: " + ploshad + " ƒлина окружности: " + dlina);		
	}

}
