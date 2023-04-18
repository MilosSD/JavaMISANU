package zadatak9;

import java.util.Scanner;

public class Funkcije {

	static int fn(int n) {
		if (n == 0)
			return 2;
		return fn(n - 1) * gn(n - 1) + 3 * n - 1;

	}

	static int gn(int n) {
		if (n == 0)
			return 2;
		return n * n * fn(n - 1) + 2 * gn(n - 1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite prirodan broj n: ");
		int n = sc.nextInt();

		if (n == 0 || n < 0)
			System.out.println("Niste uneli prirodan broj!");

		else {

			System.out.println("Vrednost funkcije f(n) za unetu vrednost n = " + n + " je: " + fn(n));

			sc.close();

		}
	}

}
