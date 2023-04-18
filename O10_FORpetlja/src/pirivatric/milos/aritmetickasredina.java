package pirivatric.milos;

import java.util.Scanner;

public class aritmetickasredina {

	public static void main(String[] args) {
		int suma = 0, sredina = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Koliko brojeva zelite da unesete?");

		int x = input.nextInt();

		for (int i = 1; i <= x; i++) {
			System.out.print("unesite " + i + ". broj ");
			int broj = input.nextInt();
			suma = suma + broj;
			sredina = suma / i;
		}
		System.out.println("Aritmeticka sredina unetih brojeva je: " + sredina);

	}

}
