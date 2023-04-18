package pirivatric.milos;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Unseite vrednost x: ");

		double x = input.nextDouble();
		double y;

		if (x < 0) {
			y = -5;
			System.out.println("vrednost funkcije f je " + y);
		} else if (x >= 0 && x < 1) {
			y = x + 2;
			System.out.println("vrednost funkcije f je " + y);
		} else if (x >= 1 && x < 5) {
			y = 3 * x - 1;
			System.out.println("vrednost funkcije f je " + y);
		} else if (x >= 5) {
			y = 2 * x;
			System.out.println("vrednost funkcije f je " + y);
		}
	}

}
