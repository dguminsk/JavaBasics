package by.epam.javabasics.homework04;

public class Array09 {

	public static void main(String[] args) {

		double[] array = {20.1, 0.9, -1, 3, -2, 16};
		double max = array[0], min = array[0];
		int maxIndex = 0, minIndex = 0;
		
		for(int i = 1; i < array.length; i++) {
			if(max > array[i]) {
				max = array[i];
				maxIndex = i;
			}
			if(min < array[i]) {
				min = array[i];
				minIndex = i;
			}
		}

		array[minIndex] = max;
		array[maxIndex] = min;
		WithArray.printArrayDouble(array);
	}


}
