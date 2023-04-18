package Zadatak4;

public class Main {

	public static void main(String[] args) {

		Hrana h1 = new Hrana("Krompir", 10.0, 25.5, 35.5, 39.0);
		Hrana h2 = new Hrana("Pirininac", 15.5, 36.0, 24.0, 15.0);
		Pice p1 = new Pice("Rakija", 2.0, 26.6);

		Meni m1 = new Meni(4);

		m1.dodajNamirnicu(h1);
		m1.dodajNamirnicu(h2);
		m1.dodajNamirnicu(p1);

		m1.opis();

	}

}
