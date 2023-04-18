package pirivatric.milos;

import java.text.DecimalFormat;

public class primer16tabeliranjefunk {

	public static void main(String[] args) {
		double x, y, z;
		int i = 0;
		DecimalFormat df = new DecimalFormat("#.##");

		System.out.println("\tR.Br.\tX\tY\tZ");

		for (x = 0.0; x <= 10.0; x += 1.0) {
			y = Math.sqrt(x) + 0.2 * x - Math.pow(x, 2) / (x + 1);
			z = y - 0.3 * (Math.pow(y, 2) / (y + 1));
			i++;

			System.out.println("\t" + i + "\t" + df.format(x) + "\t" + df.format(y) + "\t" + df.format(z));
		}

	}

}
