package pirivatric.milos;

import java.util.Scanner;

public class vezba12 {
	static boolean uslov(int a, int b, int c, int d) {
		return ((a < c) && (b < d) || (a < d) && (b < c));
	}

	public static void main(String[] args) {
		int a, b, n;
		int[] c = new int[100];
		int[] d = new int[100];

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite stranicu a: ");
		a = sc.nextInt();
		System.out.print("Unesite stranicu b: ");
		b = sc.nextInt();
		System.out.println("KOliko novih pravougaonika zelite da unesete? ");
		n = sc.nextInt();

		System.out.println("Unesite stranice c i d:\n");
		for (int i = 1; i < n; i++) {
			System.out.print("c[" + i + "] = ");
			c[i] = sc.nextInt();
			System.out.print("d[" + i + "] = ");
			d[i] = sc.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			if (uslov(a, b, c[i], d[i])) {
				System.out.println("Pravougaonik sa stranicama c = " + c[i] + " i d = " + d[i]
						+ " nalazi se u pravougaoniku stranica a = " + a + " i b = " + b);
			} else
				System.out.println("Pravougaonik sa stranicama c = " + c[i] + " i d = " + d[i]
						+ " ne nalazi se u pravougaoniku stranica a = " + a + " i b = " + b);
		}
		sc.close();
	}
}