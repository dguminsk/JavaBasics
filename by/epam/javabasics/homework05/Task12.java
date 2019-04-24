package by.epam.javabasics.homework05;

import by.epam.javabasics.homework04.WithArray;

public class Task12 {

	public static void main(String[] args) {
		
		int n = 9;
		
		int[][] array = new int[n][n];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(i == j) {
					array[i][j] = i;
				}
			}
		}
		
		WithArray.printArrayOfArray(array, false);

	}

}
