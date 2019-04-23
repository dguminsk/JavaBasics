package by.epam.javabasics.homework04;

public class TheSecond {

	public static void main(String[] args) {
		/*
		 *   Составить программу, которая в массиве A[N] находит второе по величине число  
		 *  (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
		 */
		
		int[] array = {1, 97, 78, -120, 88, -91, 21, 105};
		System.out.print(secondHigh(array));
		
	}
	
	private static int secondHigh(int[] array) {
		
		int first = array[0];
		int second = array[0];
		
		for(int i = 1; i < array.length; i++) {
			if(array[i] > first) {
				first = array[i];
			}
		}
		
		for(int i = 1; i < array.length; i++) {
			if(array[i] > second && array[i] < first) {
				second = array[i];
			}
		}
		
		return second;
		
	}

}
