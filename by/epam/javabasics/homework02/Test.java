package by.epam.javabasics.homework02;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int var, first, second, third, temp, counter;
		double x, y, m, n, a, b, c;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//TODO: √рафик функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, n). 

		System.out.println("√рафик функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, n)");
		System.out.print("¬ведите a > ");
		while(input.hasNextDouble() == false) {
			System.out.println("Enter double value > ");
			input.next();
		} 
		a = input.nextDouble();
		
		System.out.print("¬ведите b > ");
		while(input.hasNextDouble() == false) {
			System.out.println("Enter double value > ");
			input.next();
		} 
		b = input.nextDouble();
		
		System.out.print("¬ведите c > ");
		while(input.hasNextDouble() == false) {
			System.out.println("Enter double value > ");
			input.next();
		} 
		c = input.nextDouble();
		
		System.out.print("¬ведите m > ");
		while(input.hasNextDouble() == false) {
			System.out.println("Enter double value > ");
			input.next();
		} 
		m = input.nextDouble();
		
		System.out.print("¬ведите n > ");
		while(input.hasNextDouble() == false) {
			System.out.println("Enter double value > ");
			input.next();
		} 
		n = input.nextDouble();
		
		if(n == a * n * n + b * n + c) {
			System.out.print(true);
		} else {
			System.out.print(false);
		}
		
		
	}

}