package Pretraga;

public class FibonacciSearch {

	public static int min(int x, int y) {
		return (x <= y) ? x : y;
	}

	public static int fibonacciSearch(int niz[], int x) {

		int fibNm2 = 0;
		int fibNm1 = 1;
		int fibM = fibNm2 + fibNm1;

		while (fibM < niz.length) {
			fibNm2 = fibNm1;
			fibNm1 = fibM;
			fibM = fibNm2 + fibNm1;
		}

		int offset = -1;

		while (fibM > 1) {

			int i = min(offset + fibNm2, (niz.length - 1));

			if (niz[i] < x) {
				fibM = fibNm1;
				fibNm1 = fibNm2;
				fibNm2 = fibM - fibNm1;
				offset = i;
			} else if (niz[i] > x) {
				fibM = fibNm2;
				fibNm1 = fibNm1 - fibNm2;
				fibNm2 = fibM - fibNm1;
			} else
				return i;
		}

		if (fibNm1 == 1 && niz[niz.length - 1] == x)
			return niz.length - 1;

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
		 * Metoda koristi Fibonačijeve brojeve da pronađe element u uređenom nizu. Radi
		 * tako što se pronalazi Fibonačijev broj koji je veći ili jednak veličini niza.
		 * Uzimaju se vrednosti prethodna dva Fibonačijeva broja i sa vrednostima koje
		 * se nalaye na poticiji manjeg od njih se upoređuje tražena vrednost, i na taj
		 * način se eliminiše deo niza u zavisnosti da li je tražena vrednost veća ili
		 * manja. Ako je jednaka traženoj vrednosti proces se prekida. Ulogu vodećeg
		 * Fibonačijevog broja preuzima veći od dva prethodna i proces se ponavlja.
		 * Izračunavaju se novi Fibonačijevi brojevi dok se ne suzi izbor na
		 * najpribližniju ili tačnu traženu vrednost. Efikasan sa velikim setovima
		 * podataka, ali zahteva uređeni niz. Sličan binarnoj pretrazi ali ima nešto
		 * kraće vreme pronalaženja elementa.
		 */

		int niz[] = new int[1000];

		int trazenaVrednost = 872;

		for (int i = 0; i < niz.length; i++) {
			niz[i] = i;
		}

		int indeks = fibonacciSearch(niz, trazenaVrednost);

		pronadjen(indeks);
	}

}
