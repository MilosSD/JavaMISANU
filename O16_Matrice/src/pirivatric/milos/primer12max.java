package pirivatric.milos;

import java.util.Scanner;

public class primer12max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int r = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int k = sc.nextInt();

		int[][] niz = new int[r][k];
		int m = niz[0][0];

		System.out.println("Elementi matrice: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print("a[" + i + "," + j + "] = ");
				niz[i][j] = sc.nextInt();
				if (niz[i][j] > m) {
					m = niz[i][j];
				}
			}
		}
		System.out.print("Najveca vrednost elementa matrice je: " + m);
		sc.close();
	}

}
