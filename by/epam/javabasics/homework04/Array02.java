package by.epam.javabasics.homework04;

public class Array02 {

	public static void main(String[] args) {
		int[] array = {0,1,2,0,0,3,0,4};
		
		int razmer = 0;
		
		for(int x: array) {
			if(x == 0) {
				razmer++;
			}
		}
		
		System.out.println(razmer);
		int[] array2 = new int[razmer];
		razmer = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 0) {
				array2[razmer] = i;
				razmer++;
			}
		}
		
		WithArray.printArray(array2);
	}

}
