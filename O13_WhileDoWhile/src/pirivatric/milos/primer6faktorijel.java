package pirivatric.milos;

import java.util.Scanner;

public class primer6faktorijel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = 0, n, p = 1;

		System.out.print("Unesite vrednost n: ");
		n = sc.nextInt();

		int i = 1;

		while (i <= n) {
			p *= i;
			s += p;
			i++;
		}
		System.out.println("Suma je : " + s);
		sc.close();

	}

}
