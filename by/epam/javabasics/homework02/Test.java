package by.epam.javabasics.homework02;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int var, first, second, third;
		double x, y, m, n;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//TODO: ����� � ������������ (�, �) ����������� ����� ���������, ������� ����� ������� �= m, y= n (m<n). 
		System.out.println("����� � ������������ (�, �) ����������� ����� ���������, ������� ����� ������� �= m, y= n (m<n). ������� x > ");
		System.out.println("������� x > ");
		if(input.hasNextDouble()) {
			x = input.nextDouble();
		}
		
		System.out.println("������� y > ");
		if(input.hasNextDouble()) {
			y = input.nextDouble();
		}
		
		System.out.println("������� m > ");
		if(input.hasNextDouble()) {
			m = input.nextDouble();
		}
		
		System.out.println("������� n > ");
		if(input.hasNextDouble()) {
			n = input.nextDouble();
		}

		

	}

}