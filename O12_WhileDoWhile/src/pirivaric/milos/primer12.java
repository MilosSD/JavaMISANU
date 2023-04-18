package pirivaric.milos;

import java.util.Scanner;

public class primer12 {

	public static void main(String[] args) {
		int k, n, i = 0;
		double s = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite vrednost k: ");
		k = sc.nextInt();

		System.out.print("Unesite vrednost n: ");
		n = sc.nextInt();

		do {
			s = s + 2 / (double) (k + i);
			++i;
		} while (i <= n);

		System.out.println("Suma za uneto k= " + k + " i n= " + n + " je " + s);

	}

}
