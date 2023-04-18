package pirivatric.milos;

import java.util.Scanner;

public class vezba8suma {
	static double suma(double[] a, double b[], int k, int m, int n) {
		double s = 0;
		for (int i = 1; i <= k; i++)
			s += Math.pow(a[i], n) * Math.pow(b[i], m);
		return s;
	}

	public static void main(String[] args) {
		double[] x = new double[30];
		double[] y = new double[30];

		Scanner sc = new Scanner(System.in);
		System.out.println(" Unesite dimenziju n nizova: ");
		int n = sc.nextInt();
		System.out.println("Unesite elemente niza x. ");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextDouble();
		}
		System.out.println("Unesite elemente niza y. ");
		for (int i = 1; i <= n; i++) {
			System.out.print("y[" + i + "] = ");
			y[i] = sc.nextDouble();
		}
		double q = (n * suma(x, y, n, 1, 1) - suma(x, y, n, 1, 0) * suma(x, y, n, 0, 1))
				/ Math.sqrt(n * Math.abs(suma(x, y, n, 2, 0) * suma(x, y, n, 0, 2)));

		System.out.println("suma je " + q);
		sc.close();
	}

}
