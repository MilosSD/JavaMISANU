package zadatak5;

import java.util.ArrayList;
import java.util.List;

public class dinamickiNiz {

	public static void main(String[] args) {

		List<String> a = new ArrayList<String>();

		a.add("Ana");
		a.add("Aleksandra");
		a.add("Aleksandar");
		a.add("Mika");
		a.add("Zika");
		a.add("Pera");
		a.add("Laza");
		a.add("Rajko");
		a.add("Milos");
		a.add("Nenad");

		System.out.println("Dinamicki niz a: " + a);

		a.add(4, "Milisav");
		System.out.println("Posle promene: " + a);

		a.remove(2);
		System.out.println("Posle brisanja: " + a);

	}

}
