package by.epam.javabasics.unit13ht.task3;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) throws FileNotFoundException{
		
		Library lib = new Library("data.txt");
		LibraryLogic libLogic = new LibraryLogic();
		Library searchResult;
		
		System.out.println("Добро пожаловать в библиотеку!");
		System.out.println("Введите команду (справка: help или ?) > ");
		
		Scanner input = new Scanner(System.in);
		//input.useDelimiter("");
		
		while(input.hasNext()) {
			// help
			String command = input.next();
			
			if(command.equals("help") || command.equals("?")) {
				
				System.out.println("Доступные команды:");
				System.out.println("help или ?: высов текущей справки по командам");
				System.out.println("print: отобразить все книги коллекции");
				System.out.println("add: добавить книгу в коллекцию");
				System.out.println("delete: удалить книгу из коллекции");
				System.out.println("sort: сортировка коллекции");
				System.out.println("find: поиск книги");
				
			} else if (command.equals("print")) {
				
				libLogic.printAllBooks(lib);
				
			} else if (command.equals("add")) {
				
				libLogic.addBook(lib, input);
				
			} else if (command.equals("find")) {
				
				searchResult = libLogic.search(lib, input);
				if(searchResult != null) {
					
					System.out.println("");
					System.out.println("Желаете отсортировать результаты поиска?");
					System.out.print("Y или N > ");
					while(input.hasNext("Y|N") != true) {
						System.out.print("Y или N > ");
						input.next();
					}
					if(input.next().equals("Y")) {
						libLogic.sort(searchResult, input);
					}
				}
				
				
			} else if (command.equals("delete")) {
				
				libLogic.deleteBook(lib, input);
				
			} else if (command.equals("sort")) {
				
				libLogic.sort(lib, input);
				
			} else {
				
				System.out.println("недоступная команда");
				
			}
			
			System.out.println("");
			System.out.println("Введите команду (справка: help или ?) > ");
			
		}
		

	}

}
