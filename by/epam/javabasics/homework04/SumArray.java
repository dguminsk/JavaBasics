package by.epam.javabasics.homework04;

public class SumArray {

	public static void main(String[] args) {
		/* Даны натуральные числа К и N. Написать метод(методы) формирования массива А, 
		 * элементами которого являются числа, сумма цифр которых равна К и которые не большее N. 
		 */
		
		int k = 15;
		int n = 7;
		WithArray.printArray(createArray(k, n));

	}
	
	private static int[] createArray(int k, int n) {
		
		int max = k / n;

		int ostatok = k % n;

		int razmer = 0;
		
		if(ostatok == 0) {
			razmer = max;
		} else {
			razmer = max + 1;
		}
		
		int[] array = new int[razmer];
		
		for(int i = 0; i < array.length; i++) {
			if(i == array.length - 1 && ostatok != 0) {
				array[i] = ostatok;
			} else {
				array[i] = n;
			}
		}
		
		return array;
	}

}
