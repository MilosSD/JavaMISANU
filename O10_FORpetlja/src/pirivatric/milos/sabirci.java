package pirivatric.milos;

import java.util.Scanner;

public class sabirci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		System.out.println("Koliko brojeva zelite da saberete?");

		int sab = input.nextInt();

		int zbir = 0;

		for (int i = 1; i <= sab; i++) {
			System.out.println("unesite " + i + ". broj");
			int sabirak = input.nextInt();
			zbir = zbir + sabirak;
		}

		System.out.println("Zbir brojeva iznosi: " + zbir);
	}

}
