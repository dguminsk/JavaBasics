package by.epam.javabasics.homework02;

public class Task38 {

	public static void main(String[] args) {
		
		int x = 3;
		int y = -3;
		
		System.out.println(Task38.isInFigure1(x, y));
		System.out.println(Task38.isInFigure2(x, y));
		System.out.println(Task38.isInFigure3(x, y));

	}
	
	private static boolean isInFigure1(int x, int y) {
		if(x == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean isInFigure2(int x, int y) {
		
		if(-4 <= x && x <= 4 && -3 <= y && y <= 4) {
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean isInFigure3(int x, int y) {
		
		if(x < 0 || y > 4 || y < -5 || x > 5) {
			return false;
		}
		
		if(y > 0 && x + y <= 4) {
			return true;
		} else if (x + Math.abs(y) <= 5) {
			return true;
		} else {
			return false;
		}
	}

}
