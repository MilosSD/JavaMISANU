package Vezba4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite ceo broj: ");
		int broj = sc.nextInt();
		int temp = broj;

		int noviBroj = 0;

		while (temp > 0) {
			int cifra = temp % 10;
			temp = temp / 10;
			noviBroj = noviBroj * 10 + cifra;
		}
		System.out.println("broj:" + broj);
		System.out.println("Novi broj: " + noviBroj);

		if (broj == noviBroj) {
			System.out.println("Uneti broj je palindrom.");
		} else {
			System.out.println("Uneti broj nije palindrom!");
		}
	}

}
