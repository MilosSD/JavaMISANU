package UUP;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.####");

		System.out.print("Unesite visinu u kilogramima: ");

		double h = input.nextDouble();

		System.out.print("Unesite masu: ");

		double m = input.nextDouble();

		double bmi = m / Math.pow(h, 2);

		System.out.print("Indeks BMI je : " + df.format(bmi));
	}

}
