package pirivatric.milos;

import java.util.Scanner;

public class Dani {

	public static void main(String[] args) {
		int ocena;

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite redni broj dana u nedelji: ");

		ocena = sc.nextInt();

		switch (ocena) {
		case 1: {
			System.out.println("Ponedeljak ");
			break;
		}
		case 2: {
			System.out.println("Utorak");
			break;
		}
		case 3: {
			System.out.println("Sreda ");
			break;
		}
		case 4: {
			System.out.println("Cetvrtak ");
			break;
		}
		case 5: {
			System.out.println("Petak ");
			break;
		}
		case 6: {
			System.out.println("Subota ");
			break;
		}
		case 7: {
			System.out.println("Nedelja ");
			break;
		}
		default:
			System.out.println("Niste uneli dozvoljenu vrednost. ");
		}
		sc.close();
	}
}