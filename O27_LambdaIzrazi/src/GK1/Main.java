package GK1;

public class Main {

	public static void main(String[] args) {

		A<Integer> intObjekat = new A<Integer>(100);

		intObjekat.prikaziTip();

		int vrednostIntObjekta = intObjekat.getob();
		System.out.println("Vrednost: " + vrednostIntObjekta);

		System.out.println("---------------------------------");

		// pravi objekat A za tip String
		A<String> stringObjekat = new A<String>("tekst");
		stringObjekat.prikaziTip();

		String str = stringObjekat.getob();
		System.out.println("Vrednost: " + str);

	}

}
