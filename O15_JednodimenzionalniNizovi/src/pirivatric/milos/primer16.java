package pirivatric.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class primer16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");

		double[] a = new double[100];
		double[] x = new double[100];
		double[] y = new double[100];

		System.out.println("Unesite vrednost n: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(i + ". unos podataka");
			System.out.print("a = ");
			a[i] = sc.nextDouble();
			System.out.print("x = ");
			x[i] = sc.nextDouble();
		}
		y[1] = 0;
		for (int i = 2; i <= n; i++) {
			if (x[i] > 0)
				y[i] = x[i] * a[i];
			else
				y[i] = y[i - 1];
		}
		System.out.println("\tR.Br.\tA\tX\tY");

		for (int i = 1; i <= n; i++)
			System.out.println("\t" + i + "\t" + a[i] + "\t" + x[i] + "\t" + df.format(y[i]));
		sc.close();
	}

}
