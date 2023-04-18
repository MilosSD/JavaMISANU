package pirivatric.milos;

import java.util.Scanner;

public class primer4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite vrednost za n:");

		int n = sc.nextInt();
		System.out.print("Unesite vrednost za k:");
		int k = sc.nextInt();

		double s = 0;
		int i = 1;
		while (i <= n) {
			s += k * i / Math.pow((2 * i - 1), 2);
			i++;
		}
		System.out.println("Suma s = " + s);

		sc.close();
	}
}
