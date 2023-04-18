package zadatak8;

import java.util.Scanner;

public class Suma {

	public static int suma(int a) {
		// int s = 0; // Ne-rekurzivno resenje.
		// while (a > 0) {
		// c = a % 10;
		// s += c;
		// a /= 10; }
		// return s;
		return a == 0 ? 0 : a % 10 + suma(a / 10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj: ");

		int a = sc.nextInt();

		System.out.println("Suma cifara unetog broja je: " + suma(a));

		sc.close();
	}

}
