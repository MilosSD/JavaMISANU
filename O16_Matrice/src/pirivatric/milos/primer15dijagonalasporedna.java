package pirivatric.milos;

import java.util.Scanner;

public class primer15dijagonalasporedna {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int r = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int k = sc.nextInt();

		int[][] niz = new int[r][k];

		System.out.println("Elementi matrice: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print("a[" + i + "," + j + "] = ");
				niz[i][j] = sc.nextInt();
			}
		}
		// ispisivanje elemenata
		System.out.println("Elementi na sporednoj dijagonali su: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++) {
				if (i + j == r - 1)
					System.out.print(niz[i][j] + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
