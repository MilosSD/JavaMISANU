package pirivatric.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class domaci4elasticnost {

	public static void main(String[] args) {
		double l, o = 1.0;
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");

		System.out.println("\tl\tO");

		for (l = 11; l <= 75; l++) {
			o = 1 / (1 - 0.8 * Math.pow((l / 100), 2));

			System.out.println("\t" + l + "\t" + df.format(o));
		}

	}

}
