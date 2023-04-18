package pirivatric.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class primer12 {

	public static void main(String[] args) {
		double[] x = new double[100];
		double eps = 1.0E-5;

		DecimalFormat df = new DecimalFormat("#.###");
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj elemenata niza x : ");
		int n = sc.nextInt();

		System.out.println("Unesite elemente niza x: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextDouble();
		}

		System.out.println("\tI\tX\tS(X(i))");
		for (int i = 1; i <= n; i++) {
			int k = 1;
			double s = (Math.abs(Math.sin(x[i] / k) - Math.pow(Math.cos(x[i]), 2))) / (k * k + 1);

			while (Math.abs(s) <= eps) {
				k++;
				s += (Math.abs(Math.sin(x[i] / k) - Math.pow(Math.cos(x[i]), 2))) / (k * k + 1);
			}
			System.out.println("\t" + i + "\t" + df.format(x[i]) + "\t" + df.format(s));
			sc.close();
		}

	}

}
