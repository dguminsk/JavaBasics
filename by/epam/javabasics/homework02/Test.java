package by.epam.javabasics.homework02;
import java.util.Scanner;
import by.*;

public class Test {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		while(input.hasNextDouble() == false || input.nextDouble() == 0) {
			input.next();
			System.out.print("Please enter double value > ");
		}
		System.out.print("OK");
		
	}
}