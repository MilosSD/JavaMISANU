package Zadatak3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		StambenaZgrada sz1 = new StambenaZgrada(150, 4, 4, 16, 55.6);
		StambenaZgrada sz2 = new StambenaZgrada(120, 5, 4, 20, 50);
		StambenaZgrada sz3 = new StambenaZgrada(100, 6, 4, 24, 51.1);
		StambenaZgrada sz4 = new StambenaZgrada(200, 4, 4, 16, 60.5);

		Ulica u1 = new Ulica(10, "Vlajkovićeva", 250.0);
		Ulica u2 = new Ulica(10, "Palmotićeva", 150.0);

		u1.dodajZgradu(1, sz1);
		u1.dodajZgradu(2, sz2);

		u2.dodajZgradu(1, sz3);
		u2.dodajZgradu(2, sz4);

		List<Ulica> naselje = new ArrayList<Ulica>();
		naselje.add(u1);
		naselje.add(u2);

		System.out.println("Naselje: ");
		for (Ulica u : naselje) {
			System.out.println(u.opisUlice());
		}

	}

}
