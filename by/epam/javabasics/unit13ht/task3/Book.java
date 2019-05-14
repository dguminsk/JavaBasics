package by.epam.javabasics.unit13ht.task3;

import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Book {
	
	private int id;
	private String name;
	private String author;
	private int cost;
	private String dateString;
	private int dateInt;
	private String dateUnformatted;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public String getDateString() {
		return dateString;
	}

	public int getDateInt() {
		return dateInt;
	}

	
	public String getDateUnformatted() {
		return dateUnformatted;
	}

	public Book(String name, String author, int cost, String date) {
		this.name = name;
		this.author = author;
		this.cost = cost;
		this.dateUnformatted = date;
		
		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(4, date.length()));
		
		Calendar calendar = new GregorianCalendar(year, month - 1, 1);
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM yyyy");
		this.dateString = dateFormat.format(calendar.getTime());
		this.dateInt = Integer.parseInt(date);
	}

}
