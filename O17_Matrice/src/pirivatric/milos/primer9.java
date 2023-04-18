package pirivatric.milos;

import java.util.Scanner;

public class primer9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj redova: ");
		int r = sc.nextInt();

		System.out.println("Unesite broj kolona: ");
		int k = sc.nextInt();

		int[][] a = new int[r][k];
		int s = 0;

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
				if (a[i][j] < 0)
					s += a[i][j];
			}
			System.out.println();
		}
		System.out.println("Suma elemenata niza koji imaju negativne vrednosti: " + s);
		sc.close();
	}

}
