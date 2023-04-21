package RegEx;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularniIzrazi {

	public static void main(String[] args) {

		/*
		 * Regularni izrazi (regular expression ili regex) definišu obrasce za pretragu
		 * stringova. MOgu biti korišćeni za pretragu i izmenu teksta.
		 */

		Student s1 = new Student("Miloš", "Pirivatrić", "IS56/06", "Istorija", "MilosP@gmail.com");
		Student s2 = new Student("Nenad", "Nenadović", "IS07/07", "Istorija", "nnenad@yahoo.com");
		Student s3 = new Student("Milica", "Milićević", "IU24/06", "Istorija umetnosti", "milicevicm@gmail.com");
		Student s4 = new Student("Ana", "Stojković", "AR56/08", "Arheologija", "ana.stojkovic@yahoo.com");
		Student s5 = new Student("Aleksandra", "Anastasijević", "IS22/06", "Istorija", "anastasaa@yahoo.com");

		LinkedList<Student> filozofski = new LinkedList<Student>();
		filozofski.add(s1);
		filozofski.add(s2);
		filozofski.add(s3);
		filozofski.add(s4);
		filozofski.add(s5);

		/*
		 * Prikazati podatke studenta koji je upisao fakultet 2006. godine na odeljenju
		 * za Istoriju.
		 */
		Pattern upit1 = Pattern.compile("(IS)");
		Pattern upit2 = Pattern.compile("(/06)");

		boolean par = false;
		String oznaka = "";

		System.out.println("Studenti koji su upisali istoriju 2006 godine: ");

		for (Student s : filozofski) {
			Matcher matcher1 = upit1.matcher(s.getBrIndeksa());
			Matcher matcher2 = upit2.matcher(s.getBrIndeksa());

			par = matcher1.find() && matcher2.find();
			if (par) {
				System.out.println("\n" + s.toString());
				// Metoda .group() omogucava da se "izvuce" prepoznata regex grupa.
				oznaka = matcher1.group();
			}
		}

		System.out.println("\nOznaka indeksa studenata odeljenja Istorije: ");
		System.out.println("\n" + oznaka);

		System.out.println("\nStudenti koji imaju adrese na Yahoo servisu: ");
		Pattern yahoo = Pattern.compile("(yahoo.com)");
		par = false;
		for (Student s : filozofski) {
			Matcher matcher1 = yahoo.matcher(s.getEmail());
			par = matcher1.find();
			if (par)
				System.out.println("\n" + s.toString());
		}

		System.out.println("\nStudenti čije ime počinje na A i završava se na a: ");
		Pattern pocetak = Pattern.compile("^A|^a");
		Pattern kraj = Pattern.compile("a$|A$");
		par = false;
		for (Student s : filozofski) {
			Matcher matcher3 = pocetak.matcher(s.getIme());
			Matcher matcher4 = kraj.matcher(s.getIme());
			par = matcher3.find() && matcher4.find();
			if (par)
				System.out.println("\n" + s.toString());
		}

	}

}
