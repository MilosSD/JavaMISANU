package pirivatric.milos;

import java.util.Scanner;

public class kategorija {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char kategorija;
		System.out.println("unesite zeljenu kategoriju vozila");
		kategorija = sc.next().charAt(0);

		if (kategorija == 'A') {
			System.out.println("Sa kategorijom A mozete voziti Auto.");
		} else if (kategorija == 'B') {
			System.out.println("Sa kategorijom B mozete voziti Auto.");
		} else if (kategorija == 'C') {
			System.out.println("Sa kategorijom D mozete voziti Auto, kamion i autobus.");
		} else if (kategorija == 'D') {

			System.out.println("Sa kategorijom D mozete voziti Auto, kamion i autobus.");
		} else if (kategorija == 'E') {

			System.out.println("Sa kategorijom E mozete voziti Auto, kamion i kamion sa prikolicom.");
		} else {
			System.out.println("Neispravan unos.");
		}
	}
}
