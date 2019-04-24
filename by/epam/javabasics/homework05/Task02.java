package by.epam.javabasics.homework05;

import by.epam.javabasics.homework04.WithArray;

public class Task02 {

	public static void main(String[] args) {
		/*
		 * Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].
		 */
		double a;
		int[][] array = new int[2][3];
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				a = Math.random() * 10;
				array[i][j] = (int) a;
			}
		}
		
		WithArray.printArrayOfArray(array, false);

	}

}
