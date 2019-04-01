package by.epam.javabasics.homework02;
import java.util.Scanner;

public class Task37 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int var, first, second, third, temp, counter;
		double x, y, m, n, a, b, c;
		
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
		
		// Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= m, x= n (m<n). 
		System.out.println("Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= m, x= n (m<n). Введите x > ");
		
		System.out.print("Введите x > ");
		while(input.hasNextDouble() == false) {
			System.out.println("Enter double value > ");
			input.next();
		} 
		x = input.nextDouble();
		
		System.out.print("Введите y > ");
		while(input.hasNextDouble() == false) {
			System.out.println("Enter double value > ");
			input.next();
		} 
		y = input.nextDouble();
		
		System.out.print("Введите m > ");
		while(input.hasNextDouble() == false) {
			System.out.println("Enter double value > ");
			input.next();
		} 
		m = input.nextDouble();
		
		System.out.print("Введите n > ");
		while(input.hasNextDouble() == false) {
			System.out.println("Enter double value > ");
			input.next();
		} 
		n = input.nextDouble();

		if(m < n != true) {
			System.out.println("Некорректный ввод");
			System.out.println(false);
		} else {
			if(x >= m && x <= n) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}		

		// Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
		System.out.print("Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа. Введите трехзначное число> ");
		while(input.hasNextInt() == false) {
			System.out.println("Enter int value > ");
			input.next();
		} 
		var = input.nextInt();
		if(var / 1000 == 0 && var / 100 != 0) {
			temp = var * var;
			first = var / 100;
			second = var % 100 / 10;
			third = var % 100 % 10;
			if(temp == Math.pow(first + second + third, 3)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else {
			System.out.println(false);
		}
		
		// Треугольник со сторонами а,b,с является равнобедренным.
		System.out.println("Треугольник со сторонами а,b,с является равнобедренным.");
		System.out.print("Введите a > ");
		while(input.hasNextDouble() == false) {
			System.out.println("Enter double value > ");
			input.next();
		} 
		a = input.nextDouble();
		
		System.out.print("Введите b > ");
		while(input.hasNextDouble() == false) {
			System.out.println("Enter double value > ");
			input.next();
		} 
		b = input.nextDouble();
		
		System.out.print("Введите c > ");
		while(input.hasNextDouble() == false) {
			System.out.println("Enter double value > ");
			input.next();
		} 
		c = input.nextDouble();
		
		if(a == b || b == c || c == a) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		// Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
		System.out.println("Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.");
		System.out.print("Введите N > ");
		while(input.hasNextInt() == false) {
			System.out.println("Enter int value > ");
			input.next();
		} 
		var = input.nextInt();
		
		if(var / 1000 == 0 && var / 100 != 0) {
			first = var / 100;
			second = var % 100 / 10;
			third = var % 100 % 10;
			if(first + second == third || second + third == first || first + third == second){
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else {
			System.out.println(false);
		}
		
		// Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).
		System.out.println("Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4");
		System.out.print("Введите N > ");
		while(input.hasNextInt() == false) {
			System.out.println("Enter int value > ");
			input.next();
		} 
		temp = input.nextInt();
		
		System.out.print("Введите a > ");
		while(input.hasNextInt() == false) {
			System.out.println("Enter int value > ");
			input.next();
		} 
		var = input.nextInt();
		
		counter = 0;
		while(counter < 5) {
			if(var == Math.pow(temp, counter)) {
				System.out.println(true);
				break;
			} else {
				if(counter == 4) {
					System.out.println(false);
					break;
				} else {
					counter++;
				}
			}
		
		}
		
		// График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, n). 

		System.out.println("График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, n)");
		System.out.print("Введите a > ");
		while(input.hasNextDouble() == false) {
			System.out.println("Enter double value > ");
			input.next();
		} 
		a = input.nextDouble();
		
		System.out.print("Введите b > ");
		while(input.hasNextDouble() == false) {
			System.out.println("Enter double value > ");
			input.next();
		} 
		b = input.nextDouble();
		
		System.out.print("Введите c > ");
		while(input.hasNextDouble() == false) {
			System.out.println("Enter double value > ");
			input.next();
		} 
		c = input.nextDouble();
		
		System.out.print("Введите m > ");
		while(input.hasNextDouble() == false) {
			System.out.println("Enter double value > ");
			input.next();
		} 
		m = input.nextDouble();
		
		System.out.print("Введите n > ");
		while(input.hasNextDouble() == false) {
			System.out.println("Enter double value > ");
			input.next();
		} 
		n = input.nextDouble();
		
		if(n == a * n * n + b * n + c) {
			System.out.print(true);
		} else {
			System.out.print(false);
		}
		
	}

}
