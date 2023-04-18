package zadatak1;

import java.io.IOException;

public class testAutomobil {

	public static void main(String[] args) throws IOException {

		// Kreiranje objekta klase Automobil Automobil
		Autmobil auto = new Autmobil();
		// Unos podataka o automobilu
		auto.UnetiNazivAutomobila();
		auto.unetiGodisteAutomobila();
		auto.UnetiProizvodjacaAutomobila();
		auto.UnetiPotrosnju();

		// Štampanje podataka o automobilu
		System.out.println("\nUneti podaci o automobilu su: ");
		System.out.println(auto.toString());

	}

}
