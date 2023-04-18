package Igra1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class PogodiBroj {

	public static void unos(int br) throws InputMismatchException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int n = sc.nextInt();

		if (n != br) {
			if (n > br) {
				System.out.println("Uneti broj je veci od trazenog broja. ");
				unos(br);
			} else if (n < br) {
				System.out.println("Uneti broj je manji od trazenog broja. ");
				unos(br);
			}

		} else {
			System.out.println("Uneti broj je trazeni broj! ");
		}

		sc.close();
	}

	public static void main(String[] args) {

		Random broj = new Random();
		int br = broj.nextInt(11);
		unos(br);

	}

}
