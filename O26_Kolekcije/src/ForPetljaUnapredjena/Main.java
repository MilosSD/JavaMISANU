package ForPetljaUnapredjena;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int niz[] = new int[3];

		// stampanje elementa niza
		/*
		 * System.out.println("Stampanje elemenata niza for petljom: "); for (int i = 0;
		 * i < niz.length; i++) { System.out.println(niz[i]); }
		 */

		System.out.println("Unesite broj: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}

		System.out.println("\nStampanje elemenata niza unapredjenom for petljom: ");
		for (int i : niz)
			System.out.print(i + " ");

	}

}
