package milos.pirivatric;

import java.util.Scanner;

public class Zadatak5_Milos_Pirivatric {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int max = 0;
		
		System.out.println("Unesite prvi broj: ");
		int a = sc.nextInt();
		
		System.out.println("Unesite drugi broj: ");
		int b = sc.nextInt();
		
		System.out.println("Unesite treci broj: ");
		int c = sc.nextInt();
		
		if (a>b) {
			if (a>c)
			max = a;
		} else if (b>c) {
			max = b;
		} else max = c;
		
		System.out.println("Najveci broj je "+ max);
		sc.close();

	}

}
