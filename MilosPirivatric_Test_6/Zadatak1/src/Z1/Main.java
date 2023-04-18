package Z1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double r1, r2, h1,h2, pop1, pop2;
		
		System.out.print("Unesite poluprecnik prve kante: ");
		r1=sc.nextDouble();
		System.out.print("Unesite visinu prve kante: ");
		h1=sc.nextDouble();
		System.out.print("Unesite zapreminu kojom je popunjena prva kanta: ");
		pop1=sc.nextDouble();
		
		Kanta k1 = new Kanta(r1, h1, pop1);
		k1.ispitivanje();
		System.out.println();
		

		System.out.print("Unesite poluprecnik druge kante: ");
		r2=sc.nextDouble();
		System.out.print("Unesite visinu druge kante: ");
		h2=sc.nextDouble();
		System.out.print("Unesite zapreminu kojom je popunjena druga kanta: ");
		pop2=sc.nextDouble();
		
		Kanta k2 = new Kanta(r2, h2, pop2);
		k2.ispitivanje();
		System.out.println();
		
		if (k1.prazno()>=0) {
			k1.prespi(k2);
			System.out.println("Prva kanta puna: "+ k1.ispitivanje());
			System.out.println("Druga kanta puna: "+ k2.ispitivanje());
		}
		else if (k2.prazno()>=0) {
			k2.prespi(k1);
			System.out.println("Prva kanta puna: "+ k1.ispitivanje());
			System.out.println("Druga kanta puna: "+ k2.ispitivanje());
		}
		System.out.println();
		System.out.println(k1.opisKante());
		System.out.println(k2.opisKante());
		
		sc.close();

	}

}
