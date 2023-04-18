package pirivatric.milos;

import java.util.Scanner;

public class primer11 {

	public static void main(String[] args) {
		double a, b, c, p = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite vrednost n: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Unesite vrednost stranice a: ");
			a = sc.nextDouble();

			System.out.print("Unesite vrednost stranice b: ");
			b = sc.nextDouble();

			System.out.print("Unesite vrednost stranice c: ");
			c = sc.nextDouble();

			if ((a + b > c) && (b + c > a) && (a + c > b)) {
				p = Math.sqrt((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c)) / 4;

				System.out.println("Povrsina trougla p = " + p);
			} else
				System.out.println("Uneste stranice ne formiraju trougao!");

		}
	}

}
