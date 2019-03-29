package by.epam.javabasics.homework02;

public class Task25 {

	public static void main(String[] args) {
		
		double a = 1;
		double b = 2;
		double c = 1;
		
		double D = b * b - 4 * a * c;
		
		if(a == 0 || D < 0) {
			System.out.print("Not correct data: (a = 0 OR D < 0)");
			return;
		}
		
		if(D == 0) {
			double x = -b / (2 * a);
			System.out.print("x = " + x);
		} else {
			double x1 = (-b + Math.sqrt(D)) / (2 * a);
			double x2 = (-b - Math.sqrt(D)) / (2 * a);
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		
	}

}
