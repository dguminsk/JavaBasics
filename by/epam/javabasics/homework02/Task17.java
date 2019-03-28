package by.epam.javabasics.homework02;

public class Task17 {

	public static void main(String[] args) {	

		double a = 4;
		double b = 4;
		
		double arifmetic = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		double geometric = Math.sqrt(a * b);
		
		System.out.println("Среднее арифметическое кубов чисел " + a + " и " + b + " = " + arifmetic);
		System.out.println("Среднее геометрическое чисел " + a + " и " + b + " = " + geometric);
		

	}

}
