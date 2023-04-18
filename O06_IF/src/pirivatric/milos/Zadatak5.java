package pirivatric.milos;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite godinu: ");

		int x = input.nextInt();

		if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0) {
			System.out.println("Godina je prestupna! ");
		} else {
			System.out.println("Godina nije prestupna! ");
		}
	}

}
