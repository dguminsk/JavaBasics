package by.epam.javabasics.homework02;

public class Task23 {

	public static void main(String[] args) {
		
		double r = 1;
		double R = 1.1;
		
		double small_ploshad = Math.PI * r * r;
		double big_ploshad = Math.PI * R * R;
		
		double answer = big_ploshad - small_ploshad;
		
		System.out.print("Answer is: " + answer);

	}

}
