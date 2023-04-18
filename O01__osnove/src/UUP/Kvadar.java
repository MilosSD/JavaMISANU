package UUP;

import java.util.Scanner;

public class Kvadar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite vrednost stranice a : ");

		double a = input.nextDouble();

		System.out.println("Unesite vrednost stranice b : ");

		double b = input.nextDouble();

		System.out.println("Unesite vrednost stranice c : ");

		double c = input.nextDouble();

		double V = a * b * c;

		double P = 2 * (a * b + a * c + b * c);

		System.out.println("Zapremina kvadra je: " + V + " cm3");
		System.out.println("Povrsina kvadra je: " + P + " cm2");
	}

}
