package UUP;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Funkcija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x, y, z, f;
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite vrednost za x: ");

		x = input.nextDouble();

		System.out.print("Unesite vrednost za y: ");

		y = input.nextDouble();

		System.out.print("Unesite vrednost za z: ");

		z = input.nextDouble();

		f = (x + y) * (x + z) * Math.sin(x) / (2 * x - y);

		System.out.println("Vrednost funkcije f je " + df.format(f));
	}

}
