package pirivatric.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class primer14verizni {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");

		double[] a = new double[100];
		double ver, x;

		System.out.println("Unesite broj elemenata niza a: ");
		int n = sc.nextInt();

		System.out.println("Unesite elemente niza a: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextDouble();
		}
		System.out.println("Unesite vrednost promenljive x: ");
		x = sc.nextDouble();

		ver = x;
		for (int i = n; i >= 2; i--)
			ver = x + a[i] / ver;
		ver = a[1] / ver;

		System.out.println("Vrednost veriznog razlomka je " + df.format(ver));
		sc.close();
	}

}
