package pirivaric.milos;

import java.util.Scanner;

public class deljivi {

	public static void main(String[] args) {
		int i = 1, n, a;
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite vrednost n : ");
		n = sc.nextInt();

		System.out.print("Unesite vrednost a : ");
		a = sc.nextInt();

		while (i <= n) {
			if (i % a == 0) {
				System.out.println(i);
			}
			i++;

		}
		sc.close();
	}
}
