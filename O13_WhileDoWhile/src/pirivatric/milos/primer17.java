package pirivatric.milos;

import java.util.Scanner;

public class primer17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, cifra, s = 0;
		System.out.print("Unesite ceo broj: ");
		n = sc.nextInt();

		if (n < 0)
			System.out.println("Uneli ste negativan broj.");
		else {
			while (n > 0) {
				cifra = n % 10;
				s += cifra;
				n /= 10;
			}
			System.out.println("Zbir cifara je " + s);
		}
		sc.close();
	}
}
