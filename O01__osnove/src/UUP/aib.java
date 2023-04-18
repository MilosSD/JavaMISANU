package UUP;

import java.util.Scanner;

public class aib {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("UNesite vrednost a: ");
		double a = input.nextDouble();

		System.out.println("UNesite vrednost b: ");
		double b = input.nextDouble();

		double y = (5 + Math.max(a * a, b * b));

		System.out.println("Vrednost funkcije y je " + y);
	}

}
