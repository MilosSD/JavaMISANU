package zadatak6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Proizvod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.###");

		double p = 1.0;

		System.out.print("Unesite vrednost n: ");
		double n = sc.nextDouble();

		for (double i = 1.0; i <= n; i += 1.0) {
			p *= (1 - (1 / (i + 1)));
		}
		System.out.println("Za unetu vrednost n = " + n + " dobijena vrednost proizvoda je p = " + df.format(p));
		sc.close();
	}

}
