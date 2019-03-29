package by.epam.javabasics.homework02;

public class Task24 {

	public static void main(String[] args) {
		
		double a = 8;
		double b = 2;
		double ugol = 45;
		
		double vysota = ((a - b) / 2) * Math.tan(Math.toRadians(ugol));

		double ploshad = ((a - b) / 2) * vysota;
		
		System.out.print("Answer is:" + ploshad);

	}

}
