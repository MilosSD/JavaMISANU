package pirivatric.milos;

import java.util.Scanner;

public class mnozenje {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m, n, s = 0;

		System.out.println("Unesite vrednost prvog broja n: ");
		n = sc.nextInt();

		System.out.println("unesite vrednost prvog broja m: ");
		m = sc.nextInt();

		for (int i = 1; i <= m; i++) {
			s += n * (n + i * m);

		}
		System.out.println("vrednost S za unete brojeve n = " + n + " i m = " + m + " je " + s);
		sc.close();
	}

}
