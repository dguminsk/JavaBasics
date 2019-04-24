package by.epam.javabasics.homework05;

public class Task04 {

	public static void main(String[] args) {
		/*
		 * Дана матрица. Вывести на экран первую и последнюю строки.
		 */
		
		int array[][] = {
				{1, 2, 3},
				{2, 2, 3},
				{3, 2, 3},
				{4, 2, 3}
				};
		
		for(int i = 0; i < array.length; i += array.length - 1) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
			
		}

	}

}
