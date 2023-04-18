package pirivatric.milos;

import java.util.Scanner;

public class samoglasnici {

	public static void main(String[] args) {
		char slovo;

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite slovo: ");

		slovo = sc.next().charAt(0);

		switch (slovo) {
		case 'a':
		case 'A': {
			System.out.println("Samoglasnik ");
			break;
		}
		case 'e':
		case 'E': {
			System.out.println("Samoglasnik ");
			break;
		}
		case 'i':
		case 'I': {
			System.out.println("Samoglasnik ");
			break;
		}

		case 'o':
		case 'O': {
			System.out.println("Samoglasnik ");
			break;
		}
		case 'u':
		case 'U': {
			System.out.println("Samoglasnik ");
			break;
		}
		default:
			System.out.println("Suglasnik ");
		}
		sc.close();
	}
}
