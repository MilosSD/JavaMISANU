package Zadatak5;

public abstract class Vozilo {

	double tezina;
	String vrsta;

	public double getTezina() {
		return tezina;
	}

	public String getVrsta() {
		return vrsta;
	}

	public String opis() {
		return this.vrsta + " : " + this.tezina;
	}

}
