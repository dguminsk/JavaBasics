package by.epam.javabasics.unit05ht;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) throws FileNotFoundException {
		
		@SuppressWarnings("resource")
		Scanner dataFile = new Scanner(new File("src/by/epam/javabasics/unit05ht/data.txt"));
		String line;
		String formatedSum;
		int sum, value;
		
		//The first line of table
		System.out.println("------------");
		
		//Read data file's line one by one
		while(dataFile.hasNextLine()) {
			
			//Set sum of line into zero
			sum = 0;
			line = dataFile.nextLine();
			
			@SuppressWarnings("resource")
			Scanner dataLine = new Scanner(line);
			
			//Read each int value from the line
			while(dataLine.hasNext()) {
				value = dataLine.nextInt();
				
				//Add each int value to line sum one by one
				sum += value;
			}
			
			//This part of code is for pretty print, cause we have different length of sum
			//We expect for maximal 10digit value and we have next pattern:
			// -------------
			// |  10digits | 
			// -------------
			//Therefore we need to understand how many spaces we need to add before and/or after sum value
			//Convert sum into string
			String temp = Integer.toString(sum);
			
			//Add spaces before and after value if it is less than 9
			while(temp.length() < 9) {
				temp = " " + temp + " ";
			}
			
			//If value is equal to 10 we need just add open and close line (|)
			//Or it is less we need add open line and close line with space
			if(temp.length() == 10) {
				formatedSum = "|" + temp + "|";
			} else {
				formatedSum = "|" + temp + " |";
			}
			
			System.out.println(formatedSum);
			System.out.println("------------");
			
			//Set formatedSum to empty for next line
			formatedSum = "";
		}

	}

}
