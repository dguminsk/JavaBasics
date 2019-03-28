package by.epam.javabasics.homework02;

public class Task19 {

	public static void main(String[] args) {

		double storona = 4;
		
		double vysota = Math.sqrt(3) / 2 * storona;
		double ploshad = Math.sqrt(3) / 4 * (storona * storona);
		double r_vpisannoj = Math.sqrt(3) / 6 * storona;
		double r_opisannoj = Math.sqrt(3) / 3 * storona;
		
		System.out.println("Площадь: " + ploshad);
		System.out.println("Высота: " + vysota);
		System.out.println("Радиус вписанной окружности: " + r_vpisannoj);
		System.out.println("Радиус описанной окружности: " + r_opisannoj);

	}

}
