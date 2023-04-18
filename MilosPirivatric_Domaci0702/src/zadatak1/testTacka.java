package zadatak1;

import java.io.IOException;

public class testTacka {

	public static void main(String[] args) throws IOException {
		Tacka t1 = new Tacka();
		Tacka t2 = new Tacka();

		System.out.println("Unesite koordinate prve tacke. ");
		t1.citaj();
		System.out.println("Unesite koordinate druge tacke: ");
		t2.citaj();

		System.out.println("t1: " + t1.ispis());
		System.out.println("t2: " + t2.ispis());

		System.out.println("Rastojanje izmedju dve unete tacke je: " + t1.rastojanje(t2));

	}

}
