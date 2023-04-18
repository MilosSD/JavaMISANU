package pirivatric.milos;

import java.util.Scanner;

public class primer6 {

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
				if (i == 2)
					s += a[i][j];
			}
			System.out.println();
		}
		System.out.println("Suma elemenata 3. reda je: " + s);

	}

}
