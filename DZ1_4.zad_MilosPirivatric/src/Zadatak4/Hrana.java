package Zadatak4;

public class Hrana extends Namirnica {

	double tezina;
	double udeoBel;
	double udeoMas;
	double udeoUghid;

	Hrana(String i, double t, double ub, double um, double uu) {

		this.ime = i;
		this.tezina = t;

		if (ub + um + uu > 100)
			System.out.println("Greska! Zbir udela belancevina, masti u ugljenih hidrata ne moze biti veci od 100!");
		else

			this.udeoBel = ub;
		this.udeoMas = um;
		this.udeoUghid = uu;
		this.id = (int) (Math.random() * 100);
	}

	public double getTezina() {
		return tezina;
	}

	public double getUdeoBel() {
		return this.tezina / this.udeoBel;
	}

	public double getUdeoMas() {
		return this.tezina / this.udeoMas;
	}

	public double getUdeoUghid() {
		return this.tezina / this.udeoUghid;
	}

	public double izracunajEnergetskuVred() {
		this.eV = this.getUdeoBel() * 16.7 + getUdeoMas() * 37.6 + getUdeoUghid() * 17.2;
		return this.eV;
	}

	public String opis() {
		return super.opis() + "( " + this.tezina + ", " + this.izracunajEnergetskuVred() + " )";
	}

}
