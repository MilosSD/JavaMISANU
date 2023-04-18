package pirivatric.milos;

import java.util.Scanner;

public class faktorijel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f = 1;
		System.out.println("Unesite zeljeni broj: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			f = f * i;
		}
		System.out.println("Faktorijel unetog broja " + n + " je " + f);
		sc.close();
	}

}
