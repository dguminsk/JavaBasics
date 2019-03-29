package by.epam.javabasics.homework02;

public class Task36 {

	public static void main(String[] args) {
		
		int a = 3636;
		int chet = 1;
		int nechet = 1;
		int temp = 0;
		
		while(a != 0) {
			temp = a % 10;
			
			if(temp % 2 == 0) {
				chet *= temp;
			} else {
				nechet *= temp;
			}
			
			a = a / 10;
		}
		
		double answer = (double) chet / nechet;
		
		System.out.println("Answer is: " + answer);


	}

}
