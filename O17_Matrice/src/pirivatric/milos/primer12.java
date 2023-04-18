package pirivatric.milos;

import java.util.Scanner;

public class primer12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite broj redova: ");
		int r = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int k = sc.nextInt();

		int[][] a = new int[r][k];
		int s = 0;
		double sr = 0;

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

			}
			System.out.println();
		}
		for (int i = 0; i < r; i++) {
			int sumared = 0, br = 0;
			for (int j = 0; j < k; j++) {
				if (a[i][j] > 0) {
					sumared += a[i][j];
					br++;
				}
			}
			System.out.println("Ar.sred. " + (i + 1) + ". reda iznosi " + (double) sumared / br);
		}
		sc.close();
	}
}
