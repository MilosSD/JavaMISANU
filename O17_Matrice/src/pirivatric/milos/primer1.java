package pirivatric.milos;

import java.util.Scanner;

public class primer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj redova: ");
		int r = sc.nextInt();

		System.out.println("Unesite broj kolona: ");
		int k = sc.nextInt();

		int[][] matrica = new int[r][k];

		System.out.println("Unesite elemente niza: ");
		for (int i = 0; i < r; i++)
			for (int j = 0; j < k; j++) {
				System.out.print("Matrica[" + i + "," + j + "] = ");
				matrica[i][j] = sc.nextInt();
			}
		System.out.println("Elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
