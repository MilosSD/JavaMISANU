package pirivatric.milos;

import java.util.Scanner;

public class primer13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, suma = 0;

		System.out.print("Unesite vrednost a: ");
		a = sc.nextInt();

		while (a != 5) {
			if (a % 2 == 0 || a % 7 == 0)
				suma += a;
			System.out.println("Unesite vrednost za a:");
			a = sc.nextInt();
		}
		System.out.println("Zbir učitanih brojeva koji su deljivi sa 2 ili 7 je " + suma);
		sc.close();
	}
}
