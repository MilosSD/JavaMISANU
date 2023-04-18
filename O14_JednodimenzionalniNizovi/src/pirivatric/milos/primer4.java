package pirivatric.milos;

import java.util.Scanner;

public class primer4 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		System.out.print("Unesite broj članova niza n: ");
		int n = ulaz.nextInt();

		int x[] = new int[n];
		int p = 1;

		System.out.println("Unesite članove niza:");
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = ulaz.nextInt();
		}
		for (int i = 1; i < n; i++) {
			if (x[i] % 4 != 0)
				p *= x[i];
		}
		System.out.println("Proizvod brojeva koji nisu deljivi sa 4 je: " + p);
		ulaz.close();

	}

}
