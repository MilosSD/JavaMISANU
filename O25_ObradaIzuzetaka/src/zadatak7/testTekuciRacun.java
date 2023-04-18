package zadatak7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class testTekuciRacun {

	public static void main(String[] args) throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Kreiranje objekta klaseTekuciRacun
		TekuciRacun tr = new TekuciRacun();
		try {
			// Unos podataka o tekućem računu
			System.out.println("Unesite broj tekućeg računa: ");
			String brojTekucegRacuna = ulaz.readLine();
			System.out.println("Unesite ime i prezime vlasnika računa: ");
			String vlasnikRacuna = ulaz.readLine();
			System.out.println("Unesite iznos na tekućem računu: ");
			double iznos = Double.parseDouble(ulaz.readLine());

			// Postavljanje podataka o tekućem računu
			tr.setBrojTekucegRacuna(brojTekucegRacuna);
			tr.setVlasnikRacuna(vlasnikRacuna);
			tr.setIznosNaRacunu(iznos);

			// Štampanje podataka o tekućem računu

			System.out.println("\nUneti podaci o tekućem računu su: ");
			System.out.println(tr.toString());
		} catch (Exception e) {
			System.out.println("Greška: " + e.getMessage());
		}
	}
}
