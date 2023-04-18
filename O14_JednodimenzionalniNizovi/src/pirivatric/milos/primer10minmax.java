package pirivatric.milos;

import java.util.Scanner;

public class primer10minmax {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		double y = 1;
		System.out.println("Unesite broj članova niza n: ");

		int n = ulaz.nextInt();
		int x[] = new int[100];

		int min = 0, max = 0;

		System.out.println("Unesite članove niza:");

		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = ulaz.nextInt();
		}
		min = max = x[1];

		for (int i = 2; i <= n; i++) {
			if (x[i] > max) {
				max = x[i];
			}
			if (x[i] < min)
				min = x[i];
		}
		System.out.println("Maksimalni element je " + max + "\nMinimalni element je " + min);
	}
}
