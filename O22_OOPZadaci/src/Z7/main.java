package Z7;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int broj;

		System.out.println("Unesite broj: ");
		broj = sc.nextInt();

		Broj b1 = new Broj(broj);

		b1.abs();

		sc.close();
	}
}
