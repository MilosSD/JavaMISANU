package pirivatric.milos;

import java.util.Scanner;

public class primer5sumaikvadrat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int s = 0, kv = 1;

		System.out.println("Unesite broj redova: ");
		int r = sc.nextInt();

		System.out.println("Unesite broj kolona: ");
		int k = sc.nextInt();
		if (r <= 0 || k <= 0) {
			System.out.println("Uneli ste negativne vrednosti! ");
		} else {

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
					kv = a[i][j] * a[i][j];
					s += kv;
				}
				System.out.println();
			}
			System.out.println("Suma kvadrata elemenata niza je: " + s);
			sc.close();
		}
	}

}