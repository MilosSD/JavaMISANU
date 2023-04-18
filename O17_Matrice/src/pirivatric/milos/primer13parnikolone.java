package pirivatric.milos;

import java.util.Scanner;

public class primer13parnikolone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int r = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int k = sc.nextInt();

		int[][] a = new int[r][k];

		System.out.println(" Unesite vrednost elementa matrice: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print("a [" + i + "],[" + j + "] = ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi matrice su: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		for (int j = 0; j < k; j++) {
			int sumakol = 0, br = 0;
			for (int i = 0; i < r; i++) {
				if (a[i][j] % 2 == 0) {
					sumakol += a[i][j];
					br++;
				}
			}
			System.out.println("Ar.sred. parnih elemenata " + (j + 1) + ". kolone iznosi " + (double) sumakol / br);
		}
		sc.close();
	}

}
