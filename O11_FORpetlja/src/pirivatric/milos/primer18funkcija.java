package pirivatric.milos;

import java.util.Scanner;

public class primer18funkcija {

	public static void main(String[] args) {
		double x, y = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.println("Unesite vrednost x: ");
			x = sc.nextDouble();

			if (x < 2) {
				y = x;
			} else if (x >= 2 && x < 3) {
				y = 2;
			} else
				y = x - 1;

			System.out.println("Za vrednost argumenta x = " + x + " vrednost funkcije y je: " + y);
		}

	}

}
