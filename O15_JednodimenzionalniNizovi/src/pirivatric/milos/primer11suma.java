package pirivatric.milos;

import java.util.Scanner;

public class primer11suma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double[] x = new double[100];

		double s = 0;

		System.out.println("Unesite vrednost za n: ");
		int n = sc.nextInt();

		if (n <= 100) {
			for (int i = 1; i <= n; i++) {
				System.out.println(i + ". unos podataka: ");
				System.out.print("a = ");
				a[i] = sc.nextDouble();
				System.out.print("b = ");
				b[i] = sc.nextDouble();
				System.out.print("c = ");
				c[i] = sc.nextDouble();
			}
			for (int i = 1; i <= n; i++) {
				if (a[i] + b[i] > c[i])
					x[i] = a[i] * a[i] + b[i] * b[i] + c[i] * c[i];
				else if (a[i] + b[i] == c[i])
					x[i] = a[i] + 2 * b[i] * c[i];
				else
					x[i] = a[i] + b[i] - c[i];
				s += x[i];
			}
			System.out.println("Zbir " + n + " sabiraka je:\nS = " + s);
		} else
			System.out.println("Uneli ste vrednost vecu od 100! ");
		sc.close();
	}

}
