package Igra2;

import java.util.Random;
import java.util.Scanner;

public class Matrica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char matrica[][] = new char[6][6];

		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = '0';
			}
		}

		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}

		try {
			System.out.println("Trazeni simbol se nalazi u kom redu? ");
			int red = sc.nextInt();

			System.out.println("U kojoj koloni? ");
			int kolona = sc.nextInt();

			Random broj = new Random();
			int x = broj.nextInt(7);
			int y = broj.nextInt(7);

			if (red == x && kolona == y) {
				System.out.println("Pogodili ste! ");
				matrica[red][kolona] = 'X';
				for (int i = 0; i < matrica.length; i++) {
					for (int j = 0; j < matrica[i].length; j++) {
						System.out.print(matrica[i][j] + " ");
					}
					System.out.println();
				}
			} else {
				System.out.println("Niste pogodili. Resenje je: ");
				matrica[red][kolona] = 'X';
				matrica[x][y] = 'X';
				for (int i = 0; i < matrica.length; i++) {
					for (int j = 0; j < matrica[i].length; j++) {
						System.out.print(matrica[i][j] + " ");
					}
					System.out.println();
				}
			}
			sc.close();
		} catch (Exception e) {
			System.out.println("Greska pri unosu. Pokusajte ponovo!");
			main(args);
		}
	}

}
