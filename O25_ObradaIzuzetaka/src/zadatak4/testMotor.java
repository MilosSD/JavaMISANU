package zadatak4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class testMotor {

	public static void main(String[] args) throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// Unos podataka o motoru
		System.out.println("Unesite marku motora: ");
		String marka = ulaz.readLine();
		System.out.println("Unesite kubikažu motora: ");
		double kubikaza = Double.parseDouble(ulaz.readLine());

		// Kreiranje objekat klase
		Motor a = new Motor();
		try {
			// Postavljanje podataka o motoru
			a.setMarka(marka);
			a.setKubikaza(kubikaza);
			// Štampanje podataka o motoru
			System.out.println("\nUneti podaci o motoru su: ");
			a.ispisi();
		} catch (izuzetakMotor e) {
			System.out.println("Greška: " + e.getMessage());
		}
	}
}
