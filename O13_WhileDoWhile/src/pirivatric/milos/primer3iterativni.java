package pirivatric.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class primer3iterativni {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.###");
		Scanner sc = new Scanner(System.in);

		int a, n;
		double xp = 0, xn = 0, eps;

		System.out.println("Unseite vrednost n: ");
		n = sc.nextInt();

		System.out.println("Unesite vrednost a: ");
		a = sc.nextInt();

		System.out.println("Unesite vrednost za epsilon: ");
		eps = sc.nextDouble();

		double x0 = (a + n - 1) / n;
		double x1 = ((n - 1) * x0 + a / Math.pow(x0, n - 1)) / n;

		while (Math.abs(x1 - x0) > eps) {
			x0 = x1;
			x1 = ((n - 1) * x0 + a / Math.pow(x0, n - 1)) / n;
		}
		System.out.println("Dobijena vrednost je x = " + df.format(x1));
		sc.close();
	}
}
