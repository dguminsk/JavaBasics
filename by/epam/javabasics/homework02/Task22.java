package by.epam.javabasics.homework02;

public class Task22 {

	public static void main(String[] args) {
		
		int time = 1234566780;
		
		int h = (time / 3600) % 24;
		int m = (time % 3600) / 60;
		int s = (time % 3600) % 60;
		
		System.out.print(h + "ч " + m + "м " + s + "с");
		

	}

}
