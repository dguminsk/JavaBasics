package by.epam.javabasics.unit13ht.task2;

public class Payment {
	
	int id;
	boolean isPaid = false;
	int totalCost = 0;
	int totalPaid = 0;
	Product items[] = new Product[5];
	int itemsAmount = 0;
	
	public Payment(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public int getTotalCost() {
		return totalCost;
	}

	public Product[] getItems() {
		return items;
	}

	public int getItemsAmount() {
		return itemsAmount;
	}

	public void addToPayment(Product item) {
		if(isPaid) {
			System.out.println("Заказ уже оплачен");
		} else if(itemsAmount == 5) {
			System.out.println("Корзина заполнена. Оплатите заказ");
		} else {
			items[itemsAmount] = item;
			System.out.println("Товар успешно добавлен");
			totalCost += item.getCost();
			itemsAmount++;
		}
	}
	
	public void makePayment(int money) {
		if(money < totalCost) {
			totalCost = totalCost - money;
			System.out.println("Недостаточно средств, осталось доплатить: " + totalCost);
		} else {	
			if(money > totalCost) {
				int ostatok = money - totalCost;
				System.out.println("Заказ успешно оплачен. Вам возвращены средства в размере " + ostatok);
			}
			isPaid = true;
			printBill();
		}
	}
	
	public void printBill() {
		System.out.println("------------------------");
		System.out.println("Заказ # " + id);
		System.out.println("Товары:");
		
		if(itemsAmount > 0) {
			for(int i = 0; i < itemsAmount; i++) {
				System.out.println(items[i].getName() + " Цена: " + items[i].getCost());
			}
			System.out.println("Итоговая цена: " + totalCost);
		} else {
			System.out.println("У вас нет добавленных товаров");
		}
		System.out.println("------------------------");
		if(!isPaid) {
			System.out.println("Заказ не оплачен, осталось доплатить: " + totalCost);
		} else {
			System.out.println("Заказ оплачен");
		}
	}

}
