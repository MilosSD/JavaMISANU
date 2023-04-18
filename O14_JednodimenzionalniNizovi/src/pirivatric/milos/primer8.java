package pirivatric.milos;

import java.util.Scanner;

public class primer8 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		double y = 1;
		System.out.println("Unesite broj članova niza n: ");

		int n = ulaz.nextInt();
		int x[] = new int[n];

		System.out.println("Unesite članove niza:");

		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = ulaz.nextInt();
		}
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0)
				y = (double) 1 / x[i];
			else
				y = x[i] * x[i];

			System.out.println("y = " + y);
		}
		ulaz.close();

	}

}
