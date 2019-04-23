package by.epam.javabasics.homework04;

public class Array03 {

	public static void main(String[] args) {
		int[] array = {0,-1,2,3,-4,6};
		
		for(int x: array) {
			if(x > 0) {
				System.out.print("Положительное");
				break;
			} else if(x < 0) {
				System.out.print("Отрицательное");
				break;
			}
		}

	}

}
