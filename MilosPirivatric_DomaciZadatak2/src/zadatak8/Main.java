package zadatak8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	// Pokušaj da se uradi deo zadatka.
	// Ne razumem zadatak, prevazilazi moje znanje iz matematike.

	public double b1(double[] x, double[] f, int n) {
		double s1 = 0, s2 = 0, s3 = 0, s4 = 0;
		for (int i = 0; i <= n; i++) {
			s1 += Math.log(x[i]);
			s2 += Math.log(f[i]);
			s3 += Math.log(x[i]) * Math.log(f[i]);
			s4 += Math.pow(Math.log(x[i]), 2);
		}

		return (s1 * s2 - n * s3) / (Math.pow(s1, 2) - n * s4);
	}

	public double b0(double[] x, double[] f, int n) {
		double s1 = 0, s2 = 0, s3 = 0, s4 = 0;
		for (int i = 0; i <= n; i++) {
			s1 += Math.log(f[i]);
			s2 += Math.pow(Math.log(x[i]), 2);
		}
		double b1;
		return (s1 - b1(x, f, n) * s2) / n;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df1 = new DecimalFormat("##.#####");
		DecimalFormat df2 = new DecimalFormat("###.####");

		System.out.println("Unesite vrednost n: ");
		int n = sc.nextInt();

		System.out.println("\tX\tY(X)");

		sc.close();
	}

}
