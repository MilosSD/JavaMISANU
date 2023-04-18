package pirivaric.milos;

import java.text.DecimalFormat;

public class Primer15 {

	public static void main(String[] args) {
		double y = 1, x;
		int i = 0;
		DecimalFormat df = new DecimalFormat("#.##");

		// Štampanje zaglavlja
		System.out.println("\tR.Br\tX\tF(X)");

		for (x = 1.0; x <= 10.0; x += 0.5) {
			// Izračunavanje vrednosti funkcije
			y = x - 0.3 * Math.pow(x, 2) / (x + 1.2);
			i++;

			// Štampanje rezultata
			System.out.println("\t" + df.format(i) + "\t" + df.format(x) + "\t" + df.format(y));

		}
	}
}
