package pirivatric.milos;

import java.util.Scanner;

public class Ocenjivanje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Unseite broj bodova: ");

		double x = input.nextDouble();

		if (x >= 0 && x <= 49) {
			System.out.println("Ocena je nedovoljan (1). ");
		} else if (x >= 50 && x <= 60) {
			System.out.println("Ocena je dovoljan (2). ");
		} else if (x >= 61 && x <= 69) {
			System.out.println("Ocena je dobar (3). ");
		} else if (x >= 70 && x <= 80) {
			System.out.println("Ocena je vrlodobar (4). ");
		} else if (x >= 81 && x <= 100) {
			System.out.println("Ocena je odlican (5). ");
		} else {
			System.out.println("Pogresan unos! ");
		}
	}

}
