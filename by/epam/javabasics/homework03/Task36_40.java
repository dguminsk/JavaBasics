package by.epam.javabasics.homework03;


public class Task36_40 {

	public static void main(String[] args) {
		
		// 36
		double x = 4;
		double answer;
		if(x >= 3) {
			answer = x * x - 3 * x + 9;
			System.out.println("36. F(x) = " + answer);
		} else {
			answer = 1 / (x * x * x + 6);
			System.out.println("36. F(x) = " + answer);
		}
		
		// 37
		if(x >= 3) {
			answer = -(x * x) + 3 * x + 9;
			System.out.println("37. F(x) = " + answer);
		} else {
			answer = 1 / (x * x * x - 6);
			System.out.println("37. F(x) = " + answer);
		}
		
		// 38
		if(x <= 3 && x >=0) {
			answer = x * x;
			System.out.println("38. F(x) = " + answer);
		} else {
			answer = 4;
			System.out.println("38. F(x) = " + answer);
		}
		
		//39
		if(x >= 8) {
			answer = -(x * x) + x - 9;
			System.out.println("39. F(x) = " + answer);
		} else {
			answer = 1 / (x * x * x * x - 6);
			System.out.println("39. F(x) = " + answer);
		}
		
		//40
		if(x <= 13) {
			answer = -(x * x * x) + 9;
			System.out.println("40. F(x) = " + answer);
		} else {
			answer = -(3 / (x + 1));
			System.out.println("40. F(x) = " + answer);
		}

	}

}
