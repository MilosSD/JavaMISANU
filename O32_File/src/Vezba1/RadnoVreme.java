package Vezba1;

import java.util.Scanner;

public class RadnoVreme {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite sat: ");
		int sat = input.nextInt();

		System.out.println("Unesite minute: ");
		int minut = input.nextInt();

		if (sat >= 9 && sat < 17) {
			System.out.println("Da");

		} else {

			System.out.println("Ne");
		}

	}

}
