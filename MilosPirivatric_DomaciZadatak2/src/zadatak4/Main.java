package zadatak4;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###.##");

		System.out.println("R.Br.\tx\ta\ty\tz");

		double x, a, y, z = 0;
		int i = 0;

		for (x = 1; x <= 4; x += 1)
			for (a = 0.1; a <= 0.5; a += 0.1)
				for (y = 0.1; y <= 0.2; y += 0.05) {
					i++;
					z = Math.pow(((x + a + y) / (x - y)), 2) - x / (x + a);
					System.out.println(i + "\t" + x + "\t" + df.format(a) + "\t" + df.format(y) + "\t" + df.format(z));
				}

	}

}
