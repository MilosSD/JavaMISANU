package pirivatric.milos;

import java.util.Scanner;

public class primer10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj redova: ");
		int r = sc.nextInt();

		System.out.println("Unesite broj kolona: ");
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
				s += a[i][j];
			}
			System.out.println();
		}
		sr = (double) s / (r * k);
		System.out.println("Aritmeticka sredina svih elemenata je: " + sr);
		sc.close();
	}
}
