package by.epam.javabasics.homework02;
import java.util.Scanner;

public class Task06 {
	
	public static void main(String[] args) {
		
		int mBidon;
		int bBidon;
		
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Малых бидонов > ");
		while(input.hasNextInt() == false) {
			input.next();
			System.out.print("Please enter int value > ");
		}
		mBidon = input.nextInt();
		
		System.out.print("Больших бидонов > ");
		while(input.hasNextInt() == false) {
			input.next();
			System.out.print("Please enter int value > ");
		}
		bBidon = input.nextInt();
		
		if(mBidon == 0) {
			System.out.print("Задача не имеет решения");
		} else {
			double objemmBidon = 80 / mBidon;
			double objembBidon = objemmBidon + 12;
			System.out.print("Объем в больших бидонах: " + objembBidon * bBidon);
		}	
		
	}

}
