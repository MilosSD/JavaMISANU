package pirivatric.milos;

import java.util.Scanner;

public class primer8suma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = 0, p = 1, n;

		System.out.print("unesite vreddnost za n: ");
		n = sc.nextInt();

		int i = 1;

		while (i <= 3 * n) {
			p *= i;
			if (i % 3 == 0)
				s += p;
			i++;
		}
		System.out.println("Suma s = " + s);
		sc.close();
	}
}