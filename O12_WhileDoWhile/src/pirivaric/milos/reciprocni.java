package pirivaric.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class reciprocni {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		int n, i = 1;
		double s = 0;

		System.out.print("Unesite vrednost za n: ");
		n = sc.nextInt();

		while (i <= n) {
			s += (double) 1 / i;
			i++;
		}
		System.out.println("Suma reciprocnih vrednosti do " + n + " je " + df.format(s) + ".");
		sc.close();
	}

}
