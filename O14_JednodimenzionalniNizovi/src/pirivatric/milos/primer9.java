package pirivatric.milos;

import java.util.Scanner;

public class primer9 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		double y = 1;
		System.out.println("Unesite broj članova niza n: ");

		int n = ulaz.nextInt();
		int x[] = new int[n];

		double s = 0, s1 = 0, s2 = 0;

		System.out.println("Unesite članove niza:");

		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = ulaz.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			s1 = s1 + x[i] * x[i];
			s2 += x[i];

		}
		s = Math.sqrt(s1 / n - Math.pow(s2 / n, 2));

		double sr = s2 / n;
		// Štampanje rezultata
		System.out.println("Standardna devijacija je " + s);
		System.out.println("Srednja vrednost je: " + sr);
		ulaz.close();
	}
}
