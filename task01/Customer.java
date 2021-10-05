package by.epam.unit08.task01;

public class Customer {
	private int id;
	private String lastname;
	private String firstname;
	private String patronymic;
	private String citizenship;
	private long card;
	private long account;

	public Customer(int i, String l, String f, String p, String a, long c, long b) {
		id = i;
		lastname = l;
		firstname = f;
		patronymic = p;
		citizenship = a;
		card = c;
		account = b;
	}

	public String toString() {
		return "\n{ id: " + id + " | Фамилия: " + lastname + " | Имя: " + firstname + " | Отчество: " + patronymic
				+ " | Гражданство: " + citizenship + " | Номер карты: " + card + " | Номер договора: " + account + " }\n";
	}

	public int getId() {
		return id;
	}

	public void setLastname(String l) {
		lastname = l;
	}

	public String getLastname() {
		return lastname;
	}

	public void setFirstname(String f) {
		firstname = f;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setPatronymic(String p) {
		patronymic = p;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setAddress(String a) {
		citizenship = a;
	}

	public String getAddress() {
		return citizenship;
	}

	public void setCreditCard(long c) {
		card = c;
	}

	public long getCreditCard() {
		return card;
	}

	public void setBankAccount(long b) {
		account = b;
	}

	public long getBankAccount() {
		return account;
	}
}