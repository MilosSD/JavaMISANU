package pirivatric.milos;

import java.text.DecimalFormat;

public class primer11 {

	public static void main(String[] args) {
		double x = 1.0, y, br = 1.0;
		DecimalFormat df = new DecimalFormat("#.###");
		int i = 1;
		System.out.println("\tR.Br.\tX\tY(x)");

		for (x = 1.0; x <= 2.0; x += 0.2) {
			y = x + 2.5 * (Math.pow(x, 3) / (x - 2.8));
			System.out.println("\t" + i + "\t" + df.format(x) + "\t" + df.format(y));
			i++;
		}
	}

}
