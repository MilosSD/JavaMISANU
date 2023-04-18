package pirivatric.milos;

import java.util.Scanner;

public class Domaci4C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int r = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int k = sc.nextInt();

		int[][] a = new int[r][k];
		int[][] b = new int[r][k];
		int[][] c = new int[r][k];

		System.out.println("Elementi 1. matrice: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print("a[" + i + "," + j + "] = ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi 2. matrice: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print("a[" + i + "," + j + "] = ");
				b[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++)
				c[i][j] = a[i][j] * b[i][j];
		}
		System.out.println("Proizvod elemenata matrica je: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(c[i][j] + " ");
			}
		}
		sc.close();
	}
}