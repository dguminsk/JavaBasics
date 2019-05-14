package by.epam.javabasics.finalTask.logic;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import by.epam.javabasics.finalTask.entity.Book;
import by.epam.javabasics.finalTask.entity.Library;

public class LibraryLogic {
	

	public void addBook(Library obj, Scanner input) {
		System.out.println("Добавление новой книги в коллекцию:");
		System.out.println("Введите название книги >");
		input.nextLine();
		String name = input.nextLine();
		
		System.out.println("Введите автора >");
		String author = input.nextLine();
		
		System.out.println("Введите дату выхода книги в формате YYYYMM > ");
		while(input.hasNext("[0-9][0-9][0-9][0-9][0-9][0-9]") != true) {
			System.out.print("Вы ввели неверный формат!");
			System.out.print("Пример верного ввода: 198903 - Март 1989 года, 098701 - Январь 987 года");
			System.out.print("Введите дату выхода книги в формате YYYYMM > ");
			input.next();
		}
		String date = input.next();
		
		System.out.println("Введите стоимость > ");
		while(!input.hasNextInt()) {
			System.out.print("Стоимость должна быть числом > ");
			System.out.println("Введите стоимость > ");
			input.next();
		}
		int cost = input.nextInt();
		
		Book book = new Book(name, author, cost, date);
		obj.add(book);
		
		try(FileWriter writer = new FileWriter(obj.getFilePath(), true))
        {
		 	writer.append('\n');
            String text = name + ";" + author + ";" + cost + ";" + date;
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        } 
		
	}
	
	public void printAllBooks(Library obj) {
		if(obj.getLibrary().size() == 0) {
			System.out.println("Коллекция пуста");
			return;
		}
		
		for(int i = 0; i < obj.getLibrary().size(); i++) {
			/*System.out.println("------------");
			System.out.println("Порядковый номер: " + (i + 1));
			System.out.println(obj.getLibrary().get(i).author + " - " + obj.getLibrary().get(i).name);
			System.out.println("Цена: " + obj.getLibrary().get(i).cost);
			System.out.println("Дата выхода: " + obj.getLibrary().get(i).dateString);*/
			System.out.println("-----------------------------");
			System.out.print("№" + (i + 1) + ": ");
			System.out.print(obj.getLibrary().get(i).getAuthor() + " - \"" + obj.getLibrary().get(i).getName() + "\"");
			System.out.print(". Цена:" + obj.getLibrary().get(i).getCost());
			System.out.println(". Дата выхода: " + obj.getLibrary().get(i).getDateString());
			
		}
		System.out.println("-----------------------------");
		System.out.println("");
	}
	
	public void deleteBook(Library obj, Scanner input) {
		
		System.out.println("Удаление книги из коллекции:");
		printAllBooks(obj);
		System.out.println("Введите порядковый номер книги, которую желаете удалить > ");
		while(!input.hasNextInt()) {
			System.out.println("Введите порядковый номер книги, которую желаете удалить > ");
		}
		int number = input.nextInt();
		if(number > obj.getLibrary().size() || number < 0) {
			System.out.println("Книги с таким номером не существует");
		} else {
			obj.getLibrary().remove(number - 1);
			
			try(FileWriter writer = new FileWriter(obj.getFilePath(), false))
	        {
			 	for(int i = 0; i < obj.getLibrary().size(); i++) {
			 		String name = obj.getLibrary().get(i).getName();
			 		String author = obj.getLibrary().get(i).getAuthor();
			 		int cost = obj.getLibrary().get(i).getCost();
			 		String date = obj.getLibrary().get(i).getDateUnformatted();
			 		String text = name + ";" + author + ";" + cost + ";" + date;
			 		writer.write(text);
			 		if(i + 1 != obj.getLibrary().size()) {
			 			writer.append('\n');
			 		}
			 	}
			 	writer.flush();
	        }
	        catch(IOException ex){
	            System.out.println(ex.getMessage());
	        } 
			
			System.out.println("Книгa успешно удалена из коллекции");
		}
	}
	
	
	public Library search(Library obj, Scanner input) {
		
		System.out.println("Выполнить поиск по 1.названию 2.автору");
		System.out.print("Введите 1 или 2 > ");
		while(input.hasNext("1|2") != true) {
			System.out.print("Введите 1 или 2 > ");
			input.next();
		}
		
		Library searchResult = new Library();
		
		if(input.nextInt() == 1) {
			System.out.print("Поиск по названию. Введите название книги > ");
			String searchString = input.next();
			System.out.println(searchString);
			for(int i = 0; i < obj.getLibrary().size(); i++) {
				if(obj.getLibrary().get(i).getName().equals(searchString)) {
					searchResult.add(obj.getLibrary().get(i));
				}
			}
		} else {
			System.out.print("Поиск по автору. Введите имя автора > ");
			String searchString = input.next();
			
			for(int i = 0; i < obj.getLibrary().size(); i++) {
				if(obj.getLibrary().get(i).getAuthor().equals(searchString)) {
					searchResult.add(obj.getLibrary().get(i));
				}
			}
		}
		
		if(searchResult.getLibrary().size() == 0) {
			System.out.println("Ничего не найдено");
			return null;
		}
		
		System.out.println("Результаты поиска:");
		printAllBooks(searchResult);
		return searchResult;
		
		
	}
	
