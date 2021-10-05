package by.epam.unit08.task01;

import java.util.Comparator;

public class SorterByLastName implements Comparator<Customer> {

	public int compare(Customer a, Customer b) {
		return a.getLastname().compareTo(b.getLastname());
	}
}