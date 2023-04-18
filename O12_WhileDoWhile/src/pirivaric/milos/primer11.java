package pirivaric.milos;

import java.util.Scanner;

public class primer11 {

	public static void main(String[] args) {
		int n, i = 1;
		double s = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite vrednost n: ");
		n = sc.nextInt();

		do {
			if (i % 2 != 0)
				s += Math.pow(i, 2);
			i++;
		} while (i <= n);
		System.out.println("Za unetu vrednost n = " + n + " dobija se s = " + s);
		sc.close();
	}

}
