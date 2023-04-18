package UUP;

import java.util.Scanner;

public class ZbirCifara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite trocifren broj n: ");

		int n = input.nextInt();

		// Nalazenje cifara trocifrenog broja
		int s = n / 100;
		int d = (n % 100) / 10;
		int j = n % 10;

		// Izracunavanje zbira cifara trocifrenog broja
		int zbir = s + d + j;

		// Stampanje rezultata
		System.out.println("Zbir cifara trocifrenog broja " + n + " je " + zbir);
	}
}