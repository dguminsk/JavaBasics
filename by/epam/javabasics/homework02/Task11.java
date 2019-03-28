package by.epam.javabasics.homework02;
import java.util.Scanner;

public class Task11 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.print("¬ведите первый катет > ");
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value> ");
		}
		a = input.nextDouble();
		
		System.out.print("¬ведите второй катет > ");
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value> ");
		}
		b = input.nextDouble();
		
		c = Math.sqrt(a * a + b * b);
		
		double perimetr = a + b + c;
		double ploshad = a * b / 2;
		
		System.out.println("ѕериметр: " + perimetr);
		System.out.println("ѕлощадь: " + ploshad);
		
	}
	 

}
