package pirivatric.milos;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Unesite broj elemenata niza: ");
		int n = sc.nextInt();
		int x [] = new int [n];
		
		System.out.println("Unesite vrednost elemenata niza: ");
		for (int i = 0; i<n; i ++) {
			System.out.print("x["+i+"] = ");
			x[i] = sc.nextInt();
		}
		int suma = 0;
		for (int i = 0; i<n; i++) {
			if (x[i]%10==8) {
				suma+=x[i];
			}
		}
		System.out.println("Suma elemenata niza cija je cifra jedinica 8 je: "+suma);
		sc.close();
	}

}
