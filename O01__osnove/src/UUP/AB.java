package UUP;

import java.util.Scanner;

public class AB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite vrednost za a: ");

		double a = input.nextDouble();

		System.out.print("Unesite vrednost za b: ");

		double b = input.nextDouble();

		System.out.println("y = " + (1 - Math.min(a, b)) / (1 + Math.min(a, b)));

		input.close();
	}

}
