package milos.pirivatric;

import java.util.Scanner;

public class Zadatak4_Milos_Pirivatric {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int br,i=0, s = 0;
		double as = 0.0;
		
		System.out.println("Unesite broj: ");
		br = sc.nextInt();
		
		do {
			s+=br;   // Izracunavanje sume
			i++;	// Brojac
			as= (double)s/i; //Aritmeticka sredina
			System.out.println("Unesite broj: ");
			br = sc.nextInt();
		} while (br !=0); // Uslov
		
		System.out.println("Aritmeticka sredina unetih brojeva je "+as);
		sc.close();
	}

}
