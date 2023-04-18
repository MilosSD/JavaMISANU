package pirivatric.milos;

import java.util.Scanner;

public class primer6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];

		System.out.println("Unesite broj trojki stranica n: ");
		n = sc.nextInt();

		System.out.println("Unesite stranice trougla a,b,c: ");
		for (int i = 1; i <= n; i++) {
			System.out.println("Moguce stranice " + i + ". trougla: ");
			System.out.print("a = ");
			a[i] = sc.nextDouble();
			System.out.print("b = ");
			b[i] = sc.nextDouble();
			System.out.print("c = ");
			c[i] = sc.nextDouble();
		}
		System.out.println("\ta\tb\tc\todgovor ");

		for (int i = 1; i <= n; i++) {
			if (a[i] + b[i] > c[i] && Math.abs(a[i] - b[i]) < c[i])
				System.out.println("\t" + a[i] + "\t" + b[i] + "\t" + c[i] + "\t" + "da");
			else
				System.out.println("\t" + a[i] + "\t" + b[i] + "\t" + c[i] + "\t" + "ne");
			sc.close();
		}
	}

}
