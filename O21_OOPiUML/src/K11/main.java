package K11;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite naslov knjige: ");
		String n = sc.nextLine();

		System.out.print("Unesite broj stranica knjige: ");
		int b = sc.nextInt();

		Knjiga a = new Knjiga(n, b);

		System.out.println();

		a.prikaz();

	}

}
