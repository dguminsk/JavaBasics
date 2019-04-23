package by.epam.javabasics.homework04;

public class Simple {

	public static void main(String[] args) {

		System.out.print(simpleOfThree(1,3,61));

	}
	
	private static boolean simpleOfThree(int a, int b, int c) {
		if(gcd(a, b) == 1 && gcd(b, c) == 1 && gcd(a, c) == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	
	private static int gcd(int a, int b) {
		
		while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
        
	}

}
