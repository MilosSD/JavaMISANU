package pirivatric.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class domaci2suma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");

		double s = 0;

		System.out.print("Unesite vrednost za n: ");
		double n = sc.nextDouble();

		for (int i = 1; i <= 50; i++) {
			s = Math.pow(-1, (i - 1)) * (i / (i + 1));
		}
		System.out.println("Za unetu vrednost n = " + n + " dobijena je suma: " + s);
	}

}
