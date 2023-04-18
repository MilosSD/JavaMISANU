package Zadatak5;

import java.util.ArrayList;
import java.util.List;

public abstract class Oblast extends TeritorijalnaJedinica {

	int broj;
	double povrsina;

	public void setPovrsina(double povrsina) {
		this.povrsina = povrsina;
	}

	List<TeritorijalnaJedinica> obl = new ArrayList<TeritorijalnaJedinica>(broj);

	Oblast() {

	}

	Oblast(String naziv, int b) {
		this.naziv = naziv;
		this.broj = b;
	}

	public void dodajJedinicu(TeritorijalnaJedinica t) throws ArrayIndexOutOfBoundsException {
		this.obl.add(t);
	}

	public int ukupanBrStanovnika() {
		int ukBrSt = 0;
		for (TeritorijalnaJedinica t : obl)
			ukBrSt += t.brojStanovnika;
		return ukBrSt;
	}

	public String podOpis() {
		StringBuilder sb = new StringBuilder();
		for (TeritorijalnaJedinica t : obl) {
			sb.append(t.opis());
			sb.append(", ");
		}
		return sb.toString();
	}

	public String opis() {
		return this.naziv + " : " + this.oznaka + " : " + this.ukupanBrStanovnika() + " : " + this.povrsina + " ["
				+ this.podOpis() + "]";
	}

}
