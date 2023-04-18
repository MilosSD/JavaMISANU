package pirivatric.milos;

import java.util.Scanner;

public class primer12aib {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;

		System.out.print("Unesite vrednost a: ");
		a = sc.nextInt();

		System.out.print("Unesite vrednost b: ");
		b = sc.nextInt();

		int i = a;

		while (i <= b) {
			System.out.println(i);
			i *= 4;
		}
		sc.close();

	}

}
