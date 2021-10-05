package by.epam.unit08.task01;

public class Task01 {

/*
Найти и вывести (критерии выбора):
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
*/

	public static void main(String[] args) {
		FindByCardRange conveyor = new FindByCardRange();
		conveyor.add(new Customer(1, "Тедеско", "Доминико", "-", "Германия", 4316933930365120L, 5919649430114598L));
		conveyor.add(new Customer(2, "Каррера", "Массимо", "-", "Италия", 4902450464742830L, 5288462737839468L));
		conveyor.add(new Customer(3, "Эмери", "Унаи", "-", "Испания", 4412213318840900L, 5008762955586140L));
		conveyor.add(new Customer(4, "Карпин", "Валерий", "Георгиевич", "Россия", 5319140807218861L, 4722688904129534L));
		conveyor.add(new Customer(5, "Романцев", "Олег", "Иванович", "Россия", 5269810939908726L, 4750843412799584L));

		System.out.println("-= Сортировка покупателей по фамилии =-");
		conveyor.sortCustomers();
		
		for (int i = 0; i < conveyor.size(); i++) {
			System.out.println(conveyor.getCustomer(i).toString());
		}

		System.out.println("-= Список покупателей по выбранному диапазону карт =-");
		System.out.println(conveyor.getCreditCardList(4902400000000000L, 5319100000000000L).toString());
	}
}