package Zadatak4;

public class Pice extends Namirnica {

	double kolicina;
	double eVpoL;

	public Pice(String ime, double v, double e) {
		this.ime = ime;
		this.kolicina = v;
		this.eVpoL = e;
		this.id = (int) (Math.random() * 100);
	}

	public double getKolicina() {
		return kolicina;
	}

	public double izracunajEnergetskuVred() {
		this.eV = this.kolicina * this.eVpoL;
		return this.eV;
	}

	public String opis() {
		return super.opis() + "( " + this.kolicina + ", " + this.izracunajEnergetskuVred() + " )";
	}

}
