package UUP;

import java.util.Scanner;

public class primer6pravougaonik {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite vrednost stranice pravouganika a: ");
		int a = input.nextInt();

		System.out.print("Unesite vrednost stranice pravouganika b: ");
		int b = input.nextInt();

		System.out.print("Unesite vrednost stranice pravouganika c: ");
		int c = input.nextInt();

		System.out.print("Unesite vrednost stranice pravouganika d: ");
		int d = input.nextInt();

		boolean p = ((a < c) && (b < d)) || ((a < d) && (b > c));

		System.out.print("p = " + p);

	}

}
