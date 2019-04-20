package by.epam.javabasics.homework04;

public class Decomposition {

	public static void main(String[] args) {
		
		System.out.println(gcd(18, 30));
		System.out.println(lcm(18, 30));
		System.out.println(gcdOfFour(18, 36, 54, 27));
		System.out.println(lcmOfThree(18, 36, 4));
		
		
	}
	
	
	
	private static int lcm(int a, int b) {
		
		return (a * b) / Decomposition.gcd(a, b);
		
	}
	
	private static int gcd(int a, int b) {
		
		while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
        
	}
	
	private static int gcdOfFour(int a, int b, int c, int d) {
		
		int gcd1 = Decomposition.gcd(a, b);
		int gcd2 = Decomposition.gcd(c, d);
		return Decomposition.gcd(gcd1, gcd2);
		
	}
	
	private static int lcmOfThree(int a, int b, int c) {
		
		int lcm = Decomposition.lcm(a, b);
		return Decomposition.lcm(c, lcm);
		
	}
	

}
