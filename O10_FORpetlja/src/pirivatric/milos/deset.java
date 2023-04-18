package pirivatric.milos;

import java.util.Scanner;

public class deset {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int poz = 0, neg = 0, nula = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("unesite " + i + ". broj ");
			int broj = input.nextInt();
			if (broj > 0) {
				poz++;
			}
			if (broj < 0) {
				neg++;
			}
			if (broj == 0) {
				nula++;
			}

		}
		System.out.println("Broj pozitvnih unetih brojeva je: " + poz + ", broj negativnih unetih brojeva je: " + neg
				+ ", broj unetih nula je: " + nula);

	}
}
