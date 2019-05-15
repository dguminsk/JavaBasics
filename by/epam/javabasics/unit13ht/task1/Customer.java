package by.epam.javabasics.unit13ht.task1;

public class Customer {
	
	private int id;
	private String name;
	private String lastName;
	private String surname;
	private int cardNumber;
	private int billingNumber;
	
	public Customer(int id, String lastName, String name, String surname, int cardNumber, int billingNumber) {
		this.id = id;
		setLastName(lastName);
		setName(name);
		setSurname(surname);
		setCardNumber(cardNumber);
		setBillingNumber(billingNumber);

	}
	
	public Customer(int id, String lastName, String name, String surname) {
		this.id = id;
		setLastName(lastName);
		setName(name);
		setSurname(surname);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + billingNumber;
		result = prime * result + cardNumber;
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (billingNumber != other.billingNumber)
			return false;
		if (cardNumber != other.cardNumber)
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
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
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public int getBillingNumber() {
		return billingNumber;
	}
	
	public void setBillingNumber(int billingNumber) {
		this.billingNumber = billingNumber;
	}

}
