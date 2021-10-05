package by.epam.unit08.task01;

import java.util.ArrayList;
import java.util.List;

public class FindByCardRange {

	private List<Customer> customers;

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public FindByCardRange() {
		this.customers = new ArrayList<Customer>();
	}

	public void add(Customer customer) {
		customers.add(customer);
	}

	public Customer getCustomer(int i) {
		return customers.get(i);
	}

	public void sortCustomers() {
		customers.sort(new SorterByLastName());
	}

	public int size() {
		return customers.size();
	}

	public List<Customer> getCreditCardList(long one, long two) {
		List<Customer> cardList = new ArrayList<Customer>();

		for (Customer customer : customers) {
			if (customer.getCreditCard() > one && customer.getCreditCard() < two) {
				cardList.add(customer);
			}
		}
		return cardList;
	}
}