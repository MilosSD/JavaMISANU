package Zadatak5;

public abstract class TeritorijalnaJedinica {

	String naziv;
	char oznaka;
	int brojStanovnika;

	public char getOznaka() {
		return oznaka;
	}

	public void setBrojStanovnika(int brojStanovnika) {
		this.brojStanovnika = brojStanovnika;
	}

	abstract String opis();
}
