package pirivatric.milos;

import java.util.Scanner;

public class sedmidan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d1, m1 = 0, g1, limit = 0;
		d1 = 0;
		System.out.print("Unesite dan: ");
		int d = sc.nextInt();

		System.out.print("Unesite mesec: ");
		int m = sc.nextInt();

		System.out.print("Unesite godinu: ");
		int g = sc.nextInt();

		switch (m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			limit = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			limit = 30;
			break;
		case 2:
			if (g % 4 == 0) {
				limit = 29;
			} else
				limit = 28;
			break;
		}
		if (d + 7 > limit) {
			d1 = d + 7 - limit;
			m1 = m + 1;
			g1 = g;

			if (m1 > 12) {
				m1 = 1;
				g1 = g + 1;
			}
		} else {
			d1 = d + 7;
			m1 = m;
			g1 = g;
		}
		System.out.println("Datum koji ce biti za sedam dana je " + d1 + "." + m1 + "." + g1 + ".");
		sc.close();
	}

}
