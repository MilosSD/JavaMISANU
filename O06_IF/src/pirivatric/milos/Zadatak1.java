package pirivatric.milos;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int znak;

		System.out.print("Unesite SAMO jedan znak .... ");

		znak = sc.next().charAt(0);
		if (znak >= 'A' && znak <= 'Z') {
			System.out.println("Uneti znak je veliko slovo.");
		} else if (znak >= 'a' && znak <= 'z') {
			System.out.println("Uneti znak je malo slovo.");
		} else if (znak >= '0' && znak <= '9') {
			System.out.println("Uneti znak je cifra.");
		} else {
			System.out.println("Ne znam šta je. Valjda je specijalni znak.");
		}
		sc.close();
	}
}