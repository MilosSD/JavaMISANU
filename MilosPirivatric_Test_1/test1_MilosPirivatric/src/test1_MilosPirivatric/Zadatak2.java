package test1_MilosPirivatric;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("#.##");
		double x, y, z, f;
		
		System.out.print("Unesite vrednost promenljive x: ");
		x = ulaz.nextDouble();
		
		System.out.print("Unesite vrednost promenljive y: ");
		y = ulaz.nextDouble();
		
		System.out.print("Unesite vrednost promenljive z: ");
		z = ulaz.nextDouble();
		
		f = ((x - 2*y) / (2*x + y)) * (x+z);
		
		System.out.print ("Vrednost funkcije f je: " + df.format(f));
	}

}
