package pirivatric.milos;

import java.util.Scanner;

public class KondenzatoriIF {

	public static void main(String[] args) {
		int veza;
		double c1, c2, ce;

		Scanner sc1 = new Scanner(System.in);
		System.out.print("Unesite kapacitet prvog kondenzatora: ");
		c1 = sc1.nextDouble();

		System.out.print("Unesite kapacitet drugog kondenzatora: ");
		c2 = sc1.nextDouble();

		System.out.println("Da li su kondenzatori vezani redno (unesite 1) ili paralelno (unesite 2)? ");
		veza = sc1.nextInt();

		if (veza == 1) {
			ce = c1 * c2 / (c1 + c2);
			System.out.println("Ekvivalentni kapacitet redne veze je: " + ce);
		} else if (veza == 2) {
			ce = c1 + c2;
			System.out.println("Ekvivalentni kapacitet paralelene veze je: " + ce);
		} else {
			System.out.println("Niste uneli dozvoljenu vrednost. ");
		}
		sc1.close();
	}
}
