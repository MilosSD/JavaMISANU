package pirivaric.milos;

import java.util.Scanner;

public class neparni {

	public static void main(String[] args) {
		int i = 1, n;
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite vrednost n : ");
		n = sc.nextInt();

		while (i <= n) {
			if (i % 2 != 0)
				System.out.println(i);
			i++;
		}
		sc.close();
	}

}
