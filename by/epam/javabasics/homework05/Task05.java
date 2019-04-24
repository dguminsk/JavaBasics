package by.epam.javabasics.homework05;

public class Task05 {

	public static void main(String[] args) {
		/*
		 * Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.
		 */
		
		int array[][] = {
				{1, 2, 3},
				{2, 2, 3},
				{3, 2, 3},
				{4, 2, 3},
				{5, 2, 3},
				{6, 2, 3}
				};
		
		for(int i = 1; i < array.length; i += 2) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
			
		}
		
	}

}
