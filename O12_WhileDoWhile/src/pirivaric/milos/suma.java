package pirivaric.milos;

import java.util.Scanner;

public class suma {

	public static void main(String[] args) {
		int i = 1, n, k, suma = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite vrednost n : ");
		n = sc.nextInt();

		System.out.print("Unesite vrednost k : ");
		k = sc.nextInt();

		i = n;
		while (i <= k) {
			suma += i++;
		}
		System.out.println("Od " + n + " do " + k + " suma je " + suma);
	}

}
