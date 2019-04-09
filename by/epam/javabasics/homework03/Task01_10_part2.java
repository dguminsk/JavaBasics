package by.epam.javabasics.homework03;

import java.util.Scanner;

public class Task01_10_part2 {

	public static void main(String[] args) {
		// 1. Необходимо вывести на экран числа от 1 до 5.
		int counter = 1;
		
		while(counter <= 5) {
			System.out.println(counter);
			counter++;
		}
		
		// 2. Необходимо вывести на экран числа от 5 до 1.
		counter = 5;
		while(counter > 0) {
			System.out.println(counter);
			counter--;
		}
		
		// 3. Вывести таблицу умножения на 3
		int chislo = 3;
		counter = 0;
		int answer = 0;
		
		while(counter <= 10) {
			answer = chislo * counter;
			System.out.println(counter + " x " + chislo + " = " + answer);
			counter++;
		}
		
		// 4. все четные от 2 до 100 вкл.
		counter = 2;
		
		while(counter <= 100) {
			System.out.println(counter);
			counter += 2;
		}
		
		// 5. сумма всех нечетных от 1 до 99 вкл.
		
		counter = 1;
		int sum = 0;
		
		while(counter <= 99) {
			sum += counter;
			counter += 2;
		}
		System.out.println("Answer: " + sum);
		
		// 6. Напишите программу где польз вводит целое полож число а программа суммирует все числа от 1 до введенного
		System.out.println("Введите число > ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int start = input.nextInt();	
		sum = 0;
		
		while(start >= 1) {
			sum += start;
			start -= 1;
		}
		System.out.println("Answer: " + sum);
		
		// 7
		double a = 1;
		double b = 7;
		double h = 2;
		
		while(a <= b) {
			if(a > 2) {
				System.out.println(a);
			} else {
				System.out.println(-a);
			}
			a += h;
		}
		
		// TODO: don't understand 
		a = 1;
		b = 7;
		h = 2;
		
		while(a <= b) {
			if(a == 15) {
				System.out.println(a);
			} else {
				System.out.println(-a);
			}
			a += h;
		}
		
		// 9. сумма квадратов первых ста чисел
		counter = 0;
		for(int i = 0; i < 101; i++) {
			counter += i * i;
		}
		System.out.println("Answer is " + counter);
		
		// 10 произведение квадратов первых двухсот чисел
		counter = 0;
		for(int i = 0; i < 201; i++) {
			counter *= i * i;
		}
		System.out.println("Answer is " + counter);
		
	}

}
