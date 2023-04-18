package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// interfejs <T> ime = new ArrayList <T>();

		// T predstavlja tip promenljive

		List<Integer> kolekcija = new ArrayList<Integer>();

		kolekcija.add(5);
		kolekcija.add(4);
		kolekcija.add(9);
		kolekcija.add(7);

		System.out.println(kolekcija);
		// ArrayList se koristi kada se ne zna unapred velicina niza.
		System.out.println("Trenutna velicina kolekcije je: " + kolekcija.size());

		System.out.println("Unesite vrednost koju zelite da proverite: ");
		int x = sc.nextInt();

		if (kolekcija.contains(x)) {
			System.out.println("Vrednost " + x + " postoji u listi. ");
		} else
			System.out.println("Vrednost " + x + " ne postoji u listi. ");
	}

}
