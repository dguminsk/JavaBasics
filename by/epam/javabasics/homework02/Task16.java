package by.epam.javabasics.homework02;
import java.util.Scanner;

public class Task16 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Введите 4х значное число > ");
		while(input.hasNextInt() == false) {
			input.next();
			System.out.print("Please enter int value > ");
		}
		int chislo = input.nextInt();
		if((chislo / 10000) == 0 && (chislo / 1000) != 0) {
			int first = chislo / 1000;
			int second = (chislo / 100) % 10;
			int third = (chislo / 10) % 10;
			int fourth = chislo % 10;
			
			int answer = first * second * third * fourth;
			System.out.print("Произведение цифр = " + answer);
		} else {
			System.out.print("Вы ввели не четырехзначное число");
		}
		
	}

}
