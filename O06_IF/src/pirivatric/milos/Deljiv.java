package pirivatric.milos;

import java.util.Scanner;

public class Deljiv {

	public static void main(String[] args) {
		// Za uneti borj ispitati da li je deljiv brojem 2 i brojem 3
		Scanner input = new Scanner(System.in);

		System.out.print("Unseite vrednost x: ");

		int x = input.nextInt();

		if (x % 2 == 0) {
			System.out.println("Broj je deljiv brojem 2. ");
		} else if (x % 2 != 0) {
			System.out.println("Uneti broj nije deljiv brojem 2. ");
		}
		if (x % 3 == 0) {
			System.out.println("Broj je deljiv brojem 3. ");
		} else {
			System.out.println("Uneti broj nije deljiv brojem 3. ");
		}
		input.close();
	}

}
