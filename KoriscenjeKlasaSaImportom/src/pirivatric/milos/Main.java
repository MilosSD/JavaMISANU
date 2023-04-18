package pirivatric.milos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double r, a;

		System.out.println("unesite poluprecnik: ");
		r = sc.nextDouble();

		a = 3.14 * r * r;
		System.out.println("poivrsina kruga je: " + a);

	}

}
