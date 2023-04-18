package pirivatric.milos;

import java.util.Scanner;

public class primer10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		double s = 0;

		System.out.print("Unesite vrednost za n: ");
		n = sc.nextInt();

		int znak = 1;
		int i = 1;
		while (i <= n) {
			s += znak * i / (double) (i + 1);
			znak = -znak;
			i++;
		}
		System.out.println("Suma s = " + s);
		sc.close();
	}
}
