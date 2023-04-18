package pirivatric.milos;

import java.util.Scanner;

public class delivsatri {

	public static void main(String[] args) {
		int a, b;

		Scanner sc = new Scanner(System.in);
		System.out.println("unesite pocetni granicni broj u intervalu: ");
		a = sc.nextInt();

		System.out.println("unesite krajnji granicni broj u intervalu: ");
		b = sc.nextInt();

		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}

	}

}
