package by.epam.javabasics.homework02;

public class Task32 {
	
	public static void main(String[] args) {
		
		int current_h = 12;
		int current_m = 12;
		int current_s = 12;
		
		int plus_h = 12;
		int plus_m = 57;
		int plus_s = 48;
		
		int current_in_seconds = current_h * 3600 + current_m * 60 + current_s;
		int plus_in_seconds = plus_h * 3600 + plus_m * 60 + plus_s;
		
		int new_time = current_in_seconds + plus_in_seconds;
		
		int new_h = (new_time / 3600) % 24;
		int new_m = (new_time % 3600) / 60;
		int new_s = (new_time % 3600) % 60;
		
		
		System.out.print(new_h + ":" + new_m + ":" + new_s);
		
		
	}

}
