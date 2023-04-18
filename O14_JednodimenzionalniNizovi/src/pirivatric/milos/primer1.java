package pirivatric.milos;

import java.util.Scanner;

public class primer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj elemenata niza: ");
		int n = sc.nextInt();

		// Rezervisanje prostora za niz od n članova
		int x[] = new int[n];

		System.out.println("Unesite članove niza:");

		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextInt();
		}

		// Štampanje članove niza
		for (int i = 0; i < x.length; i++)
			System.out.println(x[i]);
		sc.close();
	}
}