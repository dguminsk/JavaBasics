package by.epam.javabasics.homework04;

public class Armstrong {

	public static void main(String[] args) {
		System.out.print(isArmstrong(1535));

	}
	
	private static boolean isArmstrong(int a) {
		int temp = 0;
		int b = a;
		int c = a;
		int counter = 0;
		while(a > 0) {
			counter++;
			a = a / 10;
		}
		while(b > 0) {
			temp += Math.pow(b % 10, counter);
			b = b / 10;
		}
		
		if(temp == c) {
			return true;
		} else {
			return false;
		}
	}

}
