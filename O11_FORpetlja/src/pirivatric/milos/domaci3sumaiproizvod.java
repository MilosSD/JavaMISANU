package pirivatric.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class domaci3sumaiproizvod {

	public static void main(String[] args) {
		double s = 0, p = 1.0;

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");

		for (int i = 1; i <= 50; i++)
			for (int j = 1; j <= i; j++) {
				if (j != 3) {
					p = (j + 2 / (j - 3));
					s += p;
				}
			}
		System.out.println("Vrednost sume je: " + df.format(s));
	}

}
