package by.epam.javabasics.homework04;

public class SumFactorials {

	public static void main(String[] args) {
		
		System.out.print(sumOfFactorials(9));

	}
	
	private static int sumOfFactorials(int a) {
		int sum = 0;
		while(a > 0) {
			if(a % 2 == 0) {
				sum += factorial(a);
			}
			a --;
		}
		
		return sum;
	}
	
	private static int factorial(int a) {
		
		int factorial = 1;
		while(a > 0) {
			factorial *= a;
			a--;
		}
		
		return factorial;
	}

}
