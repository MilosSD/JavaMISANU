package pirivatric.milos;

import java.text.DecimalFormat;

public class primer1 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.###");
		double s = 0;

		for (int n = 1; n <= 50; n++)
			s += (n + 2.5) / (n * n + 1.2);

		System.out.println("Dobijena vrednost sume je " + df.format(s));

	}

}
