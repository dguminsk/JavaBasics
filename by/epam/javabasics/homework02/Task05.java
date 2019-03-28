package by.epam.javabasics.homework02;
import java.util.Scanner;

public class Task05 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the first number > ");
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value > ");
		}
		double a = input.nextDouble();
		
		System.out.print("Please enter the second number > ");
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value > ");
		}
		double b = input.nextDouble();
		
		double answer = (a + b) / 2;
		
		System.out.print("Среднее арифметическое чисел " + a + " и " + b + ": " + answer);
		
		
	}

}
