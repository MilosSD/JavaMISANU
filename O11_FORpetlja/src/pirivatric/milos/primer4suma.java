package pirivatric.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class primer4suma {

	public static void main(String[] args) {
		double s = 0;
		DecimalFormat df = new DecimalFormat("#.###");
		Scanner sc = new Scanner(System.in);

		System.out.print("Unseite vrednost za n: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++)

			s += (double) i / (i + 1);

		System.out.println("Dobijena vrednost sume je: " + df.format(s));
		sc.close();
	}

}
