package by.epam.javabasics.homework04;

public class Triangle {

	public static void main(String[] args) {

		System.out.println("Площадь треугольника: " + Triangle.sTriangleByKoordinats(1, 1, 2, 2, 3, 5));
		
		System.out.print("Площадь шестиугольника: ");
		// Находим площадь треугольника со сторонами А и умножаем на 6
		System.out.println(Triangle.sTriangleBySides(3, 3, 3) * 6);

	}
	
	private static double sTriangleByKoordinats(double x1, double y1, double x2, double y2, double x3, double y3) {
		
		double storona1 = Math.abs(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
		double storona2 = Math.abs(Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2)));
		double storona3 = Math.abs(Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2)));
		return Triangle.sTriangleBySides(storona1, storona2, storona3);
		
	}
	
	private static double sTriangleBySides(double storona1, double storona2, double storona3) {
		
		double perimetr = storona1 + storona2 + storona3;
		double polperim = perimetr / 2;
		double ploshad = Math.sqrt(polperim * (polperim - storona1) * (polperim - storona2) * (polperim - storona3));
		return ploshad;
		
	}

}
