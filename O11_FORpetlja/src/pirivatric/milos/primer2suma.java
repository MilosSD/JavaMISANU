package pirivatric.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class primer2suma {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.### ");
		Scanner sc = new Scanner(System.in);

		double n, s = 0;

		System.out.println("Unesite vrednost n: ");
		n = sc.nextDouble();

		if (n < 100) {
			for (int i = 1; i <= n; i++) {
				if (i != 3) {
					s += (i + 3.5) / (i - 3.0);
				}
			}
			System.out.println("Dobijena vrednost sume je " + df.format(s));
		} else
			System.out.println("Unesite vrednost manju od 100!");
		sc.close();
	}

}
