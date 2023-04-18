package pirivatric.milos;

import java.util.Scanner;

public class primer10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0, y = 0;

		System.out.print("Unesite vrednost n: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Unesite vrednost a: ");
			a = sc.nextDouble();

			if (a > 0) {
				y = Math.sqrt(a);
			} else
				y = Math.pow(a, 2);

			System.out.println("Za unetu vrednost a = " + a + " vrednost funkcije y je: " + y);
		}
		sc.close();
	}

}
