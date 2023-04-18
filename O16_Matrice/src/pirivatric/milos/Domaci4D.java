package pirivatric.milos;

import java.util.Scanner;

public class Domaci4D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int r = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int k = sc.nextInt();

		int[][] a = new int[r][k];
		int[][] b = new int[r][k];

		System.out.println("Elementi matrice: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print("a[" + i + "," + j + "] = ");
				a[i][j] = sc.nextInt();
			}
		}

		System.out.print("Unesite vrednost skalara: ");
		int s = sc.nextInt();

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++)
				b[i][j] = a[i][j] * s;
		}
		System.out.println("Proizvod matrice: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(b[i][j] + " ");
			}
		}
		sc.close();
	}
}