package pirivaric.milos;

import java.util.Scanner;

public class primer13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite vrednost e: ");
		double eps = sc.nextDouble();

		System.out.print("Unesite vrednost Xo: ");
		double xo = sc.nextDouble();

		System.out.print("Unesite vrednost Yo: ");
		double yo = sc.nextDouble();

		double x1 = 0.5 * Math.sqrt(xo * (3 * yo - 1) + 1);
		double y1 = Math.sqrt((xo + 3) / 2);

		while (Math.abs(x1 - xo) > eps || Math.abs(y1 - yo) > eps) {
			xo = x1;
			x1 = 0.5 * Math.sqrt(xo * (3 * yo - 1) + 1);
			yo = y1;
			y1 = Math.sqrt((xo + 3) / 2);
		}

		// Štampanje izlaznog rezultata
		System.out.println("Rešenja sistema jednačina su x = " + x1 + " i y = " + y1);
	}

}
