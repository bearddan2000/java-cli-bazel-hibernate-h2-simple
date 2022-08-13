package example;

import example.model.Dog;

public class Main {

	public static void main(String[] args) {
		org.hibernate.Session session = HibernateUtils.getSessionFactory().openSession();

		Dog tbl = new Dog(session);

		try {
			tbl.insert("Am Bulldog", "White");
			tbl.insert("Blue Tick", "Grey");
			tbl.insert("Labrador", "Black");
			tbl.insert("Gr Shepard", "Brown");
		} catch (Exception e) {}

		tbl.selectAll();

		HibernateUtils.shutdown();
	}
}
