package zadatak2;

public class Predmet {

	public double spTezina;
	public char oznaka;

	Predmet() {

	}

	Predmet(char o) {
		this.spTezina = 1;
		this.oznaka = o;
	}

	public double getSpTezina() {
		return spTezina;
	}

	public void setSpTezina(double spTezina) {
		this.spTezina = spTezina;
	}

	public char getOznaka() {
		return oznaka;
	}

	public void setOznaka(char oznaka) {
		this.oznaka = oznaka;
	}

}
