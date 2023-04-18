package pirivatric.milos;

import java.util.Scanner;

public class primer8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] a = new int[5][5];
		int s = 0;

		System.out.println("Unesite elemente niza: ");
		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 5; j++) {
				System.out.print("Matrica[" + i + "," + j + "] = ");
				a[i][j] = sc.nextInt();
			}
		System.out.println("Elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + " ");
				if (a[i][j] > 3)
					s += a[i][j];
			}
			System.out.println();
		}
		System.out.println("Suma elemenata vecih od 3 je: " + s);
		sc.close();
	}

}
