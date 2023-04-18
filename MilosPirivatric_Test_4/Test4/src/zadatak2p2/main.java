package zadatak2p2;

import java.util.Scanner;

import zadatak2p1.*;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Da li zelite da kreirate racun sa pocetnom vrednoscu nula (opcija 1) \nili zelite da postavite pocetno stanje na racunu (opcija 2)?");
		int i = sc.nextInt();
		
		if (i == 1) {
			BankAccount b = new BankAccount();
			System.out.print ("Unesite iznos uplate na racun: ");
			double u = sc.nextDouble();
			System.out.println(b.dodajStanje(u));
		} else if (i == 2) {
			System.out.println("Unesite stanje racuna: ");
			double s = sc.nextDouble();
			BankAccount b = new BankAccount (s);
			System.out.print ("Unesite iznos uplate na racun: ");
			double u = sc.nextDouble();
			System.out.println(b.dodajStanje(u));
		} else
			System.out.println("Niste uneli moguci izbor!");
		
		sc.close();

	}

}
