package by.epam.javabasics.homework03;

import java.util.Scanner;

public class Task21_30 {

	public static void main(String[] args) {
		// 21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? 
		// Введи Д или М». В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Кто ты: мальчик или девочка? Введи Д или М > ");
		while(input.hasNext("М|Д") != true) {
			System.out.println("Введи Д или М");
			input.next();
		}
		
		String sex = input.next();
		
		if(sex.equals("М")) {
			System.out.println("Мне нравятся мальчики!");
		} else {
			System.out.println("Мне нравятся девочки!");
		}
		
		
		// 22. Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.
		int x = -1;
		int y = 7;
		int temp = x - y;
		x = x - temp;
		y = y + temp;
		System.out.println("X = " + x + " Y = " + y);
				
		
		// 23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). 
		// Если введены некорректные данные, то сообщить об этом.
		System.out.println("Введите число");
		while(input.hasNext("[1-9]|[1-2][0-9]|[3][0-1]") != true) {
			System.out.println("Число введено неверно. Введите число от 1 до 31 > ");
			input.next();
		}
		String date = "День:" + input.next();
		
		System.out.println("Введите месяц");
		while(input.hasNext("[1-9]|1[0-2]") != true) {
			System.out.println("Число введено неверно. Введите месяц от 1 до 12 > ");
			input.next();
		}
		date += " Месяц:" + input.next();
		System.out.println(date);
		
		// 24. Составить программу, определяющую результат гадания на ромашке — «любит—не любит», взяв за исходное данное количество лепестков n.
		int n = 5;
		
		if(n % 2 == 0) {
			System.out.println("К сожалению не любит");
		} else {
			System.out.println("Любит!");
		}
		
		// 25. Написать программу — модель анализа пожарного датчика в помещении, 
		// которая выводит сообщение «Пожароопасная ситуация », если температура в комнате превысила 60° С.
		double t = 60;
		
		if(t > 60) {
			System.out.println("Пожароопасная ситуация");
		}
		
		// 26. Написать программу нахождения суммы большего и меньшего из трех чисел.
		double a = 7;
		double b = 3;
		double c = 3;
		double answer = 0;
		
		// a большее
		if(a > b && a > c) {
			if(b > c) {
				answer = a + c;
			} else {
				answer = a + b;
			}
			
		// b большее	
		} else if(b > a && b > c) {
			if(a > c) {
				answer = b + c;
			} else {
				answer = b + a;
			}
		// c большее
		} else if(c > a && c > b) {
			if(a > b) {
				answer = b + c;
			} else {
				answer = c + a;
			}
		// все числа равны	
		} else {
			answer = c + a;
		}
		System.out.println("Сумма наименьшего и наибольшего = " + answer);
		
		
		// 27. Найти max{min(a, b), min(c, d)}.
		a = 3;
		b = 4;
		c = 5;
		double d = 7;
		
		System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));
		
		// 28. Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d —c).
		a = 3;
		b = 4;
		c = 5;
		d = 8;
		if(a == d) {
			System.out.println("a равно d");
		} else if(b == d) {
			System.out.println("b равно d");
		} else if(c == d) {
			System.out.println("c равно d");
		} else {
			a = d - a;
			b = d - b;
			c = d - c;
			
			System.out.println("MAX = " + Math.max(Math.max(a, b), c));
		}
		
		// 29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
		double x1 = 1;
		double y1 = 1;
		double x2 = 2;
		double y2 = 2;
		double x3 = 3;
		double y3 = 4;
		
		// Находим стороны треугольника, его периметр и площадь. Если площадь == 0, значит точки на одной прямой
		double storona1 = Math.abs(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
		double storona2 = Math.abs(Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2)));
		double storona3 = Math.abs(Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2)));
		
		double perimetr = storona1 + storona2 + storona3;
		double polperim = perimetr / 2;
		double ploshad = Math.sqrt(polperim * (polperim - storona1) * (polperim - storona2) * (polperim - storona3));
		if(ploshad == 0) {
			System.out.println("Точки расположены на одной прямой");
		} else {
			System.out.println("Точки расположены НЕ на одной прямой");
		}
		
		// 30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так.
		a = -5;
		b = -4;
		c = -3;
		if(a > b && b > c) {
			a *= 2;
			b *= 2;
			c *= 2;
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}
		System.out.println("a = " + a + " b = " + b + " c = " + c);
	}

}
