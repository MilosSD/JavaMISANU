package UUP;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		//Napisati program kojim se za unete vrednosti a i b izra?unava y prema formuli y = 5 + max(a2, b2).

		Scanner input = new Scanner(System.in);

		System.out.print("Unesite vrednost za a: ");

		double a = input.nextDouble();

		System.out.print("Unesite vrednost za b: ");

		double b = input.nextDouble();

		System.out.println("y = " + (5 + Math.max(a * a, b * b)));
	}

}
