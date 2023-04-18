package pirivatric.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class primer3suma {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		double s = 0, s1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Unseite vrednost n: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			s1 = 0;
			for (int j = 1; j <= n; j++)
				if (j != 3)
					s1 += (j + 3.5) / (j - 3.0);
			s += s1;
		}
		System.out.println("Dobijena vrednost sume je: " + df.format(s));

		sc.close();
	}

}
