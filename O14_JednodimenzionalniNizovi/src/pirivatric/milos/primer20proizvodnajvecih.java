package pirivatric.milos;

import java.util.Scanner;

public class primer20proizvodnajvecih {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		System.out.print("Unesite broj članova niza n: ");
		int n = ulaz.nextInt();

		int x[] = new int[n];
		int max = 0, p = 1;

		System.out.println("Unesite članove niza:");
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = ulaz.nextInt();
		}
		int cifra;
		for (int i = 0; i < n; i++) {
			int a = x[i];
			while (a != 0) {
				cifra = a % 10;
				if (cifra > max)
					max = cifra;
				a /= 10;

				p *= max;
			}
			System.out.println("Najveća cifra člana niza " + x[i] + " je " + max);
		}
		System.out.println("Proizvod najvecih cifara je: " + p);
		ulaz.close();
	}
}
