package pirivatric.milos;

import java.util.Scanner;

public class Zadatak5 {
	
	static double sila (double q1, double q2, double r) {
		double k = 9*Math.pow(10, 9);
		return k*((q1*q2)/Math.pow(r, 2));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Unesite vrednost q1: ");
		double q1 = sc.nextInt();
		
		System.out.print("Unesite vrednost q2: ");
		double q2 = sc.nextInt();
		
		System.out.print("Unesite rastojanje: ");
		double r = sc.nextInt();
		
		System.out.println("Vrednost sile F za unete vrednosti je: "+ sila(q1,q2,r));
		sc.close();
		
	}

}
