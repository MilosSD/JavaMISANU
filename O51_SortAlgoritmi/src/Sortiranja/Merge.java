package Sortiranja;

public class Merge {

	/*
	 * Merge sort algoritam rekurzivno deli niz u podnizove koji se zasebno
	 * sortiraju, a zatim se spajaju u konačno sortirani niz. Ređanje spajanjem se
	 * temelji na ideji da se iz uređenih podnizova spajanjem efikasno može dobiti
	 * uređeni niz. Algoritam prvo deli nesortirani niz na manje i manje podnizove,
	 * dok svaki ne ostane samo sa jednim elementom, pa je sam po sebi sortiran.
	 * Potom, sledi faza spajanja sortiranih podnizova u veće sortirane podnizove,
	 * dok se na kraju ne kreira potpuno sortirani niz.
	 */

	public static void stampajNiz(int n[]) {
		for (int i : n) {
			System.out.print(i + " ");
		}
	}

	public static void mergeSort(int[] niz) {
		int duzinaNiza = niz.length;

		if (duzinaNiza <= 1) {
			return;
		}
		int sredina = duzinaNiza / 2;
		int[] leviNiz = new int[sredina];
		int[] desniNiz = new int[duzinaNiza - sredina];

		int i = 0;
		int j = 0;

		for (; i < duzinaNiza; i++) {
			if (i < sredina) {
				leviNiz[i] = niz[i];
			} else {
				desniNiz[j] = niz[i];
				j++;
			}
		}
		mergeSort(leviNiz);
		mergeSort(desniNiz);
		merge(leviNiz, desniNiz, niz);
	}

	public static void merge(int[] leviNiz, int[] desniNiz, int[] niz) {

		int leviVelicina = niz.length / 2;
		int desniVelicina = niz.length - leviVelicina;
		int i = 0, l = 0, d = 0;

		while (l < leviVelicina && d < desniVelicina) {
			if (leviNiz[l] < desniNiz[d]) {
				niz[i] = leviNiz[l];
				i++;
				l++;
			} else {
				niz[i] = desniNiz[d];
				i++;
				d++;
			}
		}
		while (l < leviVelicina) {
			niz[i] = leviNiz[l];
			i++;
			l++;
		}
		while (d < desniVelicina) {
			niz[i] = desniNiz[d];
			i++;
			d++;
		}
	}

	public static void main(String[] args) {

		int niz[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

		System.out.println("Neuređeni niz: ");

		stampajNiz(niz);

		mergeSort(niz);

		System.out.println("\nNiz uređen u rastućem poretku: ");

		stampajNiz(niz);

	}

}
