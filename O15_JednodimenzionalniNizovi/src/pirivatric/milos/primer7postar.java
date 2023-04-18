package pirivatric.milos;

import java.util.Scanner;

public class primer7postar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] parni = new int[100];
		int[] neparni = new int[100];

		int p = 0, n = 0;

		System.out.println("Unesite vrednost za k: ");
		int k = sc.nextInt();

		for (int i = 1; i <= k; i++) {
			int x = sc.nextInt();
			if (x % 2 == 0)
				parni[p++] = x;
			else
				neparni[n++] = x;
		}

		System.out.println("Parni brojevi kuca su: ");
		for (int i = 0; i < p; i++)
			System.out.println(parni[i]);

		System.out.println("Nparni brojevi kuca su: ");
		for (int i = 0; i < n; i++)
			System.out.println(neparni[i]);
		sc.close();
	}

}
