package pirivatric.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class vezba1 {
	static double rastojanje(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner sc = new Scanner(System.in);
		double[] x = new double[100];
		double[] y = new double[100];

		System.out.print("Unesite vrednost za n: ");
		int n = sc.nextInt();

		System.out.println("Unesite vrednost koordinati tacke: ");
		for (int i = 1; i <= n; i++) {
			System.out.println(i + ". tacka ");
			System.out.print("x = ");
			x[i] = sc.nextDouble();
			System.out.print("y = ");
			y[i] = sc.nextDouble();
		}
		System.out.println("\tR.Br.\tX\tY\tRastojanje");

		for (int i = 1; i <= n; i++) {
			System.out.println(
					"\t" + i + "\t" + df.format(x[i]) + "\t" + df.format(y[i]) + "\t" + rastojanje(0, 0, x[i], y[i]));
		}
		sc.close();
	}

}
