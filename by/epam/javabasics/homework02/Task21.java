package by.epam.javabasics.homework02;

public class Task21 {

	public static void main(String[] args) {
		
		double a = 223.336;
		
		double z = (int) a ;
		double x = (int)((a - z)  * 1000);
		
		double s = z / 1000;
		double ans = x + s;
		
		System.out.println(ans);

	}

}
