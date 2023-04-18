package UUP;

import java.text.DecimalFormat;
import java.util.Scanner;

public class primer8funkcija {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");

		System.out.print("Unesite vrednost promenljive x: ");
		double x = input.nextDouble();

		System.out.print("Unesite vrednost promenljive y: ");
		double y = input.nextDouble();

		System.out.print("Unesite vrednost promenljive z: ");
		double z = input.nextDouble();

		double f = (x + y) * (x + z) * Math.sin(x) / (2 * x - y);

		System.out.print("F= " + df.format(f));

	}

}
