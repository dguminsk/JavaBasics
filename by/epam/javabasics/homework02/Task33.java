package by.epam.javabasics.homework02;
import java.util.Scanner;

public class Task33 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a symbol > ");
		
		String symbol = input.next();
	
		int position = symbol.codePointAt(0);

		char before = (char)(position - 1);
		char after = (char)(position + 1);
		
		System.out.println("Position of this symbol is: " + position);
		System.out.println("Symbol before entered is: " + before);
		System.out.println("Symbol after entered is: " + after);
		

	}

}
