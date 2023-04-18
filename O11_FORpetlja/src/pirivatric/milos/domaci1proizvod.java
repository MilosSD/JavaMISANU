package pirivatric.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class domaci1proizvod {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.###");
		Scanner sc = new Scanner(System.in);

		double p = 0.0;

		System.out.print("Unesite vrednost n: ");
		double n = sc.nextDouble();

		for (double i = 1.0; i <= n; i += 1.0) {
			p = 1 - (1 / (i + 1));
		}
		System.out.println("Ya unetu vrednost n = " + n + "dobijena vrednost proizvoda je p = " + df.format(p));
		sc.close();
	}

}
