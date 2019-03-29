package by.epam.javabasics.homework02;

public class Task38 {

	public static void main(String[] args) {
		
		int x = 3;
		int y = 1;
		
		System.out.println("Is in figure 1: " + Task38.isInFigure1(x, y));
		System.out.println("Is in figure 2: " + Task38.isInFigure2(x, y));
		System.out.println("Is in figure 3: " + Task38.isInFigure3(x, y));

	}
	
	private static boolean isInFigure1(int x, int y) {
		
		
		if(Math.abs(x) > 4 || y < 0 || y > 4) {
			return false;
		}
		
		if((Math.abs(x) + y) <= 4) {
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean isInFigure2(int x, int y) {
		
		if(x >= -4 && x <= 4 && y <= 0 && y >= -3) {
			return true;
		} else if(x >= -2 && x <= 2 && y >= 0 && y <= 4) {
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean isInFigure3(int x, int y) {
		
		if(x < 0 || y > 4 || y < -5 || x > 5) {
			return false;
		}
		
		if(y > 0 && Math.sqrt(x * x + y * y) <= 4) {
			return true;
		} else if (y <= 0 && Math.sqrt(x * x + y * y) <= 5) {
			return true;
		} else {
			return false;
		}
	}

}
