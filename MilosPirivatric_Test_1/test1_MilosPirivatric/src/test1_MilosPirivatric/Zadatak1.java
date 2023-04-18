package test1_MilosPirivatric;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner (System.in);
		
		System.out.print("Unesite vrednost promenljive x: ");
		boolean x = ulaz.nextBoolean();
		
		System.out.print("Unesite vrednost promenljive y: ");
		boolean y = ulaz.nextBoolean();
		
		boolean z = !(x|y) & !x|y ;
		
		System.out.print("Vrednost funkcije z je : " + z);

	}

}
