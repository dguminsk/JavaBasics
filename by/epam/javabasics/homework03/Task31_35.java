package by.epam.javabasics.homework03;

import java.util.Scanner;

public class Task31_35 {

	public static void main(String[] args) {
		
		// 31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
		double A = 4;
		double B = 5;
		double x = 3;
		double y = 9;
		double z = 8;
		
		// проверяем плоскость x, z
		if((x <= A && z <= B)||(x <= B && z <= A)) {
			System.out.println("Кирпич проходит");
		// проверяем плоскость x, y	
		} else if((x <= A && y <= B)||(x <= B && y <= A)) {
			System.out.println("Кирпич проходит");
		// проверяем плоскость z, y	
		} else if((z <= A && y <= B)||(z <= B && y <= A)) {
			System.out.println("Кирпич проходит");
		} else {
			System.out.println("Кирпич не проходит");
		}
		
		// 32. Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них положительной.
		double a = -1;
		double b = -4;
		double c = 1;
		
		if(a + b > 0 || a + c > 0 || b + c > 0) {
			System.out.println("Является");
		} else {
			System.out.println("Не вляется");
		}
		
		// 33. Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации в базе данных. 
		// Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа. 
		// Они имеют следующие пароли: 9583, 1747 — доступны модули баз А, В, С; 
		// 3331, 7922 — доступны модули баз В, С; 9455, 8997 — доступен модуль базы С.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Введите числовой пароль > ");
		while(input.hasNextInt() != true) {
			System.out.print("Введите числовой пароль > ");
			input.next();
		}
		
		int password = input.nextInt();
		
		if(password == 9583 || password == 1747) {
			System.out.println("доступны модули баз А, В, С");
		} else if(password == 3331 || password == 7922) {
			System.out.println("доступны модули баз В, С");
		} else if(password == 9455 || password == 8997) {
			System.out.println("доступен модуль базы С");
		} else {
			System.out.println("У вас нет доступа к базе");
		}

		// 34. Составить программу, реализующую эпизод применения компьютера в книжном магазине. 
		// Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем; 
		// если сдачи не требуется, печатает на экране «спасибо»; 
		// если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; 
		// если денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
		int price = 123;
		int money = 34;
		int raznitsa = money - price;
		
		if(raznitsa == 0) {
			System.out.println("спасибо");
		} else if(raznitsa < 0) {
			System.out.println("Денег недостаточно, необходимо доплатить: " + Math.abs(raznitsa) + " рублей");
		} else {
			System.out.println("Спасибо, ваша сдача: " + raznitsa + " рублей");
		}
				
		// 35. Вычислить число и месяц в невисокосном году по номеру дня.
		int nomer = 31;
		int month = 1;
		
		if(nomer > 31) {
			nomer -= 31;
			month = 2;
		}
		
		if(nomer > 28 && month == 2) {
			nomer -= 28;
			month = 3;
		}
		
		if(nomer > 31 && month == 3) {
			nomer -= 31;
			month = 4;
		}
		
		if(nomer > 30 && month == 4) {
			nomer -= 30;
			month = 5;
		}
		
		if(nomer > 31 && month == 5) {
			nomer -= 31;
			month = 6;
		}
		
		if(nomer > 30 && month == 6) {
			nomer -= 30;
			month = 7;
		}
		
		if(nomer > 31 && month == 7) {
			nomer -= 31;
			month = 8;
		}
		
		if(nomer > 31 && month == 8) {
			nomer -= 31;
			month = 9;
		}
		
		if(nomer > 30 && month == 9) {
			nomer -= 30;
			month = 10;
		}
		
		if(nomer > 31 && month == 10) {
			nomer -= 31;
			month = 11;
		}
		
		if(nomer > 30 && month == 11) {
			nomer -= 30;
			month = 12;
			System.out.println("Число: " + nomer + " Месяц: " + month);
		} else {
			System.out.println("Число: " + nomer + " Месяц: " + month);
		}
	 
	}

}
