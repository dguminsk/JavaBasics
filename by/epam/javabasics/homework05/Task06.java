package by.epam.javabasics.homework05;

public class Task06 {

	public static void main(String[] args) {
		/*
		 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
		 */
		int array[][] = {
				{1, 2, 3, 4, 5, 6, 7},
				{2, 2, 3, 5, 6, 7, 6},
				{3, 2, 3, 5, 6, 7, 4},
				{0, 2, 1, 5, 6, 7, 2}
				};
		int first;
		int last;
		
		for(int i = 0; i < array.length; i++) {
			
				for(int j = 0; j < array[i].length; j+=2) {
					first = array[0][j];
					last = array[array.length - 1][j];
					if(first > last) {
						System.out.print(array[i][j] + " ");
					}
				}
			
			System.out.println();
			
		}

	}

}
