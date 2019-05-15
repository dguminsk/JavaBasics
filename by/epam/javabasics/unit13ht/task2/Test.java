package by.epam.javabasics.unit13ht.task2;

public class Test {
	
	
	public static void main(String args[]) {
		
		Payment payment = new Payment(123);
		
		Product product1 = new Product(1, "Машина", 1000);
		Product product2 = new Product(2, "Самолет", 3010);
		Product product3 = new Product(3, "Самокат", 54);
		Product product4 = new Product(4, "Компьютер", 386);
		
		payment.addToPayment(product1);
		payment.addToPayment(product1);
		payment.addToPayment(product2);
		payment.addToPayment(product3);
		payment.addToPayment(product4);
		
		payment.makePayment(450);
		payment.makePayment(50);
		
	}

}
