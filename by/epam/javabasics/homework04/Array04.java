package by.epam.javabasics.homework04;

public class Array04 {

	public static void main(String[] args) {
		int[] array = {0,1,2,3,4,2};
		
		int temp = array[0];
		boolean bool = true;
		
		for(int x = 1; x < array.length; x++) {
			if(array[x] <= temp) {
				bool = false;
				break;
			} else {
				temp = array[x];
			}
		}
		System.out.print("Возрастающая последовательность: " + bool);

	}

}
