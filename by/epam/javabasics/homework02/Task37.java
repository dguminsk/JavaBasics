package by.epam.javabasics.homework02;
import java.util.Scanner;

public class Task37 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int var, first, second, third;
		// Целое число N является четным двузначным числом.
		System.out.print("Целое число N является четным двузначным числом. Введите N > ");
		if(input.hasNextInt()) {
			var = input.nextInt();
			if(var / 100 == 0 && var > 0 && var / 10 != 0) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else {
			System.out.println(false);
		}

		//Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
		System.out.print("Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр. Введите 4х значное число > ");
		if(input.hasNextInt()) {
			var = input.nextInt();
			
			first = var / 1000 + var / 100 % 10;
			second = var % 100 / 10 + var % 100 % 10;
			
			if(first == second) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else {
			System.out.println(false);
		}
		
		// Сумма цифр данного трехзначного числа N является четным числом. 
		System.out.print("Сумма цифр данного трехзначного числа N является четным числом. Введите N > ");
		if(input.hasNextInt()) {
			var = input.nextInt();
			first = var / 100;
			second = var / 10 % 10;
			third = var % 10;
					
			if((first + second + third) % 2 == 0) {
				System.out.println(true);
			} else {
					System.out.println(false);
			}
		} else {
			System.out.println(false);
		}
		
		//TODO: Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= m, х= n (m<n).
		//TODO: Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
		//TODO: Треугольник со сторонами а,b,с является равнобедренным.
		//TODO: Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
		//TODO: Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).
		//TODO: График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, n). 
		
		

	}

}
