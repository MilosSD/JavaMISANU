package UUP;

import java.util.Scanner;

public class LogickiIzrazi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite vrednost za x: ");

		Boolean x = input.nextBoolean();

		System.out.print("Unesite vrednost za y: ");

		boolean y = input.nextBoolean();

		boolean z = !(x & y) | (x & y);

		System.out.println("z = " + z);

	}
}
