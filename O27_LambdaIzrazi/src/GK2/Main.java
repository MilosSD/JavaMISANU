package GK2;

public class Main {

	public static void main(String[] args) {

		A<Integer, String> objekat1 = new A<Integer, String>(100, "Java");

		objekat1.prikaziTip();

		int intvrednost = objekat1.getObj1();
		System.out.println("Vrednost T: " + intvrednost);

		String strVrednost = objekat1.getObj2();
		System.out.println("Vrednost V: " + strVrednost);

		System.out.println("--------------------------------------");

		A<String, Double> objekat2 = new A<String, Double>("tekst123", 123.45);

		objekat2.prikaziTip();

		System.out.println("Vrednost: " + objekat2.getObj1());
		System.out.println("Vrednost: " + objekat2.getObj2());

		System.out.println("--------------------------------------");

		A<Boolean, Integer> objekat3 = new A<Boolean, Integer>(true, 101);

		objekat3.prikaziTip();

		System.out.println("Vrednost: " + objekat3.getObj1());
		System.out.println("Vrednost: " + objekat3.getObj2());
	}

}
