package pirivatric.milos;

import java.util.Scanner;

public class kategorijeswwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char kategorija;
		System.out.println("unesite zeljenu kategoriju vozila");
		kategorija = sc.next().charAt(0);
		switch (kategorija) {
		case 'A': {
			System.out.println("Sa kategorijom A mozete voziti Auto.");
		}
			break;
		case 'B': {
			System.out.println("Sa kategorijom B mozete voziti Auto.");
		}
			break;
		case 'C': {
			System.out.println("Sa kategorijom C mozete voziti Auto, kamion.");
		}
			break;
		case 'D': {
			System.out.println("Sa kategorijom D mozete voziti Auto, kamion i autobus.");
		}
			break;
		case 'E': {
			System.out.println("Sa kategorijom E mozete voziti Auto, kamion i kamion sa prikolicom.");
		}
			break;
		default: {
			System.out.println("Neispravan unos.");
		}
		}
	}
}
