package pirivatric.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("#.##");
		
		System.out.print("Unesite broj elemenata niza: ");
		int n = sc.nextInt();
		double x [] = new double [n];
		
		System.out.println("Unesite vrednost elemenata niza: ");
		for (int i = 0; i<n; i ++) {
			System.out.print("x["+i+"] = ");
			x[i] = sc.nextDouble();
		}
		double s1 = 0d, s2 = 0d;
		
		for (int i = 0; i<n; i++) {
			s1+=Math.pow(x[i], 2);
		}
		for (int i = 0; i<n; i++) {
			s2+=x[i];
		}
		double d = Math.sqrt(s1/n - Math.pow((s2/n), 2));
		
		System.out.print("Vrednost standardne devijacije je: "+ df.format(d));
		sc.close();
	}

}
