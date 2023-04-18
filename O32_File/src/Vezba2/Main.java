package Vezba2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		System.out.println("unesite vrednost n: ");
		int n = inp.nextInt();
		int zbir = 0;

		if (n <= 0) {
			System.out.println("Greska: neispravan unos.");
		} else {
			for (int i = 1; i <= n; i++) {
				System.out.println("Unesite " + i + ". broj: ");
				int br = inp.nextInt();

				if (br % 2 != 0 && br < 0) {
					zbir += br;
				}
			}

			System.out.println("Zbir unetih negativnih i neparnih brojeva je: " + zbir);
		}
	}

}
