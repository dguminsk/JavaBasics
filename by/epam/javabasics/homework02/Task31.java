package by.epam.javabasics.homework02;

public class Task31 {

	public static void main(String[] args) {
		
		double v_lodki = 12;
		double v_techenia = 3;
		double t_ozero = 4;
		double t_protiv = 2;
		
		double s1 = v_lodki * t_ozero;
		double s2 = (v_lodki - v_techenia) * t_protiv;
		
		double s = s1 + s2;
		
		System.out.print("Way is: " + s + " km");

	}

}
