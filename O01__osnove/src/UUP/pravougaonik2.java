package UUP;

import java.util.Scanner;

public class pravougaonik2 {

	public static void main(String[] args) {
		/*Napisati program kojim se logi?koj promenljivoj p dodeljuje vrednost true, 
ako se pravougaonik sa stranicama a i b može ceo smestiti u pravougaonik sa stranica*/
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite stranicu trougla a: ");
		int a = input.nextInt();

		System.out.print("Unesite stranicu trougla b: ");
		int b = input.nextInt();

		System.out.print("Unesite stranicu trougla c: ");
		int c = input.nextInt();

		System.out.print("Unesite stranicu trougla d: ");
		int d = input.nextInt();

		boolean p = ((a < c) && (b < d)) || ((a < d) && (b < c));

		System.out.println("p = " + p);
	}

}
