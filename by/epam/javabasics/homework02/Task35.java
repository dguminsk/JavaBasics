package by.epam.javabasics.homework02;

public class Task35 {

	public static void main(String[] args) {
		
		int a = 70;
		int b = 6;
		
		double c = (double) a / b;
		
		System.out.println("Младшая цифра целой части: " + (int)c % 10);
		System.out.println("Старшая цифра дробной части: " + (int)(c * 10) % 10);

	}

}
