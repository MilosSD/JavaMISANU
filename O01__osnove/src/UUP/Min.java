package UUP;

import java.util.Scanner;

public class Min {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a, b;
		int y;

		System.out.println("Unesite vrednost broja a: ");
		a = input.nextInt();

		System.out.println("Unesite vrednost broja b: ");
		b = input.nextInt();

		if (a >= 0)
			y = Math.min(a, b);

		else
			y = 2 * Math.min(a, b);

		System.out.println("y je " + y);

		input.close();
	}

}
