package by.epam.javabasics.homework04;

public class Array19 {

	public static void main(String[] args) {
		int[] array = {1,1,2,3,4,4,4,5,6,6,6,6,6,7,7,7,7,3,3,2,2,1,2,2,3,4,5};
		
		int max = 0;
		
		for(int x: array) {
			if(x > max) {
				max = x;
			}
		}	
		int[] newArray = new int[max + 1];
		
		for(int x: array) {
			newArray[x]++;
		}
		WithArray.printArray(newArray);
		
		int newMax = 0;
		int index = 0;
		for(int i = max; i >= 0; i--) {
			if(newMax <= newArray[i]) {
				newMax = newArray[i];
				index = i;
			}
		}
		System.out.print(index);
	}
	
}
