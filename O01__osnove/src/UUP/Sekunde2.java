package UUP;

import java.util.Scanner;

public class Sekunde2 {
	public static void main(String[] args) {
		
		//Napisati program koji vreme u?itano u satima, minutima i sekundama izra?unava i pretvara u sekundama.

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite sate: ");
		int s = input.nextInt();

		System.out.println("Unesite minute: ");
		int m = input.nextInt();

		System.out.println("Unesite sekunde: ");
		int sec = input.nextInt();

		System.out.println("Proteklo vreme u sekundama je : " + (s * 3600 + m * 60 + sec));
	}
}
