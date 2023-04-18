package Igra2b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class MatricaB {

	public static void stampajPraznuMatricu(int x) {
		char[][] matrica = new char[x][x];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				matrica[i][j] = '0';
			}
		}

		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int izborTezine() {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int izbor = 0;
		try {
			System.out.println(
					"Izaberite nivo tezine: \nUkucajte 1 za matricu 3x3.\nUkucajte 2 za matricu 5x5.\nUkucajte 3 za matricu 10x10.");
			izbor = Integer.parseInt(bf.readLine());

			if (izbor == 1) {
				stampajPraznuMatricu(3);
				System.out.println("--------------------------");

			} else if (izbor == 2) {
				stampajPraznuMatricu(5);
				System.out.println("--------------------------");

			} else if (izbor == 3) {
				stampajPraznuMatricu(10);
				System.out.println("--------------------------");
			} else {
				System.out.println("Niste uneli odgovarajuci broj. Probajte ponovo");
				izborTezine();

			}
		} catch (Exception e) {
			System.out.println("Greska! ");
			e.printStackTrace();
		}

		return izbor;
	}

	public static boolean pogadjanje(int velicina) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char matrica[][] = new char[velicina][velicina];
		boolean pogodak = false;

		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = '0';
			}
		}

		try {
			System.out.println("Trazeni simbol se nalazi u kom redu? ");
			int red = Integer.parseInt(bf.readLine());

			System.out.println("U kojoj koloni? ");
			int kolona = Integer.parseInt(bf.readLine());

			Random broj = new Random();
			int x = broj.nextInt(velicina);
			int y = broj.nextInt(velicina);

			if (red == x && kolona == y) {
				System.out.println("Pogodili ste! ");
				System.out.println();
				pogodak = true;

				matrica[red][kolona] = 'X';
				for (int i = 0; i < matrica.length; i++) {
					for (int j = 0; j < matrica[i].length; j++) {
						System.out.print(matrica[i][j] + " ");
					}
					System.out.println();
				}
			} else {
				System.out.println("Niste pogodili. Pokusajte ponovo! ");
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println("Greska pri unosu. Pokusajte ponovo!");
		}
		return pogodak;
	}

	public static void main(String[] args) {

		int brojacPokusaja = 0;
		boolean pogodak = false;

		int i = izborTezine();

		do {
			if (i == 1) {
				pogodak = pogadjanje(3);
			} else if (i == 2) {
				pogodak = pogadjanje(5);
			} else if (i == 3) {
				pogodak = pogadjanje(10);

			}
			brojacPokusaja++;
		} while (pogodak == false);

		System.out.println("Broj pokusaja: " + brojacPokusaja);

	}

}
