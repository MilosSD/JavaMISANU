package UUP;

import java.util.Scanner;

public class Funkcija2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;

		Scanner input = new Scanner(System.in);

		System.out.print("Unesite vrednost za x: ");

		x = input.nextDouble();

		boolean y = (Math.sqrt(2 + x - Math.pow(x, 3)) / (x + 2) > 0 | Math.exp(x) < x - 1 & Math.sqrt(x - 1) <= 0);

		System.out.println("Vrednost funkcije je :" + y);
	}

}
