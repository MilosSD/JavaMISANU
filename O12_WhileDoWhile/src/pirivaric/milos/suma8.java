package pirivaric.milos;

import java.util.Scanner;

public class suma8 {

	public static void main(String[] args) {
		int i = 1, n, s = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite vrednost n : ");
		n = sc.nextInt();

		while (i <= n) {
			if (i % 10 == 8) {
				System.out.println(i);
				s += i;
			}
			i++;
		}
		System.out.println("Suma je: " + s);

	}

}
