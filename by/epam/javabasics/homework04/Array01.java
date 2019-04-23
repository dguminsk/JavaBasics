package by.epam.javabasics.homework04;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6,7,8};
		int k = 2;
		System.out.print(sumOfKrat(array, k));
		
	}
	
	private static int sumOfKrat(int[] array, int k) {
		int sum = 0;
		for(int x: array) {
			if(x % k != 0) {
				sum += array[x];
			}
		}
		return sum;
	}

}
