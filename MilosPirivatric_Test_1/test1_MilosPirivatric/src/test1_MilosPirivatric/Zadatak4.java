package test1_MilosPirivatric;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner (System.in);
		DecimalFormat df= new DecimalFormat("#.##");
		
		System.out.print("Unesite koordinatu x(a): ");
		double xa = ulaz.nextDouble();
		
		System.out.print("Unesite koordinatu y(a): ");
		double ya = ulaz.nextDouble();
		
		System.out.print("Unesite koordinatu x(b): ");
		double xb = ulaz.nextDouble();
		
		System.out.print("Unesite koordinatu y(b): ");
		double yb = ulaz.nextDouble();
		
		double d = Math.sqrt(Math.pow((xa-xb), 2) + Math.pow((ya-yb),2));

		System.out.print("Rastojanje izmedju zadatih tacaka A i B je: " + df.format(d));
	}

}
