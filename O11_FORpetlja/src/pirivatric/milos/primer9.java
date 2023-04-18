package pirivatric.milos;

import java.util.Scanner;

public class primer9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, y;
		System.out.println("Unesite vrednost za n: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Unesite vrednost a: ");
			a = sc.nextDouble();

			System.out.print("Unesite vrednost b: ");
			b = sc.nextDouble();

			if (a >= 0) {
				y = (1 - Math.min(a, b)) / (1 + Math.max(a, b));
			} else {
				y = Math.min(a, b) / (Math.min(a * a, b * b) + 3);
			}
			System.out.println("Za unete vrednosti a: " + a + " i b: " + b + " ,vrednost funkcije y je: " + y);
		}
		sc.close();
	}

}
