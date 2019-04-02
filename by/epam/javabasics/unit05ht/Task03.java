package by.epam.javabasics.unit05ht;

public class Task03 {

	public static void main(String[] args) {
		
		// Set start month and year and final month and year (in this code I include end month into count)
		int startYear = 2015;
		int endYear = 2019;
		int startMonth = 9;
		int endMonth = 4;
		
		// Code goes through years one by one from start to end, so currentYear variable for that. Final counter is variable days
		int currentYear;
		int days = 0;
		
		// Loop for years one by one from start to end if start year different from end
		while(startYear != endYear) {
			
			currentYear = startYear;
			
			//Check is it leap or not year and use necessary method
			if((currentYear % 4 == 0 && currentYear % 100 != 0) || currentYear % 400 == 0) {
				days += Task03.daysInYearLeap(startMonth, 12);
			} else {
				days += Task03.daysInYear(startMonth, 12);
			}
			
			//Set start month to 1 for next year 
			startMonth = 1;
			startYear++;
		}
		
		// Adding of days from last year
		if((endYear % 4 == 0 && endYear % 100 != 0) || endYear % 400 == 0) {
			days += Task03.daysInYearLeap(startMonth, endMonth);
		} else {
			days += Task03.daysInYear(startMonth, endMonth);
		}
		
		System.out.print(days);

	}
	
	private static int daysInYearLeap(int startMonth, int endMonth) {
		var days = 0;
		
		// Adding days of the month one by one from start month to end
		while(startMonth <= 12 && startMonth <= endMonth) {
			
			//April, June, September, November
			if(startMonth == 4 || startMonth == 6 || startMonth == 9 || startMonth == 11) {
				days += 30;
				
			//February of leap year
			} else if(startMonth == 2) {
				days += 29;
				
			//Other months
			} else {
				days += 31;
			}
			startMonth++;

		}
		return days;
	}
	
	private static int daysInYear(int startMonth, int endMonth) {
		var days = 0;
		
		// Adding days of the month one by one from start month to end
		while(startMonth <= 12 && startMonth <= endMonth) {
			
			//April, June, September, November
			if(startMonth == 4 || startMonth == 6 || startMonth == 9 || startMonth == 11) {
				days += 30;
			
			//February of NOT leap year
			} else if(startMonth == 2) {
				days += 28;
			
			//Other months
			} else {
				days += 31;
			}

			startMonth++;
		}
		return days;
	}

}
