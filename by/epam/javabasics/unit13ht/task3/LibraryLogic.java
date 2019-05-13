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
	
	public void searchByAuthor() {
		
	}
	
	public void searchByName() {
		
	}
	
	public void sortDate() {
		
	}
	
	public void sortCost() {
		
	}

}
