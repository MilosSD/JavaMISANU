package pirivatric.milos;

import java.text.DecimalFormat;

public class vezba6 {

	static double gx(double x) {
		return Math.tan(x / 2) + Math.abs(x);
	}

	static double fx(double x) {
		return 2 * x - Math.log(x);
	}

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("##,###0.00");
		System.out.println("\tX\tY");

		for (double x = 0.1; x <= 0.9; x += 0.1) {

			double y = fx(2 * gx(fx(x)));

			System.out.println("\t" + df.format(x) + "\t" + df.format(y));
		}

	}

}
