package pirivatric.milos;

import java.text.DecimalFormat;

public class primer17tabeliranje {

	public static void main(String[] args) {
		double a, b, p = 0, q = 0;
		DecimalFormat dc = new DecimalFormat("#.###");

		System.out.println("\ta\tb\tp\tq");

		for (a = 0.1; a <= 0.5; a += 0.1)
			for (b = 0.1; b <= 0.2; b += 0.1) {
				p = Math.cos(a) - Math.cos(b);
				q = -2 * Math.sin((a + b) / 2) * Math.sin((a - b) / 2);

				System.out
						.println("\t" + dc.format(a) + "\t" + dc.format(b) + "\t" + dc.format(p) + "\t" + dc.format(q));
			}
	}

}
