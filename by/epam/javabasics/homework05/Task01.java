package by.epam.javabasics.homework05;

import by.epam.javabasics.homework04.WithArray;

public class Task01 {

	public static void main(String[] args) {
		/*
		 * Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и вывести на экран.
		 */
		
		int[][] array = new int[3][4];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 1; j < 2; j++) {
				array[i][j] = 1;
			}
			
		}
		
		WithArray.printArrayOfArray(array, false);

	}

}
