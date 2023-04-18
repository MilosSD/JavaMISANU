package pirivatric.milos;

import java.util.Scanner;

public class Kondenzatori {

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

		switch (veza) {
		case 1: {
			ce = c1 * c2 / (c1 + c2);
			System.out.println("Ekvivalentni kapacitet redne veze je: " + ce);
			break;
		}
		case 2: {
			ce = c1 + c2;
			System.out.println("Ekvivalentni kapacitet paralelne veze je: " + ce);
			break;
		}
		default: {
			System.out.println("Niste uneli dozvoljenu vrednost.");
		}
			sc1.close();
		}
	}

}
