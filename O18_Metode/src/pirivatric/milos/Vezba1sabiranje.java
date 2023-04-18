package pirivatric.milos;

import java.util.Scanner;

public class Vezba1sabiranje {

	public static int sab(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite vrednost x: ");
		x = sc.nextInt();

		System.out.println("Unesite vrednost y: ");
		y = sc.nextInt();

		System.out.println("Zbir x i y je " + sab(x, y));
		sc.close();
	}

}
