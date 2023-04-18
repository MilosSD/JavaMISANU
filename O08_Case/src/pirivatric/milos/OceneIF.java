package pirivatric.milos;

import java.util.Scanner;

public class OceneIF {

	public static void main(String[] args) {

		int ocena;

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite ocenu: ");

		ocena = sc.nextInt();

		if (ocena == 5) {
			System.out.println("Odlican ");
		} else if (ocena == 4) {
			System.out.println("Vrlo dobar");
		} else if (ocena == 3) {
			System.out.println("Dobar");
		} else if (ocena == 2) {
			System.out.println("Dovoljan ");
		} else if (ocena == 1) {
			System.out.println("Nedovoljan ");
		} else {
			System.out.println("Niste uneli dozvoljenu vrednost. ");
		}
	}
}
