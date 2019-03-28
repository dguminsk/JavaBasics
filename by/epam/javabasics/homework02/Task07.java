package by.epam.javabasics.homework02;
import java.util.Scanner;

public class Task07 {
	
	public static void main(String[] args) {
		
		double dlinna, ploshad;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Введите длину прямоугольника > ");
		while(input.hasNextDouble() == false) {
			input.next();
			System.out.print("Please enter double value > ");
		}
		dlinna = input.nextDouble();
		
		ploshad = dlinna * dlinna / 2;
		
		System.out.print("Площадь прямоугольника: " + ploshad);
		
	}

}
