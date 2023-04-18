package pirivatric.milos;

import java.util.Scanner;

public class Vezba1 {

	public static void main(String[] args) {
		// Učitati dvodimenzionalni niz. Ispisati članove trećeg reda sa neparnim
		// indeksima kolone.
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova matrice: ");
		int r = sc.nextInt();
		System.out.print("Unesite broj kolona matrice: ");
		int k = sc.nextInt();
		int niz[][] = new int[r][k];

		System.out.println("Unesite elemente matrice: ");
		for (int i = 0; i < r; i++)
			for (int j = 0; j < k; j++) {
				System.out.print("a[" + i + "," + j + "] = ");
				niz[i][j] = sc.nextInt();
			}

		System.out.println("Uneti elementi matrice su:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Elementi treceg reda sa neparnim indekosm kolone su: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++) {
				if (i == 2 && (j + 1) % 2 != 0)
					System.out.print(niz[i][j] + " ");
			}
		}
		sc.close();
	}

}
