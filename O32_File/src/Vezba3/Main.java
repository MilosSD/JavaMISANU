package Vezba3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		System.out.println("Unesite ceo broj: ");
		int broj = inp.nextInt();
		int a = 0;
		boolean imaPet = false;
		while (broj > 0) {
			a = broj % 10;
			broj /= 10;
			if (a == 5) {
				System.out.println("Broj sadrzi cifru 5.");
				System.exit(0);
			}

		}
		if (imaPet == false)
			System.out.println("Broj ne sadrzi cifru 5! ");
		inp.close();
	}
	// if (count == 0) {
	// System.out.println("Broj ne sadrzi cifru 5.");

}
