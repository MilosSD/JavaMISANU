package pirivatric.milos;

import java.util.Scanner;

public class primer10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] f = new double[1001];

		System.out.println("Unesite broj n: ");
		int n = sc.nextInt();

		f[0] = 0;
		f[1] = 1;

		for (int i = 2; i <= n; i++)
			f[i] = 3 * f[i - 1] - 2 * f[i - 2] + f[i - 1] * f[i - 2];

		System.out.println("F(" + n + ") = " + f[n]);

		sc.close();
	}

}
