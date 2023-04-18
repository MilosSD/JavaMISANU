package UUP1;

import java.util.Scanner;

public class NajveciBroj {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Unesite vrednost za a: ");
		int a = input.nextInt();

		System.out.print("Unesite vrednost za b: ");
		int b = input.nextInt();

		System.out.print("Unesite vrednost za b: ");
		int c = input.nextInt();

		int max = a;

		if (b > max)
			max = b;
		;

		if (c > max)
			max = c;

		System.out.print("Najveći broj je: " + max);

		input.close();
	}
}
