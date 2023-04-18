package zadatak2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite broj: ");
		double br = input.nextInt();

		Faktorijel f1 = (n) -> {
			double fakt = 1.0;

			for (int i = 1; i <= n; i++)
				fakt = fakt * i;
			return fakt;
		};

		System.out.println("Faktorijel unetog broja je: " + f1.fakt(br));

		input.close();

	}

}
