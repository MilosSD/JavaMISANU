package pirivatric.milos;

import java.util.Scanner;

public class primer16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int broj, cifra;
		System.out.print("Unesite ceo broj: ");
		broj = sc.nextInt();

		int i = broj;
		int max = 0;

		while (broj != 0) {
			cifra = broj % 10;
			if (cifra > max)
				max = cifra;

			broj /= 10;
		}
		System.out.println("Najveca cifra unetog broja " + i + " je: " + max);
		sc.close();
	}

}
