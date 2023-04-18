package Zadatak5;

public class Main {

	public static void main(String[] args) {

		Naselje n1 = new Naselje("Lipe", 1045);
		Naselje n2 = new Naselje("Kolari", 967);

		Naselje n3 = new Naselje("Azanja", 4014);
		Naselje n4 = new Naselje("Selevac", 3864);

		Opstina o1 = new Opstina("Smederevo", 2, 484);
		Opstina o2 = new Opstina("Smederevska Palanka", 2, 422);

		o1.dodajNaselje(n1);
		o1.dodajNaselje(n2);

		o2.dodajNaselje(n3);
		o2.dodajNaselje(n4);

		Okrug okr = new Okrug("Podunavski okrug");
		okr.dodajJedinicu(o1);
		okr.dodajJedinicu(o2);

		System.out.println(okr.opis());
	}

}
