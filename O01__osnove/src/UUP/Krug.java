package UUP;

import java.util.Scanner;

public class Krug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite vrednost za a: ");

		double a = input.nextDouble();

		System.out.print("Unesite vrednost za b: ");

		double b = input.nextDouble();

		System.out.print("Unesite vrednost za c: ");

		double c = input.nextDouble();

		double s = (a + b + c) / 2;

		double P = Math.sqrt(s * (s - a) * (s - b) * (s - c));

		double R = (a * b * c) / (4 * P);

		double r = (a * b * c) / (2 * R * s);

		double d = Math.sqrt(R * (R - 2 * r));

		System.out.println("R = " + R + "\tr = " + r + "\td = " + d);
	}
}
