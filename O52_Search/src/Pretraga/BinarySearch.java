package Pretraga;

public class BinarySearch {

	public static int binarySearch(int[] n, int trazVred) {

		int l = 0;
		int h = n.length - 1;

		while (l <= h) {
			int sredina = l + (h - l) / 2;
			int vrednost = n[sredina];
			if (vrednost < trazVred)
				l = sredina + 1;
			else if (vrednost > trazVred)
				h = sredina - 1;
			else
				return sredina;
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
		 * Binary search pronalazi poziciju elementa u sortiranom nizu. Ispituje se
		 * vrednost u sredini niza, i na osnovu nje se odbacuje jedna polovina niza. U
		 * narednom prolazu ponavlja se postupak i ostatak se smanjuje na pola i tako
		 * redom dok se ne dođe do tražene vrednosti.
		 * 
		 * Ovakav način pretrage nije efikasan kod manjih setova podataka, ali je
		 * efikasan kod većih setova podtaka. Mana je u tome što zahteva sortirani niz.
		 */

		int niz[] = new int[1000];

		int trazenaVrednost = 872;

		for (int i = 0; i < niz.length; i++) {
			niz[i] = i;
		}

		int indeks = binarySearch(niz, trazenaVrednost);
		pronadjen(indeks);

		// Klasa Arrays ima svoju ugrađenu binarySearch metodu.
		// indeks = Arrays.binarySearch(niz, trazenaVrednost);

	}

}
