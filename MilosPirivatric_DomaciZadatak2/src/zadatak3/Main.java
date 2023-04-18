package zadatak3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite vrednost x: ");
		double x = sc.nextDouble();

		double y;

		if (x < 5)
			y = Math.pow((x - 3), 2);
		else if (x >= 5 && x < 8)
			y = x + 2;
		else
			y = x - 1;

		System.out.println("Vrednost funkcije y(x) = " + y);

		sc.close();

	}

}
