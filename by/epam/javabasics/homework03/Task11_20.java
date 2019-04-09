package by.epam.javabasics.homework03;

public class Task11_20 {

	public static void main(String[] args) {
		// 11. Составить программу, которая определит площадь какого треугольника больше.
		double S1 = 3;
		double S2 = 4;
		
		if(S1 < S2) {
			System.out.println("Площадь второго треугольника больше");
		} else if(S1 > S2) {
			System.out.println("Площадь первого треугольника больше");
		} else {
			System.out.println("Треугольники равны");
		}
		
		// 12. Даны три действительных числа. 
		// Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.
		double a = 1;
		double b = -3;
		double c = -1;
		if(a < 0) {
			System.out.println(Math.pow(a, 4));
		} else {
			System.out.println(Math.pow(a, 2));
		}
		if(b < 0) {
			System.out.println(Math.pow(b, 4));
		} else {
			System.out.println(Math.pow(b, 2));
		}
		if(c < 0) {
			System.out.println(Math.pow(c, 4));
		} else {
			System.out.println(Math.pow(c, 2));
		}
		
		// 13. Даны две точки А(х1, у1) и В(х2, у2). 
		// Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.
		int x1 = 1;
		int y1 = 5;
		int x2 = -4;
		int y2 = 10;
		
		//Найдем расстояние от одной точки до начала координат и от второй соответственно
		double rasst1 = Math.sqrt(x1 * x1 + y1 * y1);
		double rasst2 = Math.sqrt(x2 * x2 + y2 * y2);
		
		if(rasst1 < rasst2) {
			System.out.println("Первая точка ближе к началу координат");
		} else if(rasst1 > rasst2) {
			System.out.println("Вторая точка ближе к началу координат");
		} else {
			System.out.println("Точки на одинаковом расстоянии");
		}
		
		// 14. Даны два угла треугольника (в градусах). 
		// Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
		double ugol1 = 34;
		double ugol2 = 45;
		double ugol3 = 180 - ugol1 - ugol2;
		
		if(ugol3 > 0) {
			if(ugol1 == 90 || ugol2 == 90 || ugol3 == 90) {
				System.out.println("Треугольник существует и он прямоугольный");
			} else {
				System.out.println("Треугольник существует и он не прямоугольный");
			}
		} else {
			System.out.println("Треугольник не существует");
		}
		
		// 15. Даны действительные числа х и у, не равные друг другу. 
		// Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.
		double x = 5;
		double y = -4;
		
		if(x < y) {
			x = (x + y) / 2;
			y = x * y * 2;
		} else {
			y = (x + y) / 2;
			x = x * y * 2;
		}
		
		System.out.println("x = " + x + " y = " + y);
		
		// 16. На плоскости ХОY задана своими координатами точка А. 
		// Указать, где она расположена (на какой оси или в каком координатном угле).
		double Ax = 0;
		double Ay = 7;
		
		if(Ax == 0 && Ay == 0) {
			System.out.println("Точка лежит в начале координат");
		}
		if(Ax == 0 && Ay != 0) {
			System.out.println("Точка лежит на оси Y");
		}
		if(Ax != 0 && Ay == 0) {
			System.out.println("Точка лежит на оси X");
		}
		if(Ax > 0 && Ay > 0) {
			System.out.println("Точка лежит в I координатном угле");
		}
		if(Ax > 0 && Ay < 0) {
			System.out.println("Точка лежит во II координатном угле");
		}
		if(Ax < 0 && Ay < 0) {
			System.out.println("Точка лежит в III координатном угле");
		}
		if(Ax < 0 && Ay > 0) {
			System.out.println("Точка лежит в IV координатном угле");
		}
		
		
		// 17. Даны целые числа m, n. Если числа не равны, то заменить каждое из них одним и тем же числом, 
		// равным большему из исходных, а если равны, то заменить числа нулями.
		int m = -4;
		int n = -4;
		
		if(m != n) {
			if(m > n) {
				n = m;
			} else {
				m = n;
			}
		} else {
			m = 0;
			n = 0;			
		}
		System.out.println("m = " + m + " n = " + n);
		
		// 18. Подсчитать количество отрицательных среди чисел а, b, с.
		a = 1;
		b = -4;
		c = -3;
		int counter = 0;
		if(a < 0) {
			counter++;
		}
		if(b < 0) {
			counter++;
		}
		if(c < 0) {
			counter++;
		}
		System.out.println("Количество отрицательных чисел = " + counter);
		
		// 19. Подсчитать количество положительных среди чисел а, b, с.
		a = 0;
		b = -4;
		c = -3;
		counter = 0;
		if(a >= 0) {
			counter++;
		}
		if(b >= 0) {
			counter++;
		}
		if(c >= 0) {
			counter++;
		}
		System.out.println("Количество положительных чисел = " + counter);
		
		// 20. Определить, делителем каких чисел а, b, с является число k.
		a = 2;
		b = 5;
		c = 4;
		String answer = "";
		double k = 2;
		
		if(a % k == 0) {
			answer += "a = " + a;
		}
		if(b % k == 0) {
			if(answer.length() != 0) {
				answer += ", b = " + b;
			} else {
				answer += "b = " + b;
			}
		}
		if(c % k == 0) {
			if(answer.length() != 0) {
				answer += ", c = " + c;
			} else {
				answer += "c = " + c;
			}
		}
		System.out.println("Число k = " + k + " является делителем: " + answer);
	}

}
