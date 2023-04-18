package pirivatric.milos;

import java.util.Scanner;

public class primer5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		double s = 0;

		System.out.print("Unesite vrednost n: ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			s = Math.sqrt(6 + s);
		}
		System.out.println("Dobijena vrednost sume je: " + s);
	}

}
