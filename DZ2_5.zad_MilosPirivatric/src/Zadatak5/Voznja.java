package Zadatak5;

import java.util.ArrayList;
import java.util.List;

public class Voznja {

	int kapacitet = 10;

	List<Etapa> voznja = new ArrayList<Etapa>(kapacitet);

	Voznja(int k) {
		this.kapacitet = k;
	}

	public void dodajEtapu(Etapa e) {
		try {
			voznja.add(e);
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Greška! Kapacitet je dostignut. ");
			e1.printStackTrace();
		}
	}

	public double ukupnaDuzinaVoznje() {
		double ukd = 0.0;
		for (Etapa e : voznja) {
			ukd += e.duzina;
		}
		return ukd;
	}

	public double ukupnoVremeVoznje() {
		double ukv = 0.0;
		for (Etapa e : voznja) {
			ukv += e.izracunajVreme();
		}
		return ukv;
	}

	public double srednjaBrzina() {
		double srb = 0.0;
		for (Etapa e : voznja) {
			srb += e.getBrzina();
		}
		return srb / voznja.size();
	}

}
