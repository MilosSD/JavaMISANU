package UUP;

import java.util.Scanner;

public class Pravougaonik {
	public static void main(String[] args) {
		
		//Napisati program kojim se izra?unava dijagonala pravougaonika za unete stranice pravougaonika a i b.

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite vrednost stranice pravougaonika a: ");

		double a = input.nextDouble();
		System.out.println("Unesite vrednost stranice pravougaonika b: ");

		double b = input.nextDouble();
		System.out.println("Dijagonala pravougaonika je: " + Math.sqrt(a * a + b * b));
	}
}
