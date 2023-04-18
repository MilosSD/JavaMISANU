package UUP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Primer18 {
	public static void main(String[] args) throws Exception {
		// Deklarisanje podataka
		double x;
		boolean y;
		DecimalFormat df = new DecimalFormat("#.##");

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos podataka
		System.out.print("Unesite vrednost za x: ");
		x = Double.parseDouble(ulaz.readLine());

		if (x < 1)
			// Štampanje poruke korisniku o pogrešnom unosu podataka
			System.out.println("Unos podataka nije ispravan (x ne moze biti manje od 1).");

		else {
			y = Math.sqrt((2 + x - Math.pow(x, 3)) / (x + 2)) > 0 || Math.exp(x) < x - 1 && Math.sqrt(x - 1) <= 0;
			// Štampanje rezultata
			System.out.println("Vrednost funkcije y je " + y);
		}
	}
}
