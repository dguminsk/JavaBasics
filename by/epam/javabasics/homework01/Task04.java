package by.epam.javabasics.homework01;

public class Task04 {
	
	public static void main(String[] args) {
		
		int katet1 = 12;
		int katet2 = 5;		
		int gipotenuza = (int) Math.sqrt((katet1 * katet1) + (katet2 * katet2));
		int ploshad = (katet1 * katet2)/2;
		
		System.out.println("Площадь:" + ploshad + " Гипотенуза:" + gipotenuza);
		
	}

}
