package test1_MilosPirivatric;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner (System.in);
		DecimalFormat df= new DecimalFormat("#.##");
		
		System.out.print("Unesite duzinu stranice trougla a : ");
		double a = ulaz.nextDouble();
		
		System.out.print("Unesite duzinu stranice trougla b : ");
		double b = ulaz.nextDouble();
		
		System.out.print("Unesite duzinu stranice trougla c : ");
		double c = ulaz.nextDouble();
		
		double s = (a+b+c) / 2;
		double P = Math.sqrt(s*(s-a)* (s-b)* (s-c));
		
		double R = (a*b*c)/(4*P);
		double r = (a*b*c)/(2*R*s);
		
		System.out.println ("Poluprecnik opisanog kruga je: " + df.format(R));
		System.out.println ("Poluprecnik upisanog  kruga je: " + df.format(r));
	}

}
