package Sortiranja;

public class Selection {

	public static void stampajNiz(int n[]) {
		for (int i : n) {
			System.out.print(i + " ");
		}
	}

	public static void selectionSortAsc(int[] n) {
		for (int i = 0; i < n.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n.length; j++) {
				if (n[min] > n[j]) {
					min = j;
				}
			}
			int temp = n[i];
			n[i] = n[min];
			n[min] = temp;

		}
	}

	public static void selectionSortDesc(int[] n) {
		for (int i = 0; i < n.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n.length; j++) {
				if (n[min] < n[j]) {
					min = j;
				}
			}
			int temp = n[i];
			n[i] = n[min];
			n[min] = temp;

		}
	}

	public static void main(String[] args) {

		/*
		 * Selection sort metoda omogućava sortiranje elemenata niza tako što prilikom
		 * svake itreacije čuva najmanju vrednost koja je pronađena. Na kraju iteracije
		 * promenljive se zamenjuju. Proces se ponavlja po jednom za svaki element u
		 * nizu.
		 * 
		 * Nije naročito efikasna, može da se upotrebi za manje skupove podataka, nije
		 * efikasna kod velikih setova podataka.
		 */

		int niz[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

		System.out.println("Neuređeni niz: ");

		stampajNiz(niz);

		selectionSortAsc(niz);

		System.out.println("\nNiz uređen u rastućem poretku: ");

		stampajNiz(niz);

		selectionSortDesc(niz);

		System.out.println("\nNiz uređen u opadajućem poretku: ");

		stampajNiz(niz);

	}

}
