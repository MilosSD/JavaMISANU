package pirivatric.milos;

import java.util.Scanner;

public class primer9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m;
		double[] b = new double[100];
		double[] h = new double[100];
		double[] L = new double[100];

		System.out.println("Unesite broj stapova m : ");
		m = sc.nextInt();

		System.out.println("Unesite dimenzije poprecnog preseka b i h i duzinu stapa L: ");
		for (int i = 1; i <= m; i++) {
			System.out.println(i + ".stap: ");
			System.out.print("b= ");
			b[i] = sc.nextDouble();
			System.out.print("h= ");
			h[i] = sc.nextDouble();
			System.out.print("L= ");
			L[i] = sc.nextDouble();
		}
		System.out.println("\tb\th\tL\tvitkost");

		for (int i = 1; i <= m; i++) {
			double lmin = Math.pow(b[i], 3) * h[i] / 12;
			double f = b[i] * h[i];
			double imin = Math.sqrt(lmin / f);
			double vitkost = L[i] / imin;

			if (vitkost > 50)
				System.out.println("\t" + b[i] + "\t" + h[i] + "\t" + L[i] + "\t" + vitkost);
		}
		sc.close();
	}

}
