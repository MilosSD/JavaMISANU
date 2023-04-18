package pirivatric.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class primer7 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		double p = 1, q = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Unseite vrednost n: ");
		int n = sc.nextInt();

		if (n < 100) {
			for (int i = 2; i <= n; i++) {
				q *= i;
				p *= (1 + 1 / q);
			}
			System.out.println("Dobijena vrednost proizvoda je " + df.format(p));
		} else
			System.out.println("Unesite vrednost manju od 100.");

	}

}
