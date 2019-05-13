package by.epam.javabasics.unit13ht.task3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LibraryLogic {
	

	public void addBook(Library obj, Scanner input) {
		System.out.println("Добавление новой книги в коллекцию:");
		System.out.println("Введите название книги >");
		String name = input.nextLine();
		
		System.out.println("Введите автора >");
		String author = input.nextLine();
		
		System.out.println("Введите дату выхода книги в формате >");
		String date = input.nextLine();
		
		System.out.println("Введите стоимость >");
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
			System.out.println("------------");
			System.out.println("Порядковый номер: " + (i + 1));
			System.out.println(obj.getLibrary().get(i).author + " - " + obj.getLibrary().get(i).name);
			System.out.println("Цена: " + obj.getLibrary().get(i).cost);
			System.out.println("Дата выхода: " + obj.getLibrary().get(i).date);
		}
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
			System.out.println("Книгa успешно удалена");
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
				if(obj.getLibrary().get(i).name.equals(searchString)) {
					searchResult.add(obj.getLibrary().get(i));
				}
			}
		} else {
			System.out.print("Поиск по автору. Введите имя автора > ");
			String searchString = input.next();
			
			for(int i = 0; i < obj.getLibrary().size(); i++) {
				if(obj.getLibrary().get(i).author.equals(searchString)) {
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
		System.out.println("Выполнить сортировку по 1.цене 2.дате выхода");
		System.out.print("Введите 1 или 2 > ");
		while(input.hasNext("1|2") != true) {
			System.out.print("Введите 1 или 2 > ");
			input.next();
		}
		
		if(input.nextInt() == 1) {
			System.out.print("Результат поиска с сортировкой по цене:");
			sortCost(obj);
		} else {
			System.out.print("Результат поиска с сортировкой по дате выхода:");
			sortDate(obj);
		}

	}
	
	public void sortDate(Library obj) {
		
	}
	
	public void sortCost(Library obj) {
		Book tempBook;

		boolean isSorted = false;
		while(!isSorted) {
			for(int i = 1; i < obj.getLibrary().size(); i++) {
				isSorted = true;
				if(obj.getLibrary().get(i).cost < obj.getLibrary().get(i - 1).cost) {
					isSorted = false;
					tempBook = obj.getLibrary().get(i - 1);
					obj.getLibrary().set(i - 1, obj.getLibrary().get(i));
					obj.getLibrary().set(i, tempBook);
					break;
				}
			}
		}
		printAllBooks(obj);
	}

}
