package Sortiranja;

public class HeapSort {

	public static void stampajNiz(int n[]) {
		for (int i : n) {
			System.out.print(i + " ");
		}
	}

	/*
	 * Heap sortiranje je tehnika sortiranja zasnovana na poređenju koja se oslanja
	 * na strukturu podataka binarne hrpe (Binary Heap). Najpre se pronalazi element
	 * minimalne vrednosti i on se postavlja na početnu poziciju. Sličan proces se
	 * ponavlja za sve preostale elemente.
	 * 
	 * prednost: veoma efikasan algoritam sortiranja u poređenju sa drugima. Veoma
	 * efikasno koristi memoriju.
	 * 
	 * 
	 * Najznačajnija razlika među navedenim vrstama algoritama sortiranja je njihova
	 * brzina : 1. najbrži je Heap sort 2. Merge sort 3. Insertion sort 4. Bubble
	 * sort 5. Selection sort
	 */

	static void heapSort(int[] niz) {
		int n = niz.length;

		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(niz, n, i);

		for (int i = n - 1; i > 0; i--) {

			int temp = niz[0];
			niz[0] = niz[i];
			niz[i] = temp;

			heapify(niz, i, 0);
		}
	}

	static void heapify(int niz[], int n, int i) {
		int max = i;
		int l = 2 * i + 1;
		int d = 2 * i + 2;

		if (l < n && niz[l] > niz[max])
			max = l;

		if (d < n && niz[d] > niz[max])
			max = d;

		if (max != i) {
			int zamena = niz[i];
			niz[i] = niz[max];
			niz[max] = zamena;

			heapify(niz, n, max);
		}
	}

	public static void main(String[] args) {

		int niz[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

		System.out.println("Neuređeni niz: ");

		stampajNiz(niz);

		heapSort(niz);

		System.out.println("\nNiz uređen u rastućem poretku: ");

		stampajNiz(niz);

	}

}
