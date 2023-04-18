package zadatak1;

import java.io.IOException;
import java.util.Scanner;

public class Autmobil {

	String naziv;
	String proizvodjac;
	int godiste;
	double potrosnja;

	void UnetiNazivAutomobila() throws IOException {
		Scanner sc = new Scanner(System.in);

		System.out.println("unesite naziv automobila: ");
		naziv = sc.next();
	}

	void UnetiProizvodjacaAutomobila() throws IOException {
		Scanner sc = new Scanner(System.in);

		System.out.println("unesite naziv proizvodjaca automobila: ");
		proizvodjac = sc.next();
	}

	void UnetiPotrosnju() {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("unesite potrosnju automobila na 100km: ");
				potrosnja = sc.nextDouble();
				break;

			} catch (Exception e) {
				System.out.println("Niste pravilno uneli potrosnju automobila.");
			}
		}
	}

	// Metoda za unos godišta automobila
	void unetiGodisteAutomobila() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Unesite godište automobila: ");
			godiste = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Niste dobro uneli broj");
			unetiGodisteAutomobila();
		}
	}

// Redefinisana metoda
	public String toString() {
		return "Naziv: " + naziv + "\nProizvodjač: " + proizvodjac + "\nGodište: " + godiste + "\nPotrošnja: "
				+ potrosnja;
	}

}
