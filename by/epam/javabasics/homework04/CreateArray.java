package by.epam.javabasics.homework04;

public class CreateArray {

	public static void main(String[] args) {
		WithArray.printArray(arrayCreator(123456));
		

	}
	
	private static int intLength(int n) {
		int counter = 0;
		while(n != 0) {
			n = n / 10;
			counter++;
		}
		return counter;
	}
	
	private static int[] arrayCreator(int n) {
		
		int length = intLength(n);
		int[] array = new int[length];
		
		while(n != 0) {
			array[length - 1] = n % 10;

			n = n / 10;
			length--;
		}
		
		return array;
		
	}

}
