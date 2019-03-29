package by.epam.javabasics.homework02;

public class Task30 {

	public static void main(String[] args) {
		
		double R1 = 3;
		double R2 = 4;
		double R3 = 5;
		
		double resistance = (R1 * R2 * R3) / (R1 * R2 + R2 * R3 + R1 * R3);
		
		System.out.print("Resistance equal: " + resistance);

	}

}
