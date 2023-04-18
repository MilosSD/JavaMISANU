package zadatak1p2;

import java.util.Scanner;

import zadatak1p1.Knjiga;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Knjiga k1 = new Knjiga ();
		
		System.out.print ("Unesite naslov knjige: ");
		String nas = sc.nextLine();
		
		System.out.print ("Unesite autora knjige: ");
		String aut = sc.nextLine();
		
		k1.kreirajOpis();
		
		System.out.print ("Unesite cenu knjige: ");
		double c = sc.nextDouble();
		
		System.out.print ("Da li je knjiga na stanju? (true/false) ");
		boolean stanje = sc.nextBoolean();
		
		k1.setNaslov(nas);
		k1.setAutor(aut);
		k1.setCena(c);
		k1.setStanje(stanje);
		
		System.out.println(k1.toString());

	}

}
