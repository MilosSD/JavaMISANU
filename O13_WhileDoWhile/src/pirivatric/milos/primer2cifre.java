package pirivatric.milos;

import java.util.Scanner;

public class primer2cifre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int broj, cifra;

		System.out.print("Unesite broj: ");
		broj = sc.nextInt();

		do {
			cifra = broj % 10;
			broj = broj / 10;
			System.out.println(cifra);
		} while (broj > 0);

		sc.close();
	}

}
