package Zadatak3;

public class Main {

	public static void main(String[] args) {

		Polica p1 = new Polica(4, 1000.0);

		p1.dodaj(250.5);
		p1.dodaj(100.0);
		p1.dodajNaMesto(2, 124);

		p1.uzmi(2);

		System.out.println("Pristupi predmetu na mestu 1: " + p1.pristupi(1));
		System.out.println("Da li ima praznih mesta na polici: " + p1.ispitaj());
		System.out.println("Koliko je ukupan kapacitet police: " + p1.getBrMesta());
		System.out.println("Kolika je nosivost police: " + p1.getMaxTezina());
		System.out.println("Sa kolikim teretom je polica opterecena: " + p1.ukupanTeret());
		System.out.println("Koliko jos tereta moze da se doda: " + p1.praznoMesto());

		System.out.println("--------------------------------------------------");
		System.out.println("Opis police: ");
		System.out.println(p1.opis());
		System.out.println("--------------------------------------------------");
		System.out.println("Polica se prazni...");
		p1.isprazni();

		System.out.println(p1.opis());

	}

}
