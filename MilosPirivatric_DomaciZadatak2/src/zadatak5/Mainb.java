package zadatak5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Mainb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.###");

		int n, a;
		double e;

		System.out.print("Unesite vrednost n: ");
		n = sc.nextInt();
		System.out.print("Unesite vrednost a: ");
		a = sc.nextInt();
		System.out.print("Unesite vrednost epsilon: ");
		e = sc.nextDouble();

		double x0 = (a + n - 1) / n;
		double x1 = ((n - 1) * x0 + a / Math.pow(x0, n - 1)) / n;

		do {
			x0 = x1;
			x1 = ((n - 1) * x0 + a / Math.pow(x0, n - 1)) / n;
		} while (Math.abs(x1 - x0) > e);

		System.out.println("dobijena vrednost je x = " + df.format(x1));

		sc.close();
	}

}
