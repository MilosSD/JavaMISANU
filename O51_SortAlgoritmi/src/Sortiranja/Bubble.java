package Sortiranja;

public class Bubble {

	public static void bubbleSortAsc(int niz[]) {
		for (int i = 0; i < niz.length - 1; i++) {
			for (int j = 0; j < niz.length - i - 1; j++) {
				if (niz[j] > niz[j + 1]) {
					int p = niz[j];
					niz[j] = niz[j + 1];
					niz[j + 1] = p;
				}
			}
		}
	}

	public static void bubbleSortDesc(int niz[]) {
		for (int i = 0; i < niz.length - 1; i++) {
			for (int j = 0; j < niz.length - i - 1; j++) {
				if (niz[j] < niz[j + 1]) {
					int p = niz[j];
					niz[j] = niz[j + 1];
					niz[j + 1] = p;
				}
			}
		}
	}

	public static void stampajNiz(int n[]) {
		for (int i : n) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		// Bubble sort metoda omogućava sortiranje elemenata niza po parovima elemenata
		// koji zamenjuju mesta ako nisu u određenom poretku (rastućem ili opadajućem).
		// Proces se ponavlja po jednom za svaki element u nizu.

		// Nije naročito efikasna, može da se upotrebi za manje skupove podataka,
		// nije efikasna kod velikih setova podataka.

		int niz[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

		System.out.println("Neuređeni niz: ");

		stampajNiz(niz);

		bubbleSortAsc(niz);

		System.out.println("\nNiz uređen u rastućem poretku: ");

		stampajNiz(niz);

		bubbleSortDesc(niz);

		System.out.println("\nNiz uređen u opadajućem poretku: ");

		stampajNiz(niz);

	}

}
