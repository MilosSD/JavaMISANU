package UUP;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Simetrale {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("#.####");

		System.out.print("Unesite vrednost za a: ");

		double a = input.nextDouble();

		System.out.print("Unesite vrednost za b: ");

		double b = input.nextDouble();

		System.out.print("Unesite vrednost za c: ");

		double c = input.nextDouble();

		double l = (1 / (b + c) * Math.sqrt(b * c / (Math.pow((b + c), 2) - Math.pow(a, 2))));

		double m = (Math.sqrt((2 * (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2))))) / 2;

		System.out.println("Vrednost simetrale ugla iz temena A je : " + df.format(l));
		System.out.println("Vrednost duzine simetrale stranice a je " + df.format(m));

	}

}
