package Mape;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMape {

	public static void main(String[] args) {
		/*
		 * Interfejs Map oodređuje okvir u kome se struktura podataka sastoji iz parova:
		 * jedinstvenog ključa i objekta na koji ključ ukazuje. Ključ ima istu ulogu kao
		 * broj elementa u nizu: jedinstvena vrednost koja se koristi za pristup
		 * podacima koji su sačuvani na nekoj poziciji u nizu. Za razilku od nizova,
		 * ključevi mogu biti različiti tipovi podataka ili klase.
		 */

		Student s1 = new Student("Ana", "Anic", "123/23", "Softversko inženjerstvo");
		Student s2 = new Student("Bogdan", "Bogdanovic", "222/23", "Softversko inženjerstvo");
		Student s3 = new Student("Veljko", "Petrovic", "333/23", "Softversko inženjerstvo");

		// Stvaranje nove HashMape čiji je ključ tipa String i sadrži objekte tipa
		// Student.
		Map<String, Student> studenti = new HashMap<>();

		studenti.put(s1.getBrIndeksa(), s1); // Metoda put(vrednostKljuča, povezaniObjekat) dodaje
												// određenu vrednost ključa i njemu dodeljeni objekat u mapu.
		studenti.put(s2.getBrIndeksa(), s2);
		studenti.put(s3.getBrIndeksa(), s3);

		// Metoda containsKey(objekat) vraca Bulove vrednosti u zavisnosti da li mapa
		// sadrzi ili ne sadrzi navedenu vrednost kljuca.
		System.out.println("Da li je u upisan student sa brojem indeksa 444/23 ? " + studenti.containsKey("444/23"));

		// Metoda containsValue(objekat) vraca Bulove vrednosti u zavisnosti da li
		// mapa sadrzi ili ne sadrzi navedenu vrednost.
		System.out.println("\nDa li je u upisan student sa rednim brojem 1 ? " + studenti.containsValue(s1));

		// Metoda get() vraca objekat ili vrednost koja je mapirana kljucem koji je unet
		// kao
		// argument metode.
		Student s = studenti.get("123/23");
		System.out.println("\nPodaci studenta sa rednim brojem indeksa 123/23: ");
		System.out.println(s.toString());

		// Metoda size() vraca vrednost velicine mape.
		System.out.println("\nBroj upisanih studenata: " + studenti.size());

		// Metoda replace() menja uneti vrednost povezanu sa kljucem novom vrednoscu.
		Student s4 = new Student("Đorđe", "Đorđević", "222/23", "Elektrotehnika i računarstvo");
		studenti.replace("222/23", s4);

		// Metoda putIfAbsent() dodaje vrednost ako ne postoji uneti kljuc vec u mapi.
		Student s5 = new Student("Nenad", "Nenadovic", "666/23", "Softversko inženjerstvo");
		studenti.putIfAbsent("666/23", s5);

		// Metoda remove(Objekat) uklanja navedeni objekat iz mape.
		studenti.remove("123/23");
		System.out.println("\nUklonjen student sa brojem indeksa 123/23!");

		// Metoda values() vraca sve vrednosti prisutne u kolekciji.
		System.out.println("\nSvi upisani studenti: ");
		System.out.print(studenti.values());
		System.out.println();

		// metoda toString() vraca unete vrednosti u obliku String-a.
		System.out.println("\nIspis svih vrednosti kroz toString(): ");
		System.out.println(studenti.toString());

		// Metoda clear() briše sve mapirane vrednosti.
		System.out.println("\nBrisanje svih unosa! ");
		studenti.clear();

		// Metoda isEmpty() vraća true ako je mapa prazna ili
		// false ako postoji neka mapirana vrednost ili objekat.
		System.out.println("\nDa li je mapa prazna? " + studenti.isEmpty());

		/*
		 * LinkedHashMap održava raspored elemenata na osnovu redosleda unosa, što kod
		 * HashMape nije slučaj. LinkedHashMap zbog toga zahteva više memorije.
		 * LinkedHashMap nasleđuje HashMap klasu.
		 */
		LinkedHashMap<String, Student> studentiLH = new LinkedHashMap<>();
		studentiLH.put(s5.getBrIndeksa(), s5);
		studentiLH.put(s1.getBrIndeksa(), s1);
		studentiLH.put(s3.getBrIndeksa(), s3);
		studentiLH.put(s2.getBrIndeksa(), s2);
		studentiLH.put(s4.getBrIndeksa(), s4);

		System.out.println("\nPrimer LinkedHashMap-e: ");
		System.out.println(studentiLH.values());

		/*
		 * TreeMap se razlikuje od drugih klasa koje implmentiraju Map interfejs jer
		 * omogućava sortiranje vrednosti na osnovu vrednosti unetih ključeva u
		 * prirodnom redosledu ili u definisanom redosledu.
		 */
		TreeMap<String, Student> studentiTree = new TreeMap<>();
		studentiTree.put(s5.getBrIndeksa(), s5);
		studentiTree.put(s1.getBrIndeksa(), s1);
		studentiTree.put(s3.getBrIndeksa(), s3);
		studentiTree.put(s2.getBrIndeksa(), s2);
		studentiTree.put(s4.getBrIndeksa(), s4);

		System.out.println("\nPrimer TreeMape: ");
		System.out.println(studentiTree.values());
	}

}
