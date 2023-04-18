package zadatak1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");

		System.out.println("Unesite vrednosti a, b i c.");
		System.out.print("A = ");
		int a = sc.nextInt();

		System.out.print("B = ");
		int b = sc.nextInt();

		System.out.print("C = ");
		int c = sc.nextInt();

		double f = (double) (a - b) / (c + (a / (c + (b / (c - b)))));
		double g = (double) (a + b + Math.sin(a)) * Math.cos(c);

		System.out.println("f + g = " + df.format((f + g)));
		System.out.println("f - g = " + df.format((f - g)));

		sc.close();
	}

}
