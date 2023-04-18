package pirivatric.milos;

import java.util.Scanner;

public class vezba2 {

	public static void stampajNiz(int n, double niz[]) {
		System.out.println("Unesti elementi niza su ");
		for (int i = 0; i < n; i++) {
			System.out.println(niz[i] + "\t");
		}
	}

	static double srednjaVrednost(int n, double niz[]) {
		double sr = 0;
		for (int i = 0; i < n; i++) {
			sr += niz[i];
		}

		return (double) sr / n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double niz[] = new double[10];

		System.out.print("Unesite dimenzije niza: ");
		int n = sc.nextInt();

		System.out.println("Unesite elemente niza: ");
		for (int i = 0; i < n; i++) {
			System.out.print("niz[" + i + "] = ");
			niz[i] = sc.nextDouble();
		}
		stampajNiz(n, niz);
		System.out.println("\nSrednja vrednost elemenata niza je: " + srednjaVrednost(n, niz));
	}

}
