package Zadatak5;

import java.util.ArrayList;
import java.util.List;

public class Okrug extends Oblast {

	int brojOpstina;

	List<Opstina> okr = new ArrayList<Opstina>(brojOpstina);

	Okrug(String naziv) {

		this.naziv = naziv;
		this.oznaka = 'K';
	}

	public double izracunajPovOkruga() {
		double povOblasti = 0;
		for (Opstina o : okr) {
			povOblasti = povOblasti + o.povrsina;
		}
		return povOblasti;
	}
	public int ukupanBrStanovnika () {
		int brStanovnika = 0;
		for (Opstina o : okr) {
			brStanovnika += o.ukupanBrStanovnika();
		}
		return brStanovnika;
	}

	public void dodajJedinicu(Opstina o) throws ArrayIndexOutOfBoundsException {
		this.okr.add(o);
	}
	
	public String podOpis() {
		StringBuilder sb = new StringBuilder();
		for (TeritorijalnaJedinica t : okr) {
			sb.append(t.opis() + ", ");
		}
		String podopis = sb.toString();

		return podopis.substring(0, podopis.length() - 2);
	}

	public String opis() {
		return this.naziv + " : " + this.oznaka + " : " + this.ukupanBrStanovnika() + " : " + this.izracunajPovOkruga() + " ["
				+ this.podOpis() + "] ";
	}
}
