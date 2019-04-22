package by.epam.javabasics.homework04;

public class MoreSymbols {

	public static void main(String[] args) {
		System.out.print(moreSymbols(123,4567));

	}
	
	private static String moreSymbols(int n, int m) {
		int counter1 = 0;
		int counter2 = 0;
		while(n != 0) {
			n = n / 10;
			counter1++;
		}
		while(m != 0) {
			m = m / 10;
			counter2++;
		}
		
		if(counter1>counter2) {
			return "В первом числе больше цифр";
		} else if(counter2>counter1) {
			return "Во втором числе больше цифр";
		} else {
			return "Количество цифр равно";
		}
	} 

}
