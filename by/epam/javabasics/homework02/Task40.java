package by.epam.javabasics.homework02;

public class Task40 {

	public static void main(String[] args) {
		
		int x = 1;
		
		double temp = 4 * x;
		double func1 = x * (-2 + x * (3 - temp));
		double func2 = 1 + x * (2 + x * (3 + temp));
		
		System.out.print("Answer is: " + func1 + " and " + func2);
		
	}

}
