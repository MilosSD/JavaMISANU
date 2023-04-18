package zadatak3;

import java.util.*;
import java.util.Scanner;

public class KvadratniKoren {
	
	public static double koren (double br) {
		return Math.sqrt(br);
	}

	public static void main(String[] args) throws InputMismatchException,Izuzetak {
		Scanner sc = new Scanner (System.in);
		
		try {
		System.out.println("Unesite broj: ");
		double b = sc.nextDouble();
		
		if (b > 0) {
			System.out.println("Provera broja: " + b);
			System.out.println("Kvadratni koren broja "+ b + " iznosi: "+ koren(b));
		}
		else throw  new Izuzetak ("Kvadratni koren broja: " + b + " se ne moze izracunati.");
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos!");
		}
	}

}
