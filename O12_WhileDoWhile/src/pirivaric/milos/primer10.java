package pirivaric.milos;

import java.util.Scanner;

public class primer10 {

	public static void main(String[] args) {
		int i = 1, n;
		double s = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite vrednost za n: ");
		n = sc.nextInt();
		do {
			s += 1 / (double) (2 * i);
			i++;
		} while (i <= n);
		System.out.println("n = " + n + " s = " + s);
		sc.close();
	}
}
