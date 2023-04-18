package pirivatric.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class primer13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");

		double[] x = new double[1000];
		double a;

		System.out.print("Unesite vrednost za a: ");
		a = sc.nextDouble();

		if (a > 0) {
			System.out.print("Unesite vrednost broja elemenata niza x : ");
			int n = sc.nextInt();

			System.out.println("Unesite elemente niza x: ");
			for (int i = 1; i <= n; i++) {
				System.out.print("X[" + i + "] = ");
				x[i] = sc.nextDouble();
			}
			double ver = n * Math.sqrt(a);

			for (int i = n - 1; i >= 1; i--) {
				ver = i * Math.sqrt(a) + (x[i] - x[i + 1]) / ver;
			}
			System.out.println("Vrednost veriznog razlomka je " + df.format(ver));

		} else
			System.out.println("Unesite vrednost za a > 0! ");
		sc.close();
	}

}
