package pirivatric.milos;

import java.util.Scanner;

public class NajveciBroj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		System.out.println("Unesite prvi broj: ");
		int br1 = sc.nextInt();

		System.out.println("Unesite drugi broj: ");
		int br2 = sc.nextInt();

		System.out.println("Unesite treci broj: ");
		int br3 = sc.nextInt();

		if (br1 > br2) {
			if (br1 > br3) {
				max = br1;
			}
		} else if (br2 > br3) {
			max = br2;
		} else {
			max = br3;
		}
		System.out.println("Najveci broj je " + max);
		sc.close();
	}

}
