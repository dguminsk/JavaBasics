package by.epam.javabasics.homework02;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int var, first, second, third;
		double x, y, m, n;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//TODO: Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= m, y= n (m<n). 
		System.out.println("Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= m, y= n (m<n). Введите x > ");
		System.out.println("Введите x > ");
		if(input.hasNextDouble()) {
			x = input.nextDouble();
		}
		
		System.out.println("Введите y > ");
		if(input.hasNextDouble()) {
			y = input.nextDouble();
		}
		
		System.out.println("Введите m > ");
		if(input.hasNextDouble()) {
			m = input.nextDouble();
		}
		
		System.out.println("Введите n > ");
		if(input.hasNextDouble()) {
			n = input.nextDouble();
		}

		

	}

}