package Liste;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class Liste {

	public static void main(String[] args) {
		/*
		 * Interfejs List nasledjuje Collection interfejs. Mogu biti uskladistene
		 * duplirane vrednosti. Interfejs List omogucava da se zadrzi raspored po unosu,
		 * omogucava pristup elementima preko indeksa. Ako se inicijalni kapacitet ne
		 * navede, podrazumevani kapacitet je 10. Kapacitet se moze povecati kako se
		 * dodaju novi elementi (dinamicki niz).
		 */

		/*
		 * Primer Arraylist klase koja implementira interfejs List. Kod ArrayLista
		 * elementima može da se pristupa po proizvoljnom redosledu.
		 */

		String[] imena = { "Milan", "Jovan", "Aleksa", "Nenad", "Ana", "Jovana", "Milena", "Milica", "Nevena",
				"Marija" };
		List<String> s = new ArrayList<String>();

		System.out.println("\n-----------ArrayList--------------- ");
		// Metoda isEmpty() vraca logicku vrednost true ako je lista prazna.
		System.out.println("Lista je prazna? : " + s.isEmpty());

		for (int i = 0; i < imena.length; i++)
			s.add(imena[i]);

		// Metoda add() dodaje element na sledece mesto u listi.
		s.add("Dragan");

		// metoda add(ind, vrednost) dodaje element na mesto odredjeno indeksom.
		s.add(2, "Aleksandar");

		// Metoda contains() vraca logicku vrednost na osnovu toga da li je argument
		// metode sadrzan u listi.
		System.out.println("\nRadovan u listi? : " + s.contains("Radovan"));

		// Metoda get(ind) vraca element na poziciji koja je prosledjena u argumentu.
		System.out.println("\nNa poziciji 2 : " + s.get(2));

		// Metoda size() vraca velicinu liste.
		System.out.println("\nVelicina liste : " + s.size());

		// Metoda IndexOf(Objekat) vraca indeks prvog pojavljivanja objekta u listi.
		// Vraca -1 ukoliko nema objekta u listi.
		System.out.println("\nAna na poziciji? : " + s.indexOf("Ana"));

		// Metoda remove() uklanja dati objekat ako se prosledi kao argument,
		// objekat na odredjenoj poziciji ciji je indeks prosledjen kao argument.
		s.remove("Alleksandar");
		s.remove(6);

		// Metoda set() menja vrednost na mestu koje je navedeno argumentom
		// u vrednost koja je navedena u argumentu metode.
		s.set(5, "Milovan");

		// Metoda toArray() vraca niz koji sadrzi sve elemente liste.
		String[] a = new String[s.size()];
		a = s.toArray(a);

		System.out.println("\nLista kao niz: ");
		for (String str : a)
			System.out.print(str + " ");
		System.out.println();

		// Interfejs iterator omogucava prolazak kroz listu u dva pravca:
		// do kraja liste i potom unazad metodama hasNext() i hasPrevious().
		ListIterator<String> li = s.listIterator(11);

		System.out.println("\nČitanje liste unazad pomoću iteratora: ");
		while (li.hasPrevious())
			System.out.print(li.previous() + " ");

		/*
		 * Klasa LinkedList skladišti elemente koji se mogu ponavljati. Svaki element
		 * sadrži i pokazivač na sledeći uređeni par (pokazivač + element). Elementi se
		 * obično obilaze sekvencijalno, proizvoljan pristup je neefikasan. Ubacivanje i
		 * izbacivanje elemenata je efikasno.
		 */
		System.out.println("\n----------LinkedList--------------- ");
		LinkedList<String> ll = new LinkedList<>();

		/*
		 * Metoda addAll() dodaje sve elemente iz druge kolekcije u listu. Postoji i
		 * mogućnost da se dodaju elementi počevši od zadatog indeksa. Metode addFirst()
		 * i addLast() dodaju elemente na početak ili na kraj liste. Iste varijante
		 * postoje i kod metode remove().
		 */
		ll.addAll(s);
		ll.addFirst("Miloš");
		ll.addLast("Elena");

		/*
		 * Metoda subList() vraca deo liste počevši od prvog navedenog indeksa u
		 * argumentu, do drugog navedenog indeksa, ali bez njega. U ovom slučaju
		 * iskorišćena je za brisanje dela liste.
		 */
		ll.subList(8, 11).clear();

		ListIterator<String> lli = ll.listIterator();
		System.out.println();
		System.out.println("\nČitanje liste pomoću iteratora: ");
		while (lli.hasNext())
			System.out.print(lli.next() + " ");

		/*
		 * Klasa Vector je veoma slična klasi ArrayList, ali sadrži neke metode koje
		 * zbirka kolekcija ne sadrži.
		 */
		Vector v = new Vector(3, 2);
		System.out.println("\n-------------Vektor----------------- ");
		System.out.println("\nPočetna veličina: " + v.size());
		System.out.println("\nPočetni kapacitet: " + v.capacity());

		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		System.out.println("Kapacitet posle 4 dodata elementa: " + v.capacity());

		v.addElement(new Double(5.45));
		System.out.println("\nTrenutni kapacitet: " + v.capacity());

		v.addElement(new Double(6.08));
		v.addElement(new Integer(7));
		System.out.println("\nTrenutni kapacitet: " + v.capacity());

		v.addElement(new Float(9.4));
		v.addElement(new Integer(10));
		System.out.println("\nTrenutni kapacitet: " + v.capacity());

		v.addElement(new Integer(11));
		v.addElement(new Integer(12));
		System.out.println("\nPrvi element " + (Integer) v.firstElement());
		System.out.println("\nPoslednji element " + (Integer) v.lastElement());

		if (v.contains(new Integer(3)))
			System.out.println("\nVektor sadrži broj 3");

		/*
		 * Klasa Stack funkcioniše po principu poslednji dodan, prvi pročitan.
		 * Predstavlja podklasu klase Vector i implementira List interfejs.
		 */
		System.out.println("\n-------------Stack----------------- ");
		Stack<Integer> stek = new Stack<Integer>();

		stek.addAll(v);

		// Metoda peek() prikazuje element na vrhu steka i ne uklanja ga.
		System.out.println("\nElement na vrhu steka: " + stek.peek());

		// Metoda push() dodaje element na vrh steka.
		stek.push(1);
		System.out.println("\nNovi element na vrhu steka: " + stek.peek());

		// Metoda pop() uklanja element sa vrha steka.
		stek.pop();
		System.out.println("\nNovi element na vrhu steka: " + stek.peek());

		// Metoda search() vraća indeks traženog elementa ako postoji u steku,
		// ili -1 ukoliko element ne postoji u steku.
		int pos = stek.search(7);
		if (pos == -1)
			System.out.println("\nElement nije pronađen! ");
		else
			System.out.println("\nElement 7 pronađen na poziciji: " + pos);

	}

}
