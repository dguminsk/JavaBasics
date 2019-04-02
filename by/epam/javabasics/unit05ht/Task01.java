package by.epam.javabasics.unit05ht;

public class Task01 {

	public static void main(String[] args) {

		double randomNumber;
		
		// Put maximal and minimal values to variables vice verse out of range[-100; +100)
		double minimal = 100; 
		double maximal = -101;
		
		int counter = 0;

		//Starts from 0 till 99 -> 100 numbers
		while(counter < 100) {
			
			//Generate random number [-100; +100)
			randomNumber = Math.random() * 200 - 100;
			
			//Debug line for checking of random numbers from 0 till 99
			//System.out.println(counter + " : " + randomNumber);
			
			//Compare minimal value with random number.
			//If random number is less -> it becomes new minimal value
			if(randomNumber < minimal) {
				minimal = randomNumber;
			}
			//Compare maximal value with random number.
			//If random number is greater -> it becomes new maximal value
			if(randomNumber > maximal) {
				maximal = randomNumber;
			}
			
			counter++;
			
		}
		
		System.out.println("Maximal value: " + maximal);
		System.out.print("Minimal value: " + minimal);
		
	}

}
