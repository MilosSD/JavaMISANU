package UUP;

import java.util.Scanner;

public class Inch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Unesite duzinu dijagonale u incima: ");

		int n = input.nextInt();

		double d = n * 2.54;

		// Stampanje rezultata
		System.out.println("Duzina dijagonale u centimetrima " + d + " cm");
	}
}
