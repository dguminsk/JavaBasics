package by.epam.javabasics.homework02;

public class Task28 {

	public static void main(String[] args) {
		
		double radian = 121;
		
		double ugol_in_seconds = radian * (180 / Math.PI) * 3600;
		
		double ugol = ugol_in_seconds / 3600;
		double minutes = (ugol_in_seconds % 3600) / 60;
		double seconds = (ugol_in_seconds % 3600) % 60;
		
		System.out.print((int)ugol + "° " + (int)minutes + "' " + Math.round(seconds) + "\"");
		
	}

}
