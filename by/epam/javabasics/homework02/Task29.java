package by.epam.javabasics.homework02;

public class Task29 {

	public static void main(String[] args) {
		
		double a = 5;
		double b = 5;
		double c = 5;
		
		double cosA = (b * b + c * c - a * a) / (2 * b * c);
		double cosB = (a * a + c * c - b * b) / (2 * b * c);	
		double cosC = (a * a + b * b - c * c) / (2 * b * c);	
		
		System.out.println("First angle in radians: " + Math.acos(cosA) + " in degrees: " + Math.toDegrees(Math.acos(cosA)));
		System.out.println("Second angle in radians: " + Math.acos(cosB) + " in degrees: " + Math.toDegrees(Math.acos(cosB)));
		System.out.println("Third angle in radians: " + Math.acos(cosC) + " in degrees: " + Math.toDegrees(Math.acos(cosC)));

	}

}
