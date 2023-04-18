package pirivatric.milos;

import java.util.Scanner;

public class vezba10 {
	static double f(double x, double y, double z) {
		return Math.max(x, Math.min(y, z));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite vrednost x: ");
		double x = sc.nextDouble();

		System.out.print("Unesite vrednost y: ");
		double y = sc.nextDouble();

		System.out.print("Unesite vrednost z: ");
		double z = sc.nextDouble();

		System.out.println("Vrednost funkcije f za unete vrednosti x = " + x + ", y = " + y + ",i z = " + z + " je: "
				+ f(x, y, z));
	}

}
