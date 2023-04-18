package pirivatric.milos;

import java.util.Scanner;

public class IspitivanjeVrednosti {

	public static void main(String[] args) {
		/*
		 * Za uneti broj ispitati da li je broj pozitivan, negativan ili je jedanak nuli
		 */

		Scanner input = new Scanner(System.in);

		System.out.print("Unseite vrednost x: ");

		double x = input.nextDouble();

		if (x > 0) {
			System.out.println("Broj je pozitivan. ");
		} else if (x == 0) {
			System.out.println("Uneti broj je 0. ");
		} else {
			System.out.println("Uneti broj je negativan. ");
		}
		input.close();
	}

}
