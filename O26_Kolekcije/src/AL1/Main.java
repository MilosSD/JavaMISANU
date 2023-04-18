package AL1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> t = new ArrayList<String>();

		// size() - vraca broj elemenata smestenih u kolekciji ArrayList
		System.out.println("Pocetna duzina: " + t.size());

		// add() - dodaje element na kraj kolekcije
		t.add("Prvi");
		t.add("Drugi");
		t.add("Treci");
		t.add("Cetvrti");

		// Prolayak kroz kolekciju.
		for (String s : t) {
			System.out.printf("%s ", s);
		}

		System.out.println("\nTrenutna duzina: " + t.size());

		// provera da li se neki zadati element nalazi unutar kolekcije
		// contains - vraca true ako kolekcija sadrzi trazeni element

		boolean sadrzi = t.contains("Treci");
		System.out.println(sadrzi);
		if (sadrzi) {
			System.out.println("Trazeni element se nalazi u zadatoj kolekciji! ");
		} else {
			System.out.println("Trazeni elementa se ne nalazi u zadatoj kolkciji! ");
		}

		// get() - vraca element sa zadatim indeksom

		System.out.println(t.get(2));
		// indexOf - vraca vrednost prve pojave zadataog elementa
		// vraca -1 ukoliko zadati element ne postoji
		int pozicija = t.indexOf("Drugi");
		System.out.println("Element Drugi je na poziciji: " + pozicija);

		// toArray - sluzi za prebacivanje elemenata u niz
		String[] nizString = new String[t.size()];
		t.toArray(nizString);

		for (String s : nizString) {
			System.out.printf("%s ", s);
		}
		// remove - brise prvu pojavu zadate vredno
		t.remove("Drugi");

		System.out.println("\nKolekcija nakon uklanjanja elementa Drugi:");
		for (String s1 : t) {
			System.out.printf("%s ", s1);
		}
		// clear - brise sve elemente iz trenutne kolekcije
		t.clear();
		System.out.println("\nVelicina kolekcije nakon brisanja: " + t.size());
	}

}
