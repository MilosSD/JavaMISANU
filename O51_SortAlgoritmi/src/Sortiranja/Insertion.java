package Sortiranja;

public class Insertion {

	public static void stampajNiz(int n[]) {
		for (int i : n) {
			System.out.print(i + " ");
		}
	}

	/*
	 * Insertion sort algoritam sortira niz tako što jedan po jedan element niza
	 * umeće na odgovarajuće mesto, u do tada sortirani deo niza. Niz se virtuelno
	 * deli na sortirani i nesortirani deo. Vrednost iz nesortiranog dela se uyimaju
	 * i postavljaju na odgovarajuće mesto u sortiranom delu niza.
	 * 
	 * Efikasan za male skupove podataka. Koristi se i kod delimično uređenih
	 * skupova vrednosti.
	 */

	public static void insertionSort(int[] niz) {
		for (int i = 1; i < niz.length; i++) {
			int p = niz[i];
			int j = i - 1;

			while (j >= 0 && niz[j] > p) {
				niz[j + 1] = niz[j];
				j--;
			}
			niz[j + 1] = p;
		}
	}

	public static void main(String args[]) {

		int niz[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

		System.out.println("Neuređeni niz: ");

		stampajNiz(niz);

		insertionSort(niz);

		System.out.println("\nNiz uređen u rastućem poretku: ");

		stampajNiz(niz);

	}
}
