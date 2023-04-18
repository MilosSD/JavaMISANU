package pirivatric.milos;

import java.util.Scanner;

public class Kvadrant {

	public static void main(String[] args) {
		int kvadrant;

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite kvadrant: ");

		kvadrant = sc.nextInt();

		switch (kvadrant) {
		case 1: {
			System.out.println("Moguca vrednost ugla je od 0 do 90 stepeni. ");
			break;
		}
		case 2: {
			System.out.println("Moguca vrednost ugla je od 90 do 180 stepeni. ");
			break;
		}
		case 3: {
			System.out.println("Moguca vrednost ugla je od 180 do 270 stepeni.  ");
			break;
		}

		case 4: {
			System.out.println("Moguca vrednost ugla je od 270 do 360 stepeni. ");
			break;
		}

		default:
			System.out.println("Niste uneli dozvoljenu vrednost. ");
		}
		sc.close();
	}
}
