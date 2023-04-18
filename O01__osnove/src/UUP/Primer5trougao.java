package UUP;

import java.util.Scanner;

public class Primer5trougao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite vrednost duzine odsecka x: ");
		int x = input.nextInt();

		System.out.print("Unesite vrendnost duzine odsecka y: ");
		int y = input.nextInt();

		System.out.print("Unesite vrednost duzine odsecka z: ");
		int z = input.nextInt();

		boolean p = (x + y > y) && (x + z > y) && (y + z > x);

		System.out.print("p = " + p);

	}

}
