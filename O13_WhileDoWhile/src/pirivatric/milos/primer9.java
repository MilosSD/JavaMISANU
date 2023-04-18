package pirivatric.milos;

import java.util.Scanner;

public class primer9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		double s = 0, p = 1, p1 = 1;

		System.out.print("Unesite vrednost za n: ");
		n = sc.nextInt();

		System.out.print("Unesite vrednost za k: ");
		k = sc.nextInt();

		int i = 1;

		while (i <= n) {
			p *= i; // faktorijel broja
			p1 *= k; // stepen broja
			s += p / p1;
			i++;
		}
		System.out.println("Suma s = " + s);
		sc.close();
	}
}
