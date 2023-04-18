package Zadatak5;

public class Kamion extends Vozilo {

	double nosivost;
	double tovar;

	Kamion(double tezina, double nosivost) {
		this.vrsta = "kamion";
		this.tezina = tezina;
		this.nosivost = nosivost;
		this.tovar = 0;
	}

	public double ukupnatezina() {
		return this.tezina + tovar;
	}

	public void dodajTovar(double t) {
		if ((this.tovar + t) > nosivost)
			System.out.println("Nije moguce dodati teret: bila bi prekoračena ukupna nosivost!");
		else
			this.tovar += t;
	}

	public void skiniTovar(double t) {
		if ((this.tovar - t) < 0)
			this.tovar = 0;
		this.tovar -= t;
	}

	public String opis() {
		return super.opis() + " Tovar: " + this.tovar;
	}
}
