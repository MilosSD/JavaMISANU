package pirivatric.milos;

import java.util.Scanner;

public class primer8cifre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int broj, j, d;
		int[] bj = new int[10];
		int[] bd = new int[10];

		for (int i = 0; i <= 9; i++) {
			bj[i] = 0;
			bd[i] = 0;
		}
		System.out.println("Koliko brojeva zeite da unesete? ");
		int n = sc.nextInt();

		System.out.println("Unesite brojeve: ");
		for (int i = 1; i <= n; i++) {
			broj = sc.nextInt();

			if (broj >= 0 && broj <= 99) {
				if (broj < 10)
					j = broj;
				else {
					d = broj / 10;
					bd[d]++;
					j = broj - 10 * d;
				}
				bj[j]++;
			}
		}
		System.out.println("\tCifra\tKao desetica\tkao jedinica");
		for (int i = 0; i <= 9; i++)
			System.out.println("\t" + i + "\t" + bd[i] + "\t" + bj[i]);
		sc.close();
	}

}
