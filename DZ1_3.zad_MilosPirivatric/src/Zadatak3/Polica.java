package Zadatak3;

import java.util.ArrayList;
import java.util.List;

public class Polica {

	public int brMesta;
	public double maxTezina;
	List<Double> p = new ArrayList<Double>();

	Polica(int mesta, double tezina) {
		this.brMesta = mesta;
		this.maxTezina = tezina;
	}

	public void dodajNaMesto(int indeks, double tezina) {
		this.p.add(indeks, tezina);
	}

	public void dodaj(double tezina) {
		this.p.add(tezina);
	}

	public void uzmi(int indeks) {
		this.p.remove(indeks);
	}

	public double pristupi(int indeks) {
		return p.get(indeks);
	}

	public boolean ispitaj() {
		if (this.brMesta > p.size())
			return true;
		else
			return false;
	}

	public int getBrMesta() {
		return brMesta;
	}

	public double getMaxTezina() {
		return maxTezina;
	}

	public int brojPounjenihMesta() {
		return this.p.size();
	}

	public double ukupanTeret() {
		double teret = 0;
		for (double t : p)
			teret = teret + t;
		return teret;
	}

	public double praznoMesto() {
		return this.maxTezina - ukupanTeret();
	}

	public String opis() {
		return "Ukupan broj mesta na polici: " + this.getBrMesta() + "\nMaksimalna tezina: " + this.getMaxTezina()
				+ "\nBroj popunjenih mesta: " + this.brojPounjenihMesta() + "\nUkupan teret: " + this.ukupanTeret()
				+ "\nPrazno mesto: " + this.praznoMesto();
	}

	public void isprazni() {
		this.p.clear();
	}

}
