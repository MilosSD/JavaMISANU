package Zadatak4;

import java.util.ArrayList;
import java.util.List;

public class Niz {

	int kapacitet = 5;

	List<Tacka> niz = new ArrayList<Tacka>(kapacitet);

	Niz() {

	}

	public void dodajTacku(Tacka t) {
		if (this.niz.size() == this.kapacitet) {
			this.kapacitet += 5;
		}
		this.niz.add(t);
	}

	public int getBrojTacaka() {
		return niz.size();
	}

	public String getTackaPrivlacenja(Tacka t) {
		Tacka t1 = niz.get(0);
		double f = t1.privlacnaSila(t);
		String opis = null;

		for (Tacka i : niz) {
			if (i.privlacnaSila(t) > f) {
				f = i.privlacnaSila(t);
				opis = i.opis();
			}
		}
		return opis;
	}

	public String opisNiza() {

		StringBuilder sb = new StringBuilder();
		for (Tacka t : niz)
			sb.append(t.opis() + ", ");

		String podopis = sb.toString();
		String opis = podopis.substring(0, podopis.length() - 2);
		return "[ " + opis + " ]";
	}

}
