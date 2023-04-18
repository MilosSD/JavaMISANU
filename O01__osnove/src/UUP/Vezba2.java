package UUP;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Vezba2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("#.####");

		System.out.print("Unesite vrednost za a: ");

		double a = input.nextDouble();

		System.out.print("Unesite vrednost za b: ");

		double b = input.nextDouble();

		System.out.print("Unesite vrednost za c: ");

		double c = input.nextDouble();

		double f = (a - b) / (c + (a / (c + (b / (c - b)))));

		double g = (a + b + Math.sin(a)) * Math.cos(c);

		System.out.println("Zbir vrednosti f i g je : " + df.format(f + g));

		System.out.println("Razlika vrdnosti f i g je : " + df.format(f - g));

	}

}
