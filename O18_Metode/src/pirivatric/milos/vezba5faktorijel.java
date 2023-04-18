package pirivatric.milos;

import java.util.Scanner;

public class vezba5faktorijel {
	static int faktorijel(int n) {
		if (n == 0)
			return 1;
		else
			return faktorijel(n - 1) * n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite vrednost celog broja: ");
		int n = sc.nextInt();

		System.out.println("Vrednost faktorijela unetog broja je: " + faktorijel(n));
		sc.close();
	}

}
