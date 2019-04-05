package by.epam.javabasics.homework03;

import java.util.Scanner;

public class Task01_10 {

	public static void main(String[] args) {
		
		double a = 1;
		double b = 2;
		double c, x;

		// Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2
		// 1. вывести на экран цифру 7, в противном случае – цифру 8.
		if(a < b) {
			System.out.println("7");
		} else {
			System.out.println("8");
		}
		
		// 2. вывести на экран слово «yes», в противном случае – слово «no»
		if(a < b) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		// 3. Составить программу сравнения введенного числа а и цифры 3. 
		//Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Введите число > ");
		while(input.hasNextDouble() == false) {
			System.out.println("Введите число > ");
			input.next();
		}
		
		c = input.nextDouble();
		
		if(c < a + b) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		// 4. Составить программу: равны ли два числа а и b?
		if(a == b) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		// 5. Составить программу: определения наименьшего из двух чисел а и b.
		if(a < b) {
			System.out.println("a меньшее число");
		} else if(a > b) {
			System.out.println("b меньшее");
		} else {
			System.out.println("a и b равны");
		}
		
		// 6. Составить программу: определения наибольшего из двух чисел а и b.
		if(a < b) {
			System.out.println("b большее число");
		} else if(a > b) {
			System.out.println("a большее число");
		} else {
			System.out.println("a и b равны");
		}
		
		// 7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х 
		c = 10;
		x = 3;
		double answer = Math.abs(a * x * x + b * x + c);
		System.out.println(answer);
		
		// 8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.
		if(a * a < b * b) {
			System.out.println("квадрат a меньшее квадрата b");
		} else if(a * a > b * b) {
			System.out.println("квадрат b меньшее квадрата a");
		} else {
			System.out.println("квадраты a и b равны");
		}
		
		// 9. Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним.
		double storona1 = 3;
		double storona2 = 3;
		double storona3 = 3;
	
		if(storona1 == storona2 && storona1 == storona3) {
			System.out.println("Треугольник равносторонний");
		} else {
			System.out.println("Треугольник не равносторонний");
		}
		
		// 10. Составить программу, которая определит площадь какого круга меньше.
		double S1 = 10;
		double S2 = 20;
		if(S1 < S2) {
			System.out.println("Площадь первого круга меньше");
		} else if(S1 > S2) {
			System.out.println("Площадь второго круга меньше");
		} else {
			System.out.println("Площади кругов равны");
		}
		
	}

}
