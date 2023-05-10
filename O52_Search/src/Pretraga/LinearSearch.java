package Pretraga;

public class LinearSearch {

	public static int linearSearch(int[] niz, int trazenaVrednost) {

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == trazenaVrednost)
				return i;
		}
		return -1;
	}

	public static void pronadjen(int indeks) {
		if (indeks == -1) {
			System.out.println("Traženi element nije pronađen! ");
		} else
			System.out.println("Element je pronađen na poziciji: " + indeks);
	}

	public static void main(String[] args) {

		/*
		 * Čitaju se vrednosti niza redom i upoređuju sa traženom vrednošću dok se ne
		 * naiđe na traženu vrednost, vraća se indeks pozicije na kojoj se nalazi.
		 * 
		 * Mane: Sporija pretraga za veće setove podataka Prednosti: Setovi podataka ne
		 * moraju biti sortirani. Brzina pretrage je dobra za manje setove podataka.
		 * 
		 */

		int niz[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

		int indeks = linearSearch(niz, 6);

		pronadjen(indeks);

	}

}
