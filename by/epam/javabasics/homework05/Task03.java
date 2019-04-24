package by.epam.javabasics.homework05;


public class Task03 {

	public static void main(String[] args) {
		/*
		 * Дана матрица. Вывести на экран первый и последний столбцы.
		 */
		
		int array[][] = {
				{1, 2, 3},
				{2, 2, 3},
				{3, 2, 3},
				{4, 2, 3}
				};
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j+=array[i].length - 1) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
			
		}

	}

}
