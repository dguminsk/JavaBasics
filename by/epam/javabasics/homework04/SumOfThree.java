package by.epam.javabasics.homework04;

public class SumOfThree {

	public static void main(String[] args) {
		
		System.out.println(sumOfHighAndSmall(18, 36, 4));

	}
	
	private static double sumOfHighAndSmall(double a, double b, double c) {
		
		// a большее
		if(a > b && a > c) {
			if(b > c) {
				return a + c;
			} else {
				return a + b;
			}
			
		// b большее	
		} else if(b > a && b > c) {
			if(a > c) {
				return b + c;
			} else {
				return b + a;
			}
		// c большее
		} else if(c > a && c > b) {
			if(a > b) {
				return b + c;
			} else {
				return c + a;
			}
		// все числа равны	
		} else {
			return c + a;
		}
		
	}

}
