package Zadatak3;

import java.util.ArrayList;
import java.util.List;

public class Ulica extends Saobracajnica {

	int kapacitet;
	List<StambenaZgrada> ulica = new ArrayList<StambenaZgrada>(kapacitet);

	Ulica(int kapacitet, String ime, double duzina) {
		super(ime, duzina);
		this.kapacitet = kapacitet;
		for (int i = 0; i < this.kapacitet; i++)
			ulica.add(null);
	}

	public int getBrZgrada() {
		return ulica.size();
	}

	public double getUkPovrsina() {
		double pov = 0;
		for (StambenaZgrada z : ulica)
			pov += (z.prosekPov * z.ukupanBrojStanova);

		return pov;
	}

	public void dodajZgradu(int adresa, StambenaZgrada sz) {
		for (StambenaZgrada z : ulica) {
			if (adresa == ulica.indexOf(z)) {
				System.out.println("Greška! Adresa je već zauzeta! ");
				break;
			}
		}
		this.ulica.add(adresa, sz);
	}

	public String opisZgradauUlici() {
		StringBuilder sb = new StringBuilder();
		for (StambenaZgrada sz : ulica) {
			if (sz != null)
				sb.append("( " + sz.opis() + " ), ");
		}
		String podopis = sb.toString();

		return podopis.substring(0, podopis.length() - 2);
	}

	public String opisUlice() {
		return "Ulica : " + this.ime + "( " + this.duzina + " ) : " + this.opisZgradauUlici();
	}
}
