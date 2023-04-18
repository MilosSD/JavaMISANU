package pirivatric.milos;

import java.util.Scanner;

public class primer7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = 0;

		System.out.println("Unesite broj redova: ");
		int r = sc.nextInt();

		System.out.println("Unesite broj kolona: ");
		int k = sc.nextInt();

		if (k >= 5) {

			int[][] a = new int[r][k];

			System.out.println("Unesite elemente niza: ");
			for (int i = 0; i < r; i++)
				for (int j = 0; j < k; j++) {
					System.out.print("Matrica[" + i + "," + j + "] = ");
					a[i][j] = sc.nextInt();
				}
			System.out.println("Elementi dvodimenzionalnog niza su: ");
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < k; j++) {
					System.out.print(a[i][j] + " ");
					if (j == 4) {
						s += a[i][j];
					}
				}
				System.out.println();
			}
			System.out.println("Zbir elemenata pete kolone je: " + s);
		} else
			System.out.println("Niste uneli dovoljan broj kolona (<5)! ");
		sc.close();
	}

}
