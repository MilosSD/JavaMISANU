package pirivatric.milos;

import java.util.Scanner;

public class KvadrantIF {

	public static void main(String[] args) {
		int kvadrant;

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite kvadrant: ");

		kvadrant = sc.nextInt();

		if (kvadrant == 1) {
			System.out.println("Moguca vrednost ugla je od 0 do 90 stepeni. ");
		} else if (kvadrant == 2) {
			System.out.println("Moguca vrednost ugla je od 90 do 180 stepeni. ");
		} else if (kvadrant == 3) {
			System.out.println("Moguca vrednost ugla je od 180 do 270 stepeni. ");
		} else if (kvadrant == 4) {
			System.out.println("Moguca vrednost ugla je od 270 do 360 stepeni. ");
		} else {
			System.out.println("Niste uneli dozvoljenu vrednost. ");
		}
		sc.close();
	}

}
