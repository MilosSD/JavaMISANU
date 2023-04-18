package pirivatric.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class primer1suma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");

		double s = 0;

		System.out.println("Unesite vrednost n: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			s += (double) i / (i + 1);
		}
		System.out.println("Za unetu vrednost n: " + n + " vrednost sume s je: " + df.format(s));
		/*
		 * int i = 1; while (i <=n){ s += (double) i / (i + 1); i++}
		 */
		sc.close();
	}

}
