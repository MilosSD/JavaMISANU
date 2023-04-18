package zadatak1;

public class PutnickoVozilo extends Vozilo {

	double tezinaPutnika;
	int brojPutnika;

	PutnickoVozilo(double tv, double tp, int bp) {
		super(tv);
		this.tezinaPutnika = tp;
		this.brojPutnika = bp;
	}

	public double getTezinaPutnika() {
		return tezinaPutnika;
	}

	public void setTezinaPutnika(double tezinaPutnika) {
		this.tezinaPutnika = tezinaPutnika;
	}

	public int getBrojPutnika() {
		return brojPutnika;
	}

	public void setBrojPutnika(int brojPutnika) {
		this.brojPutnika = brojPutnika;
	}

	public char vrstaVozila() {
		return 'P';
	}

	public double izracunajTezinu() {
		return this.tezina + getBrojPutnika() * getTezinaPutnika();
	}

	public String toString() {
		return super.opis() + " ima broj putnika: " + getBrojPutnika() + " ,prosecne tezine: " + getTezinaPutnika();
	}

}
