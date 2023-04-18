package pirivatric.milos;

import java.util.Scanner;

public class primer2zamena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj redova: ");
		int r = sc.nextInt();

		System.out.println("Unesite broj kolona: ");
		int k = sc.nextInt();

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
			}
			System.out.println();
		}
		System.out.println("Elementi transponovanog niza su: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
	}

}
