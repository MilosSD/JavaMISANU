package Zadatak5;

import java.util.ArrayList;
import java.util.List;

public class Opstina extends Oblast {

	double povrsina;
	List<Naselje> ops = new ArrayList<Naselje>(broj);

	Opstina(String naziv, int brojJedinica, double povrsina) {
		super(naziv, brojJedinica);
		this.oznaka = 'O';
		this.povrsina = povrsina;
	}

	public void dodajNaselje(Naselje n) throws ArrayIndexOutOfBoundsException {
		this.ops.add(n);
	}

	public String podOpis() {
		StringBuilder sb = new StringBuilder();
		for (TeritorijalnaJedinica t : ops) {
			sb.append(t.opis() + ", ");
		}
		String podopis = sb.toString();

		return podopis.substring(0, podopis.length() - 2);
	}

	public int ukupanBrStanovnika() {
		int ukBrSt = 0;
		for (Naselje n : ops)
			ukBrSt += n.brojStanovnika;
		return ukBrSt;
	}

	public String opis() {
		return this.naziv + " : " + this.oznaka + " : " + this.ukupanBrStanovnika() + " : " + this.povrsina + " ["
				+ this.podOpis() + "] ";
		// return super.opis() + ":" + this.povrsina + "[" + this.podOpis() + "]";
	}

}
