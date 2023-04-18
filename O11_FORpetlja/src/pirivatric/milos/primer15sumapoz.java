package pirivatric.milos;

import java.util.Scanner;

public class primer15sumapoz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sp = 0, sn = 0, n;

		System.out.print("Unestite vrednost n: ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Unesite broj: ");
			int broj = sc.nextInt();

			if (broj >= 0)
				sp += broj;
			else
				sn += broj;
		}
		System.out.println("Suma pozitivnih unetih brojeva je: " + sp);
		System.out.println("Suma negativnih unetih brojeva je: " + sn);
	}

}
