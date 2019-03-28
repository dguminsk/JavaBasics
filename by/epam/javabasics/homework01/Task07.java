package by.epam.javabasics.homework01;

public class Task07 {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		int c = 3;
		
		if(a > b) {
			int summa = b + c;
			System.out.print(summa); 
			//по условиям задачи сумму выводить не нужно
		}
		
		if(a == b) {
			System.out.print("Конец");
		}
		
		if(a < b) {
			System.out.print(a + b + c + " Новый год!");
		}
		
	}

}
