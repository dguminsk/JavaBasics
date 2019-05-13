package by.epam.javabasics.unit13ht.task2;

public class Product {
	
	private int id;
	private String name;
	private int cost;
	
	public Product(int id, String name, int cost) {
		this.id = id;
		setName(name);
		setCost(cost);
	}
	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCost() {
		return cost;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
}
