package UUP;

import java.util.Scanner;

public class pravougaonik2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
