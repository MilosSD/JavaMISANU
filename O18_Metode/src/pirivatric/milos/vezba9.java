package pirivatric.milos;

import java.util.Scanner;

public class vezba9 {
	static double tz(double z) {
		if (z <= 0)
			return z + 2;
		else if (z > 1)
			return z;
		else
			return Math.exp(z);
	}

	public static void main(String[] args) {
		double[] x = new double[100];
		Scanner sc = new Scanner(System.in);

		System.out.print(" Unesite dimenzije n niza x: ");
		int n = sc.nextInt();

		System.out.println(" Unesite elemente niza x: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("X[" + i + "} = ");
			x[i] = sc.nextDouble();
		}
		System.out.println("\tR.Br.\tX\tY");
		for (int i = 1; i <= n; i++) {
			double y = tz(x[i] + 2) + 1.4 * tz(Math.pow(x[i], 2) - 1);
			System.out.println("\t" + i + "\t" + x[i] + "\t" + y);
		}
		sc.close();
	}

}
