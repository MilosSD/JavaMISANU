package zadatak10;

import java.util.Scanner;

public class brojNiz {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		int niz[] = new int[10];

		System.out.println("Unesite 10 brojeva u niz: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print((i + 1) + ". broj: ");
			niz[i] = unos.nextInt();
		}

		System.out.println("Unesite trazeni broj: ");
		int broj = unos.nextInt();
		int brojac = 0;

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == broj)
				brojac++;
		}

		System.out.print("Uneti niz: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}

		if (brojac > 0)
			System.out.println("\nTraženi broj se nalazi u nizu " + brojac + " puta.");
		else
			System.out.println("\nTraženi broj se ne nalazi u nizu. ");
		unos.close();

	}

}
