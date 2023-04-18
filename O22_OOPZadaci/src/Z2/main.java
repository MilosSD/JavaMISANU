package Z2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Osoba o1 = new Osoba();

		System.out.println("unesite ime: ");
		o1.Ime = sc.nextLine();

		System.out.println("unesite datum rodjenja: ");
		o1.DR = sc.nextLine();

		System.out.println("unesite adresu: ");
		o1.Adresa = sc.nextLine();

		System.out.println("Podaci o osobi su: " + "\n" + o1.ispis());

	}

}
