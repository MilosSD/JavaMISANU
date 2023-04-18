package pirivatric.milos;

import java.util.Scanner;

public class primer9Zbirnizova {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int r = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int k = sc.nextInt();

		int[][] niz1 = new int[r][k];
		int[][] niz2 = new int[r][k];
		int[][] zbir = new int[r][k];

		System.out.println("Elementi 1. matrice: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print("a[" + i + "," + j + "] = ");
				niz1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi 2. matrice: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print("a[" + i + "," + j + "] = ");
				niz2[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++)
				zbir[i][j] = niz1[i][j] + niz2[i][j];
		}
		System.out.println("Zbir elemenata matrica je: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(zbir[i][j] + " ");
			}
		}
		sc.close();
	}
}
