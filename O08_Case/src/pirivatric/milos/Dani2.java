package pirivatric.milos;

import java.util.Scanner;

public class Dani2 {

	public static void main(String[] args) {
		int k1, k2, k3;

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite redni broj prvog zeljenog dana u godini: ");
		k1 = sc.nextInt();

		System.out.print("Unesite redni broj drugog zeljenog dana u godini: ");
		k2 = sc.nextInt();

		System.out.print("Unesite redni broj treceg zeljenog dana u godini: ");
		k3 = sc.nextInt();

		if (k1 % 7 == 0 && k2 % 7 == 0 && k3 % 7 == 0) {
			System.out.println("Isti dani u nedelji. ");
		} else if (k1 % 7 == 1 && k2 % 7 == 1 && k3 % 7 == 1) {
			System.out.println("Isti dani u nedelji. ");
		} else if (k1 % 7 == 2 && k2 % 7 == 2 && k3 % 7 == 2) {
			System.out.println("Isti dani u nedelji. ");
		} else if (k1 % 7 == 3 && k2 % 7 == 3 && k3 % 7 == 3) {
			System.out.println("Isti dani u nedelji. ");
		} else if (k1 % 7 == 4 && k2 % 7 == 4 && k3 % 7 == 4) {
			System.out.println("Isti dani u nedelji. ");
		} else if (k1 % 7 == 5 && k2 % 7 == 5 && k3 % 7 == 5) {
			System.out.println("Isti dani u nedelji. ");
		} else if (k1 % 7 == 6 && k2 % 7 == 6 && k3 % 7 == 6) {
			System.out.println("Isti dani u nedelji. ");
		} else {
			System.out.println("Nisu isti dani u nedelji. ");
		}
		sc.close();
	}

}
