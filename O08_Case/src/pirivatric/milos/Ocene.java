package pirivatric.milos;

import java.util.Scanner;

public class Ocene {

	public static void main(String[] args) {

		int ocena;

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite ocenu: ");

		ocena = sc.nextInt();

		switch (ocena) {
		case 5: {
			System.out.println("Odlican ");
			break;
		}
		case 4: {
			System.out.println("Vrlo dobar");
			break;
		}
		case 3: {
			System.out.println("Dobar ");
			break;
		}
		case 2: {
			System.out.println("Dovoljan ");
			break;
		}
		case 1: {
			System.out.println("Nedovoljan ");
			break;
		}
		default:
			System.out.println("Niste uneli dozvoljenu vrednost. ");
			break;
		}
		sc.close();
	}

}
