package by.epam.javabasics.homework02;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int var, first, second, third, temp, counter;
		double x, y, m, n, a, b, c;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//TODO: ������ ������� � = ��2 + b�+ � �������� ����� �������� ����� � ������������ (m, n). 

		System.out.println("������ ������� � = ��2 + b�+ � �������� ����� �������� ����� � ������������ (m, n)");
		System.out.print("������� a > ");
		while(input.hasNextDouble() == false) {
			System.out.println("Enter double value > ");
			input.next();
		} 
		a = input.nextDouble();
		
		System.out.print("������� b > ");
		while(input.hasNextDouble() == false) {
			System.out.println("Enter double value > ");
			input.next();
		} 
		b = input.nextDouble();
		
		System.out.print("������� c > ");
		while(input.hasNextDouble() == false) {
			System.out.println("Enter double value > ");
			input.next();
		} 
		c = input.nextDouble();
		
		System.out.print("������� m > ");
		while(input.hasNextDouble() == false) {
			System.out.println("Enter double value > ");
			input.next();
		} 
		m = input.nextDouble();
		
		System.out.print("������� n > ");
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