	public void sort(Library obj, Scanner input) {
		System.out.println("Выполнить сортировку по:");
		System.out.println("1: Возрастанию цены");
		System.out.println("2: Убыванию цены");
		System.out.println("3: Дате выхода начиная со старых");
		System.out.println("4: Дате выхода начиная с новых");
		System.out.print("Сделайте выбор > ");
		
		while(input.hasNext("1|2|3|4") != true) {
			System.out.print("Неверный выбор, доступные варианты 1,2,3,4");
			System.out.print("Сделайте выбор > ");
			input.next();
		}
		
		switch(input.nextInt()) {
		
			case 1: System.out.println("Результат поиска с сортировкой по возрастанию цены:");
			sortCost(obj, true);
			break;
			
			case 2: System.out.println("Результат поиска с сортировкой по убыванию цены:");
			sortCost(obj, false);
			break;
			
			case 3: System.out.println("Результат поиска с сортировкой по дате выхода, начиная со старых:");
			sortDate(obj, true);
			break;
			
			case 4: System.out.println("Результат поиска с сортировкой по дате выхода, начиная с новых:");
			sortDate(obj, false);
			break;
			
		}

	}
	
	public void sortCost(Library obj, boolean asc) {
		
		Book tempBook;

		boolean isSorted = false;
		
		if(asc) {
			
			while(!isSorted) {
				for(int i = 1; i < obj.getLibrary().size(); i++) {
					isSorted = true;
					if(obj.getLibrary().get(i).getCost() < obj.getLibrary().get(i - 1).getCost()) {
						isSorted = false;
						tempBook = obj.getLibrary().get(i - 1);
						obj.getLibrary().set(i - 1, obj.getLibrary().get(i));
						obj.getLibrary().set(i, tempBook);
						break;
					}
				}
			}
			
		} else {
			
			while(!isSorted) {
				for(int i = 1; i < obj.getLibrary().size(); i++) {
					isSorted = true;
					if(obj.getLibrary().get(i).getCost() > obj.getLibrary().get(i - 1).getCost()) {
						isSorted = false;
						tempBook = obj.getLibrary().get(i - 1);
						obj.getLibrary().set(i - 1, obj.getLibrary().get(i));
						obj.getLibrary().set(i, tempBook);
						break;
					}
				}
			}
		}
		printAllBooks(obj);
	}
	
	public void sortDate(Library obj, boolean asc) {
		Book tempBook;

		boolean isSorted = false;
		if(asc) {
			while(!isSorted) {
				for(int i = 1; i < obj.getLibrary().size(); i++) {
					isSorted = true;
					if(obj.getLibrary().get(i).getDateInt() < obj.getLibrary().get(i - 1).getDateInt()) {
						isSorted = false;
						tempBook = obj.getLibrary().get(i - 1);
						obj.getLibrary().set(i - 1, obj.getLibrary().get(i));
						obj.getLibrary().set(i, tempBook);
						break;
					}
				}
			}
		} else {
			while(!isSorted) {
				for(int i = 1; i < obj.getLibrary().size(); i++) {
					isSorted = true;
					if(obj.getLibrary().get(i).getDateInt() > obj.getLibrary().get(i - 1).getDateInt()) {
						isSorted = false;
						tempBook = obj.getLibrary().get(i - 1);
						obj.getLibrary().set(i - 1, obj.getLibrary().get(i));
						obj.getLibrary().set(i, tempBook);
						break;
					}
				}
			}
		}
		printAllBooks(obj);
	}

}
