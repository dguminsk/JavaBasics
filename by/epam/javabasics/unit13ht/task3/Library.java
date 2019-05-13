package by.epam.javabasics.unit13ht.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
	
	private List<Book> library = new ArrayList<Book>();
	private String filePath;
	
	
	public void add(Book book) {
		library.add(book);
	}
	
	public Library() {
		
	}
	
	public Library(String path) throws FileNotFoundException {
		filePath = path;
		Scanner dataFile = new Scanner(new File(filePath));
		String line;
		while(dataFile.hasNextLine()) {
			line = dataFile.nextLine();
			String[] lineInfo = line.split(";");
			Book book = new Book(lineInfo[0],lineInfo[1],Integer.parseInt(lineInfo[2]),lineInfo[3]);
			add(book);
		}	
		dataFile.close();
	}

	public String getFilePath() {
		return filePath;
	}

	public List<Book> getLibrary() {
		return library;
	}

}
