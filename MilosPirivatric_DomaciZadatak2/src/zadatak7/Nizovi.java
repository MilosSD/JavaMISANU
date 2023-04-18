package zadatak7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Nizovi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.###");

		System.out.println("Unesite vrednost 2n: ");
		int n2 = sc.nextInt();
		int n = n2 / 2;

		double[] a = new double[100];
		double[] b = new double[100];

		System.out.println("Unesite članove niza A: ");
		for (int i = 1; i <= n2; i++) {
			System.out.print("A[" + i + "]= ");
			a[i] = sc.nextDouble();
		}

		System.out.println("Članovi niza B: ");
		for (int i = 1; i <= n; i++) {
			b[i] = (a[i] + a[n2 + 1 - i]) / 2;
			System.out.println("B[" + i + "]= " + df.format(b[i]));
		}
		sc.close();

	}

}
