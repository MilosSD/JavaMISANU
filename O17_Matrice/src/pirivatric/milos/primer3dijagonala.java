package pirivatric.milos;

import java.util.Scanner;

public class primer3dijagonala {

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
		System.out.println("Elementi na glavnoj dijagonali i ispod nje su: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++) {
				if (i >= j)
					System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
