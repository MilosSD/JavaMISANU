package test1_MilosPirivatric;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("#.##");
		
		System.out.print("Unesite duzinu stranice kvadrata a: ");
		double a = ulaz.nextDouble();
		
		double o = a * 4;
		double p = a * a;
		
		System.out.print("Obim kvadrata je: " + o + ", a povrsina kvadrata je: " + p);

	}

}
