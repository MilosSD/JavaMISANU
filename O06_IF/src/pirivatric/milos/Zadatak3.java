package pirivatric.milos;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite vrednost x: ");

		double x = input.nextDouble();
		double y;

		if (x < 0) {
			y = -1;
			System.out.println("vrednost funkcije y je " + y);
		} else if (x == 0) {
			y = 0;
			System.out.println("vrednost funkcije y je " + y);
		} else if (x > 0) {
			y = 1;
			System.out.println("vrednost funkcije y je " + y);
		}

	}

}
