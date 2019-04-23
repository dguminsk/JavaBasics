package by.epam.javabasics.homework04;

public class Array07 {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8,9};
		int z = 5;
		int counter = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > z) {
				array[i] = z;
				counter++;
			}
		}
		
		WithArray.printArray(array);
		System.out.print(counter);

	}

}
