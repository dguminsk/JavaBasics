package by.epam.javabasics.homework04;

public class ArraySum {

	public static void main(String[] args) {
		
		int[] array =  {1,2,3,4,5,6};
		System.out.println(sumOfThree(array, 0));
		System.out.println(sumOfThree(array, 2));
		System.out.println(sumOfThree(array, 3));

	}
	 
	private static int sumOfThree(int[] array, int k) {
		int sum = 0;
		if(k + 3 > array.length) {
			return sum;
		} else {
			for(int i = 0; i < 3; i++) {
				sum += array[k + i];
			}
		}
		return sum;
	}

}
