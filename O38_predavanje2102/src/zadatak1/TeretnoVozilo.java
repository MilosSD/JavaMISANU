package zadatak1;

public class TeretnoVozilo extends Vozilo {

	double tezinaTereta;

	TeretnoVozilo(double tt, double tezina) {
		super(tezina);
		this.tezinaTereta = tt;
	}

	public double getTezinaTereta() {
		return tezinaTereta;
	}

	public void setTezinaTereta(double tezinaTereta) {
		this.tezinaTereta = tezinaTereta;
	}

	public char vrstaVozila() {
		return oznaka = 'T';
	}

	public double izracunajTezinu() {
		return this.tezina + getTezinaTereta();
	}

	public String opis() {
		return "Teretno vozilo oznake: " + vrstaVozila() + "\nima tezinu: " + izracunajTezinu();
	}

}
