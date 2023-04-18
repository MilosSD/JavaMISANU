package pirivatric.milos;

import java.util.Scanner;

public class IF4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Unseite vrednost x: ");

		int x = input.nextInt();

		if (x % 2 == 0) {
			System.out.println("Uneti broj je paran. ");
		} else
			System.out.println("Uneti broj je neparan. ");
		input.close();
	}

}
