package by.epam.javabasics.homework05;

import by.epam.javabasics.homework04.WithArray;

public class Task13 {

	public static void main(String[] args) {
		
		int n = 8;
		
		int[][] array = new int[n][n];
		
		for(int i = 0; i < array.length; i++) {
			
			if(i % 2 == 0) {
				for(int j = 0; j < array[i].length; j++) {	
						array[i][j] = j + 1;
				}
			} else {
				for(int j = 0; j < array[i].length; j++) {	
					array[i][j] = n - j;
				}
			}
			
		}
		
		WithArray.printArrayOfArray(array, false);

	}

}
