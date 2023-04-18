package zadatak10;

import java.text.DecimalFormat;

public class Main {

	public static double f(double x, double y) {
		if (x < y) {
			return Math.exp(x) * Math.cos(3 * y);
		} else if (x == y) {
			return Math.sin(x);
		} else
			return 1 + Math.sqrt(Math.abs(x * y));
	}

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("##.###");

		System.out.println("X\tY\tF(X,Y)");
		for (double x = 0.1; x <= 0.5; x += 0.1) {
			for (double y = 0.01; y <= 0.03; y += 0.01) {
				System.out.println(df.format(x) + "\t" + df.format(y) + "\t" + df.format(f(x, y)));
			}
		}

	}

}
