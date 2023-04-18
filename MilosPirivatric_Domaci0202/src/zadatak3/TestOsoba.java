package zadatak3;

import java.io.IOException;
import java.util.Scanner;

public class TestOsoba {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Da li je osoba djak (true) ili zaposlen (false)? ");
			boolean izbor = sc.nextBoolean();

			if (izbor) {
				Djak d1 = new Djak();
				d1.unosDjak();
				System.out.println("------------------------------");
				System.out.print(d1.toString(d1.skola, d1.razred));
			} else {
				Zaposlen z1 = new Zaposlen();
				z1.unosZaposlen();
				System.out.println("------------------------------");
				System.out.print(z1.toString(z1.firma, z1.odeljenje));
			}
		} catch (Exception e) {
			System.out.println("Nepravilan unos!");
			TestOsoba.main(args);
		}

		finally {
			sc.close();
		}

	}

}
