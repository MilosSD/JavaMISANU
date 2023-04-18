package pirivatric.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class primer15varijansa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");

		double[] x = new double[100];

		System.out.println("Unesite broj elemenata niza x: ");
		int n = sc.nextInt();

		System.out.println("Unesite elemente niza x: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextDouble();
		}
		double xsr = 0;
		for (int i = 1; i <= n; i++) {
			xsr += x[i];
		}
		xsr = xsr / n;
		double v = 0;
		for (int i = 1; i <= n; i++) {
			v += (x[i] - xsr) * (x[i] - xsr);
		}
		v = v / (n - 1);

		System.out.print("V = " + df.format(v));
		sc.close();
	}

}
