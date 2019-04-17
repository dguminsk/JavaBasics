package by.epam.javabasics.homework04;

public class Decomposition {

	public static void main(String[] args) {
		System.out.println("Площадь треугольника: " + Decomposition.sTriangleByKoordinats(1, 1, 2, 2, 3, 5));
		System.out.println(Decomposition.gcd(18, 30));
		System.out.println(Decomposition.lcm(18, 30));
		System.out.println(Decomposition.gcdOfFour(18, 36, 54, 27));
		System.out.println(Decomposition.lcmOfThree(18, 36, 4));
		System.out.println(Decomposition.sumOfHighAndSmall(18, 36, 4));
		
		// Находим площадь треугольника со сторонами А и умножаем на 6
		System.out.println(Decomposition.sTriangleBySides(3, 3, 3) * 6);
		

	}
	
	
	private static double sTriangleByKoordinats(double x1, double y1, double x2, double y2, double x3, double y3) {
		
		double storona1 = Math.abs(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
		double storona2 = Math.abs(Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2)));
		double storona3 = Math.abs(Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2)));
		return Decomposition.sTriangleBySides(storona1, storona2, storona3);
		
	}
	
	private static double sTriangleBySides(double storona1, double storona2, double storona3) {
		
		double perimetr = storona1 + storona2 + storona3;
		double polperim = perimetr / 2;
		double ploshad = Math.sqrt(polperim * (polperim - storona1) * (polperim - storona2) * (polperim - storona3));
		return ploshad;
		
	}
	
	private static int lcm(int a, int b) {
		
		return (a * b) / Decomposition.gcd(a, b);
		
	}
	
	private static int gcd(int a, int b) {
		
		while (b !=0) {
            int tmp = a%b;
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
