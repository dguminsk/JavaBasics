package by.epam.javabasics.homework02;

public class Task40 {

	public static void main(String[] args) {
		int x = 1;
		
		//After simplify we have -x(2-x(3+4x)) and 1+x(2+x(3+4x))
		//The same part is x(3+4x)
		//same_part = x * (3 + 4 * x);
		
		//Now we have: -x(2-same_part) and 1 + x(2 + same_part)
		//Therefore: -2x + same_part * x and 1 + 2x + same_part * x -> same_part * x = same_part2
		
		double same_part2 = (x * (3 + 4 * x)) * x;
		// TODO: funck1 isn't right
		double func1 = -2 * x + same_part2;
		double func2 = 1 + 2 * x + same_part2;
		
		System.out.print("Answer is: " + func1 + " and " + func2);
		

	}

}
