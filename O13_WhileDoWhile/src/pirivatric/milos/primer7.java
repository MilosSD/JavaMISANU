package pirivatric.milos;

import java.util.Scanner;

public class primer7 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		int s = 0, p = 1;

		System.out.println("Unesite vrednost n: ");
		int n = ulaz.nextInt();

		int i = 1;
		while (i < n) {
			p *= i;
			if (i % 2 == 0)
				s += p;
			i++;
		}
		System.out.println("Suma s = " + s);
		ulaz.close();
	}
}
