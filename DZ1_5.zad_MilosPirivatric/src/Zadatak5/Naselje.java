package Zadatak5;

public class Naselje extends TeritorijalnaJedinica {

	Naselje(String naziv, int brSt) {
		this.naziv = naziv;
		this.brojStanovnika = brSt;
		this.oznaka = 'N';
	}

	String opis() {
		return this.naziv + " : " + this.oznaka + " : " + this.brojStanovnika;
	}

}
